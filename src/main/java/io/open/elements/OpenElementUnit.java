package io.open.elements;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class OpenElementUnit extends OpenElementBase {
  // private HashMap<String, OpenElementField> fields;// new HashMap<>();
  private OpenContext context;

  // public void addField(OpenElementField field) {
  //   if(fields==null){
  //     fields=new HashMap<String, OpenElementField>();
  //   }
  //   this.fields.put(field.getName(), field);
  // }

  // public void getField(OpenElementField field) {
  //   fields.put(field.getName(), field);
  // }

  // public void setFieldValue(String name, Object value) {
  //   if(fields==null){
  //     fields=new HashMap<String, OpenElementField>();
  //   }
  //   if (fields.get(name) == null) {
  //     OpenElementField ef = new OpenElementField();
  //     ef.setName(name);
  //     ef.setFieldValue(value);
  //     fields.put(name, ef);
  //   } else {
  //     fields.get(name).setFieldValue(value);
  //   }
  // }

  // public OpenElementField getField(String name) {
  //   return fields.get(name);
  // }

  // public Object getFieldValue(String name) {
  //   return fields.get(name).getFieldValue();
  // }

  // public void setContextBasic(String StatusMessage, String EventName, String EventType, OPENEVENTFLAG eventFlag,
  //     String evtContext) {
  //   OpenEventContextState eventContextState = new OpenEventContextState();
  //   eventContextState.setStatusMessage(StatusMessage);

  //   OpenEventContext eventContext = new OpenEventContext();
  //   // eventContext.setProcessContextState(eventContextState);
  //   eventContext.setEventName(EventName);
  //   eventContext.setEventType(EventType);
  //   eventContext.addEventFlag(eventFlag);
  //   eventContext.setEventContext(evtContext);

  //   OpenContext context = new OpenContext();
  //   context.setContext(eventContext);

  //   this.context = context;
  // }


  // @Override
	// public Object clone() throws CloneNotSupportedException {
	// Object obj= super.clone();
	// OpenElementUnit base= (OpenElementUnit) obj;
	// if(this.getDeepClone()){
	// 	cloneFieldsElements(base);

	// }
	// return base;

	// }


  
	// private void cloneFieldsElements(OpenElementUnit base) throws CloneNotSupportedException {
	// 	base.setFields(null);
	// 	HashMap<String, OpenElementField> hm = new HashMap<String, OpenElementField> ();
  //   this.getFields().keySet().forEach(key->{
  //    OpenElementField chm= new OpenElementField();
  //  OpenElementField  chmold = this.getField(key);
  //     try {
  //       chm=(OpenElementField) chmold.clone();
  //     } catch (CloneNotSupportedException e) {
  //     throw new OpenElementsCommonException("503", "CloneNotSupportedException", e);
  //     }

	// 		hm.put(key, chm);
		
  //   });
	// 	base.setFields(hm);
	// }


}

