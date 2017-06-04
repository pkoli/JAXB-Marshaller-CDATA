# JAXB-CDATA
An implementation to use JAXB Marshaller to add CDATA tags to input if it contains XML.
The approach used JAXB marshaller to marshall into SAX ContentHandler, the content handler's characters method has logic to detect XML in input and if present add CDATA tags around it. I've overriden the com.sun.xml.txw2.output.XMLWriter character method to detect XML, and then the startCDATA and endCDATA methods of XMLWriter class have been used to add CDATA tags.
