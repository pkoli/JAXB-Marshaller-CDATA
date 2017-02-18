package com.project;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by SADANAND KOLI on 18-02-2017.
 */
@XmlRootElement
public class InputXMLAsAString {
    private String inputString;

    public void setInputString(String applicationSchema){
        this.inputString =applicationSchema;
    }

    public String getInputString(){
        return inputString;
    }
}
