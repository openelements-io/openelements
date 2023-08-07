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
public class OpenElementData extends OpenElementCore{
private HashMap<String,Object>   dataValues;
private Object dataValue;

public OpenElementData(String name,HashMap<String,Object>  coreData) {
//	this.coreData=new HashMap<>();
	this.setName(name);
	this.dataValues.put(name, coreData);
}
public OpenElementData(String name) {
	this.dataValues=new HashMap<>();
	this.setName(name);
}

public Object getCoreData(String key) {
	return dataValues.get(key);
} 

 
public void setCoreData(String key,Object coreData) {
	this.dataValues.put(key, coreData);
}
}
