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
public class OpenElementDataRange extends OpenElementBase {

private UUID compositionRelId;
private String rangeLowWaterMark;
private String rangeHighWaterMark;
private String valueXrefSrc;
        
}
