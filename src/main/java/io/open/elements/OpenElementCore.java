package io.open.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class OpenElementCore extends OpenElementUnit{
    private OpenElementSchema schema;
    private OpenElementMetadata metaData;
    
     
    public void loadMetadataValue(String name,String value)
    {
        metaData.setFieldValue( name,value);	
    }
    
}
