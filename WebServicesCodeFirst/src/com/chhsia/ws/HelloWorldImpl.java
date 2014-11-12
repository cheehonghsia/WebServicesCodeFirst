package com.chhsia.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.chhsia.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		
		return "Hello " + name;
	
	}

	@Override
	public int addTwoNumbers(int input1, int input2) {
	
		return input1 + input2;
		
	}
 
}