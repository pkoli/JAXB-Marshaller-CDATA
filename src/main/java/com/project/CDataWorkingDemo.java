package com.project;

import java.io.IOException;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CDataWorkingDemo {
    public static void main(String[] args) throws IOException {

        ApplicationSchema applicationSchema = new ApplicationSchema();
        applicationSchema.setId(100);
        applicationSchema.setApplicantName("Testing");
        applicationSchema.setAge(29);
        Application application=new Application();
        application.applicationId="123";
        application.name="Pavan";
        applicationSchema.setApplication(application);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ApplicationSchema.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter sw=new StringWriter();
            jaxbMarshaller.marshal(applicationSchema, sw);

            System.out.println(sw.toString());
            sw.close();

            InputXMLAsAString inputXMLAsAString=new InputXMLAsAString();
            inputXMLAsAString.setInputString(sw.toString());


            jaxbContext = JAXBContext.newInstance(InputXMLAsAString.class);
            jaxbMarshaller = jaxbContext.createMarshaller();
            sw=new StringWriter();
            CDataContentHandler cDataContentHandler=new CDataContentHandler(sw,"UTF-8");
            jaxbMarshaller.marshal(inputXMLAsAString, cDataContentHandler);

            System.out.println(sw.toString());
            sw.close();

            //The CDATA is getting added as per the sample request XML
            //We can now use the Spring webservicetemplate to marshallSendAndReceive(inputXMLAsAString);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}