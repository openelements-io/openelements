package io.open.elements.data.extension;

import java.util.UUID;

import io.open.elements.OpenElementBase;

public class OpenExecutionStepDetail extends OpenElementBase {
private UUID compositionRelId;
private String elementType;
private String elelentValueType;
private String valueXrefcId;
private String  valueXrefrId;

private String action;
private String elementIDType;
private String elementValue;


private String valueXrefSrc;
private String  valueXrefKey;

private String stepAttributes;
public UUID getCompositionRelId() {
	return compositionRelId;
}
public void setCompositionRelId(UUID compositionRelId) {
	this.compositionRelId = compositionRelId;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public String getElementIDType() {
	return elementIDType;
}
public void setElementIDType(String elementIdType) {
	this.elementIDType = elementIdType;
}

public String getElementValue() {
	return elementValue;
}

public String getValueXrefSrc() {
	return valueXrefSrc;
}
public void setValueXrefSrc(String valueXrefSrc) {
	this.valueXrefSrc = valueXrefSrc;
}
public String getValueXrefKey() {
	return valueXrefKey;
}
public void setValueXrefKey(String valueXrefKey) {
	this.valueXrefKey = valueXrefKey;
}
public String getStepAttributes() {
	return stepAttributes;
}
public void setStepAttributes(String stepAttributes) {
	this.stepAttributes = stepAttributes;
}
private String elementIDKey;

/*
 * private UUID compositionRelId;
private String action;
private String elementIDType;
private String elementIDKey;
private String value;
private String valueXrefSrc;
private String  valueXrefKey;
private String stepAttributes;
 * 
 * **/

	public String getElementString() {
		StringBuilder sb= new StringBuilder();
		sb.append("<compositionRelId>");
		sb.append(compositionRelId);
		sb.append("</compositionRelId>");
		sb.append("<action>");
		sb.append(action);
		sb.append("</action>");
		sb.append("<elementIDType>");
		sb.append(elementIDType);
		sb.append("</elementIDType>");

		sb.append("<elementType>");
		sb.append(elementType);
		sb.append("</elementType>");

		sb.append("<elementValue>");
		sb.append(elementValue);
		sb.append("</elementValue>");

		sb.append("<valueXrefSrc>");
		sb.append(valueXrefSrc);
		sb.append("</valueXrefSrc>");

		sb.append("<valueXrefKey>");
		sb.append(valueXrefKey);
		sb.append("</valueXrefKey>");

		
		sb.append("<valueXrefrId>");
		sb.append(valueXrefrId);
		sb.append("</valueXrefrId>");

		sb.append("<valueXrefcId>");
		sb.append(valueXrefcId);
		sb.append("</valueXrefcId>");

		
		sb.append("<stepAttributes>");
		sb.append(stepAttributes);
		sb.append("</stepAttributes>");
		return sb.toString();
	}
public String getElementType() {
	return elementType;
}
public void setElementType(String elementType) {
	this.elementType = elementType;
}
public String getElelentValueType() {
	return elelentValueType;
}
public void setElelentValueType(String elelentValueType) {
	this.elelentValueType = elelentValueType;
}
public String getValueXrefcId() {
	return valueXrefcId;
}
public void setValueXrefcId(String valueXrefcId) {
	this.valueXrefcId = valueXrefcId;
}
public String getValueXrefrId() {
	return valueXrefrId;
}
public void setValueXrefrId(String valueXrefrId) {
	this.valueXrefrId = valueXrefrId;
}
public void setElementValue(String elementValue) {
	this.elementValue = elementValue;
}
public String getElementIDKey() {
	return elementIDKey;
}
public void setElementIDKey(String elementIDKey) {
	this.elementIDKey = elementIDKey;
}

}
