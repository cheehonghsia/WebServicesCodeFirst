package com.chhsia.endpoint;
 
import javax.xml.ws.Endpoint;

import com.chhsia.ws.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	   System.out.println("Publishing....");
    }
 
}