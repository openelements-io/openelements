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
public class OpenElementRel extends OpenElementCore {
private UUID compositerId;
private UUID composeeId;
private UUID componentId;
   
}
