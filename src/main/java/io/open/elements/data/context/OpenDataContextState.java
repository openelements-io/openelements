package io.open.elements.data.context;

import java.io.Serializable;

public class OpenDataContextState implements Serializable {
String statusMessage;
Integer statusCode;
Object response;

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
