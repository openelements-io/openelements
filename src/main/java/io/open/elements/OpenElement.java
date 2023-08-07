package io.open.elements;

import java.util.HashMap;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
 @AllArgsConstructor
 @NoArgsConstructor
 @EqualsAndHashCode(callSuper=true)
public class OpenElement extends OpenElementCore{

private OpenElementData data;

// public OpenElement() {
// 	super();
// 	this.data= new OpenElementData();
// }
// public OpenElementData getData() {
// 	return data;
// }
// public void setData(OpenElementData data) {
// 	this.data = data;
// }
 
public void setData(HashMap<String,Object> data) {
	this.data.setDataValues(data);	
}
public void setData(String key,Object data) {
 this.data.setCoreData(key, data);
 
} 
}
