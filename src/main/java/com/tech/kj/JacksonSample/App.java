package com.tech.kj.JacksonSample;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {		        	
    	SimpleModule validationModule = new SimpleModule();
    	validationModule.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                if (deserializer instanceof BeanDeserializer) {
                    return new BeanValidationDeserializer((BeanDeserializer) deserializer);
                }

                return deserializer;
            }
        });
    	
    	
    	ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(validationModule);
        
        String a="{'name':null,'age':10}";
    	JSONObject jsonObject=new JSONObject(a);
    	JSONObject addressJson=new JSONObject();
    	addressJson.put("addressLine2", "vns");
    	//addressJson.put("contactNo", "1234");
    	jsonObject.put("address", addressJson);
    	System.out.println(mapper.readValue(jsonObject.toString(), Person.class));
    	        
    }
}
