package io.open.elements.data.context;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import io.open.elements.OpenContext;
import io.open.elements.event.OPENEVENTFLAG;
import io.open.elements.execution.state.context.OpenStateContextResponse;
 public class OpenDataContext extends OpenContext {
private String name;
private String context;
private String type;
boolean isInitializedForEventProcessing=false;
public OpenDataContext(){
	contextFlags=new  ArrayList<OPENEVENTFLAG>();
	contextData= new HashMap<String,Object>();
}
private OpenDataContextState elementContextState;

private ArrayList<OPENEVENTFLAG> contextFlags;  
private HashMap<String,Object> contextData;
//private StateContextResponse stateContextResponse;
// private HashMap<String,VrushaProcessContext> processContextSpec= new HashMap<String, VrushaProcessContext>();
private OpenStateContextResponse stateContextResponse;

public OpenDataContext(String eventName,String eventContext,String eventType){
	this.name=eventName;
	this.context=eventContext;
	this.type=eventType;
	contextFlags=new  ArrayList<OPENEVENTFLAG>();
	contextData= new HashMap<String,Object>();
}
public String getEventName() {
	return name;
}

public void 	setEventContextData(String key,Object data){
		contextData.put(key, data);
	}
public Object getEventContextData(String key){
return	contextData.get(key);
}
public void setEventName(String eventName) {
	this.name = eventName;
}
public String getEventContext() {
	return context;
}
public void setEventContext(String eventContext) {
	this.context = eventContext;
}
public String getEventType() {
	return type;
}
public void setEventType(String eventType) {
	this.type = eventType;
}

//	public String toStringo() {
//		StringBuilder sb= new StringBuilder();
//		sb.append("<ProcessContext>");
//		sb.append("<eventName>");
//		sb.append(eventName);
//		sb.append("</eventName>");
//		sb.append("<eventType>");
//		sb.append(eventType);
//		sb.append("</eventType>");
//		sb.append("<eventContext>");
//		sb.append(eventContext);
//		sb.append("</eventContext>");
//		sb.append("<eventFlags>");
//		sb.append(eventFlags);
//		sb.append("</eventFlags>");
//		sb.append("<eventContextData>");
//	//	sb.append(eventContext);
//		Set<String> ks = eventContextData.keySet();
//		Iterator<String> ksitr = ks.iterator();
//		while (ksitr.hasNext()) {
//			String string = (String) ksitr.next();
//			sb.append("<"+string+">");
//			sb.append(eventContextData.get(string));
//			sb.append("</"+string+">");}
//		sb.append("</eventContextData>");
//		sb.append("<iaResponse>");
//		sb.append(iaResponse);
//		sb.append("</iaResponse>");
//		sb.append("</ProcessContext>");
//		return sb.toString();
//	}
public OpenStateContextResponse getStateContextResponse() {
	return stateContextResponse;
}
public void setStateContextResponse(OpenStateContextResponse stateContextResponse) {
	this.stateContextResponse = stateContextResponse;
}
public ArrayList<OPENEVENTFLAG> getEventFlags() {
	return contextFlags;
}
public void setEventFlags(ArrayList<OPENEVENTFLAG> eventFlags) {
	
	this.contextFlags = eventFlags;
	this.isInitializedForEventProcessing=true;
}
public void addEventFlag(OPENEVENTFLAG eventFlag){
		contextFlags.add(eventFlag);
		this.isInitializedForEventProcessing=true;
	}

public boolean checkEventFlag(OPENEVENTFLAG eventFlag){
		
return	contextFlags.contains(eventFlag);
}
public boolean isInitializedForEventProcessing() {
	return isInitializedForEventProcessing;
}

public void setProcessContextState(OpenDataContextState elementContextState) {
	this.elementContextState = elementContextState;
}
//public StateContextResponse getStateContextResponse() {
//return stateContextResponse;
//}
//public void setStateContextResponse(StateContextResponse stateContextResponse) {
//this.stateContextResponse = stateContextResponse;
//}

}
