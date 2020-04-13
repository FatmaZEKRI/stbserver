package fr.univ.rouen.stbserver.util;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.WebServiceContext;

import org.xml.sax.SAXException;

import fr.univ.rouen.stbserver.model.STB;
import fr.univ.rouen.stbserver.model.Stbs;

public class TransformXML {
	private JAXBContext jc;
	@javax.annotation.Resource(type = Object.class)
	protected WebServiceContext wsContext;
	public TransformXML() {
	try {
		jc=JAXBContext.newInstance(STB.class, Stbs.class);
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public String marshalStb(STB stb) {
		try {
        Marshaller jaxbMarshaller = jc.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(stb, sw);
        return sw.toString();

    } 
		catch (Exception e) {
			throw new IllegalStateException(e);
		}
}
	public String marshalStbs(Stbs stbs) {
		try {
        Marshaller jaxbMarshaller = jc.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(stbs, sw);
        return sw.toString();

    } 
		catch (Exception e) {
			throw new IllegalStateException(e);
		}
}
	public STB unmarshalStb(Source source) throws JAXBException {
		return (STB)this.jc.createUnmarshaller().unmarshal(source);
		
	}
 public String Validatemarshall(STB stb) throws JAXBException {
	  try
      {
        
          //Create marshaller
          Marshaller marshaller = jc.createMarshaller();
           
          //Setup schema validator
          SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
          Schema stbSchema = sf.newSchema(new File("src/main/resources/stb20.tp1.01.xsd"));
          marshaller.setSchema(stbSchema);
          StringWriter sw = new StringWriter();
          //marshal xml file 
          marshaller.marshal(stb,sw);
           
          return  sw.toString();
      }
      catch (JAXBException | SAXException e) 
      {
          e.printStackTrace();
          return  e.getMessage();
      }
 
}
}