package io.open.elements.execution.process.context;


import java.util.ArrayList;
import java.util.HashMap;
import io.open.elements.OpenContext;
import io.open.elements.event.OPENEVENTFLAG;
import io.open.elements.execution.state.context.OpenStateContextResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 @EqualsAndHashCode(callSuper=true)
public class OpenProcessContext extends OpenContext {
private String contextvalue;
boolean isInitializedForEventProcessing=false;
// public OpenProcessContext(){
// 	contextFlags=new  ArrayList<OPENEVENTFLAG>();
// 	contextData= new HashMap<String,Object>();
// }
private OpenProcessContextState processContextState;

private ArrayList<OPENEVENTFLAG> contextFlags;  
private HashMap<String,Object> contextData;
//private StateContextResponse stateContextResponse;
private HashMap<String,OpenProcessContext> processContextSpec= new HashMap<String, OpenProcessContext>();
private OpenStateContextResponse stateContextResponse;

// public OpenProcessContext(String eventName,String eventContext,String eventType){
// 	this.setName(eventName);
// 	this.context=eventContext;
// 	this.setType(eventType);
// 	contextFlags=new  ArrayList<OPENEVENTFLAG>();
// 	contextData= new HashMap<String,Object>();
// }
public String getEventName() {
	return this.getName();
}

public void 	setEventContextData(String key,Object data){
		contextData.put(key, data);
	}
public Object getEventContextData(String key){
return	contextData.get(key);
}

// public void setEventFlags(ArrayList<OPENEVENTFLAG> eventFlags) {
	
// 	this.contextFlags = eventFlags;
// 	this.isInitializedForEventProcessing=true;
// }
public void addEventFlag(OPENEVENTFLAG eventFlag){
		contextFlags.add(eventFlag);
		this.isInitializedForEventProcessing=true;
	}

public boolean checkEventFlag(OPENEVENTFLAG eventFlag){
		
return	contextFlags.contains(eventFlag);
}


public OpenProcessContext getProcessContextSpec(String key) {
	return processContextSpec.get(key);
}
public void setProcessContextSpec(String key,OpenProcessContext repc) {
	this.processContextSpec.put(key, repc);
}
// public VrushaProcessContextState getProcessContextState() {
// 	return processContextState;
// }
// public void setProcessContextState(VrushaProcessContextState processContextState) {
// 	this.processContextState = processContextState;
// }
//public StateContextResponse getStateContextResponse() {
//return stateContextResponse;
//}
//public void setStateContextResponse(StateContextResponse stateContextResponse) {
//this.stateContextResponse = stateContextResponse;
//}
// public OpenProcessContext getCloned(boolean deepclone) {
// 	OpenProcessContext pc= new OpenProcessContext(this.getEventName(),this.getEventContext(),this.getEventType());
// 	if (deepclone){
// 		ArrayList<OPENEVENTFLAG> al = this.getEventFlags();
// 		ArrayList<OPENEVENTFLAG> al1= new ArrayList<OPENEVENTFLAG>();
// 		Iterator<OPENEVENTFLAG> alitr = al.iterator();
// 		while (alitr.hasNext()) {
// 			OPENEVENTFLAG eventflag = (OPENEVENTFLAG) alitr.next();
// 			al1.add(OPENEVENTFLAG.valueOf(eventflag.name()));
// 		}
// 	pc.setEventFlags(al1);
	
// 	}
// 	return pc;
// }

}
