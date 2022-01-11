package com.gino.operator.impl;
import javax.xml.ws.Endpoint;
public class SOAPPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/compute", new OperatorServiceImpl());
	}

}
