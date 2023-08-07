package io.open.elements.execution.process.context;

import java.io.Serializable;

public class OpenProcessContextState implements Serializable {
String statusMessage;
Integer statusCode;
Object response;
public String getStatusMessage() {
	return statusMessage;
}
public void setStatusMessage(String statusMessage) {
	this.statusMessage = statusMessage;
}
public Integer getStatusCode() {
	return statusCode;
}
public void setStatusCode(Integer statusCode) {
	this.statusCode = statusCode;
}

public Object getResponse() {
	return response;
}
public void setResponse(Object response) {
	this.response = response;
}
 
//@Override
//	public String toString() {
//		StringBuilder sb= new StringBuilder();
//		sb.append("<"+this.getClass().getSimpleName()+">");
//	sb.append("<statusMessage>");
//	sb.append(statusMessage);
//	sb.append("</statusMessage>");
//	sb.append("<statusCode>");
//	sb.append(statusCode);
//	sb.append("</statusCode>");
//	sb.append("<response>");
//	sb.append(response);
//	sb.append("</response>");
//	
//		sb.append("</"+this.getClass().getSimpleName()+">");
//			return sb.toString();
//	}
}
