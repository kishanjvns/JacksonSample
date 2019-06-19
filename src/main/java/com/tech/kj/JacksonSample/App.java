package com.tech.kj.JacksonSample;

import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
    	String data="{'name':null,'age':10}";
    	JSONObject jsonObject=new JSONObject(data);
    	ObjectMapper mapper=new ObjectMapper();
    	mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
    	JsonOperation jsonOperation= mapper.readValue(jsonObject.toString(), JsonOperation.class);
    	System.out.println(jsonOperation);
    }
}
