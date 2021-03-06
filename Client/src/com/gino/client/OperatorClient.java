package com.gino.client;

import java.net.URL;
import java.net.MalformedURLException;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.gino.operator.fx.OperatorService;

public class OperatorClient {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://localhost:8080/compute?wsdl");
		QName qname=new QName("http://impl.operator.gino.com/","OperatorServiceImplService");
		Service service=Service.create(url, qname);
		
		OperatorService operator=service.getPort(OperatorService.class);
		System.out.println("Exercise 5 by Gino Araullo\n");
		System.out.println("User Currently Logged-On: " + System.getProperty("user.name"));
		System.out.println("The Sum of 2 and 5 is " + operator.getSum(2,5));
		System.out.println("The Difference of 9 and 4 is " + operator.getDifference(9, 4));
		System.out.println("The Product of 2 and 8 is " + operator.getProduct(2, 8));
		System.out.println("The Quotient of 12 and 3 is " + operator.getQuotient(12, 3));
	}

}
