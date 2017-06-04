# JAXB-CDATA
An implementation to use JAXB Marshaller to add CDATA tags if XML is contained inside XML tags.
The approach uses JAXB marshaller to marshall into SAX ContentHandler, the content handler's characters method has logic to detect XML and if present add CDATA tags around it. I've overriden the com.sun.xml.txw2.output.XMLWriter character method to detect XML, and then the startCDATA and endCDATA methods of XMLWriter class have been used to add CDATA tags.
