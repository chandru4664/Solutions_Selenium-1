package com.htc.ariweek1;

public class IPException extends Exception{
	
String exceptionMessage ="";

public IPException(String exceptionMessage) {
	super();
	this.exceptionMessage = exceptionMessage;
}

@Override
public String toString() {
	return "IPException [exceptionMessage=" + exceptionMessage + "]";
}




}
