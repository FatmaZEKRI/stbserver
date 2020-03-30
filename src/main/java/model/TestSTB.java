package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;



public class TestSTB {
	public String loadFileXML() throws IOException {
		StringBuilder message = new StringBuilder();
		Resource resource = new DefaultResourceLoader().getResource("classpath:/smallSTB.xml");
	          InputStream is = resource.getInputStream();
	          BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        	
	          String line;
	          while ((line = br.readLine()) != null) {
	     	     message.append(line);
	          } 
	          br.close();
		return message.toString();
		
	}

}
