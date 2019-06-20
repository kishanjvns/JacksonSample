package com.tech.kj.JacksonSample;

import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestBeanValidation {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String a="{'name':null,'age':10}";
    	JSONObject jsonObject=new JSONObject(a);
    	JSONObject addressJson=new JSONObject();
    	addressJson.put("addressLine2", "vns");
    	//addressJson.put("contactNo", "1234");
    	jsonObject.put("address", addressJson);
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Person foo = mapper.readValue(jsonObject.toString(), Person.class);
    	
    	

	}

}
