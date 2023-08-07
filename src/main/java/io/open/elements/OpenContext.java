package io.open.elements;

import io.open.elements.execution.process.context.OpenProcessContext;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class OpenContext extends OpenElementUnit{
	
 private OpenProcessContext processContext;

// public OpenProcessContext getProcessContext() {
// 	return processContext;
// }

// public void setProcessContext(OpenProcessContext processContext) {
// 	this.processContext = processContext;
// }

}
