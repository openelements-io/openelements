package io.open.elements;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/** this are set of attributes reuse setting the details of the same of fields which are inherited from <code>ZEUnit</code>. 
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class OpenElementMetadata extends OpenElementUnit{
    private HashMap<OpenElementBase.ELE_TYPES,HashMap<Integer, UUID>> relationalSeqs;//new HashMap<OpenElementBase.ELE_TYPES,HashMap<Integer,UUID>>();
    // public HashMap<OpenElementBase.ELE_TYPES,HashMap<Integer, UUID>> getRelationalSeqs() {
    //     return relationalSeqs;
    // }
    public void setRelationalSeqs() {
        relationalElements=this.getRelationalElements();
         Iterator<ELE_TYPES> hkItr = relationalElements.keySet().iterator();
        while (hkItr.hasNext()) {
            OpenElementBase.ELE_TYPES eleType = (OpenElementBase.ELE_TYPES) hkItr.next();
            if(this.relationalSeqs.get(eleType)==null){
                this.relationalSeqs.put(eleType, new HashMap<>());
            }
            LinkedHashMap<UUID, OpenElementBase> reles = this.relationalElements.get(eleType);
             
            Iterator<UUID> values = reles.keySet().iterator();
            Integer i=1;
                HashMap<Integer, UUID> seqmap = this.relationalSeqs.get(eleType);
            while (values.hasNext()) {
                UUID uuid = (UUID) values.next();
                reles.get(uuid).setSeqId(i);
                seqmap.put(i, uuid);
                i++;
            }
        }
        //this.relationalSeqs = relationalSeqs;
    }
}
