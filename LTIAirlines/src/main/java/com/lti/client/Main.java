package com.lti.client;

import com.lti.model.Flight;

public class Main {
	public static void main(String[] args) {
	Flight f=new Flight(1001,"Chennai","Pune");
	System.out.println(f.getFlightId()+" "+f.getSource()+" "+f.getDestination());
	//test data
	int num1=10;
	int num2=10;
	if(add(num1,num2)==20) {
		System.out.println("Test passed");
	}
	else {
		System.out.println("Test failed");
	}

}
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static boolean compare(int n1,int n2) {
		if(n1==n2) {
			return true;
		}
		else {
			return false;
		}
	}
}