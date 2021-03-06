package com.gino.client2;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.gino.operator.fx.OperatorService;


public class Client2 {

	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://localhost:8080/compute?wsdl");
		QName qname=new QName("http://impl.operator.gino.com/","OperatorServiceImplService");
		Service service=Service.create(url, qname);
		
		OperatorService operator=service.getPort(OperatorService.class);
		System.out.println(operator.getProduct(2,5));
	}

}
