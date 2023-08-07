package io.open.elements;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @EqualsAndHashCode(callSuper=true)
public class OpenElementVersion extends OpenElementCore {
private UUID componentId;
private Integer versionNo;
private String versionState;   
}
