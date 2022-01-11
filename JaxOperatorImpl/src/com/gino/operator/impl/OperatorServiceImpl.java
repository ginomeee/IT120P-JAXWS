package com.gino.operator.impl;

import javax.jws.WebService;

import com.gino.operator.fx.*;

@WebService (endpointInterface="com.gino.operator.fx.OperatorService")
	
public class OperatorServiceImpl implements OperatorService{
	@Override
	public double getSum(double x, double y) {
		return x+y;
		
	}
	
	@Override
	public double getProduct(double x,double y) {
		return x*y;
	}
	
	@Override
	public double getDifference(double x,double y) {
		return x-y;
	}
	
	@Override
	public double getQuotient(double x,double y) {
		return x/y;
	}
}
