package io.open.elements;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import io.open.elements.execution.process.context.OpenProcessContext;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// @NoArgsConstructor
public class OpenElementBase implements OpenElementIntf {

	public OpenElementBase(){

		this._class=this.getClass().getName();
	}


	private UUID id= UUID.randomUUID();
	private String name;
	// private transient Boolean deepClone=false;

	private String type;

	private String coreType;
	protected HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<UUID, OpenElementBase>> relationalElements ; //new HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<UUID, OpenElementBase>>();
	// protected HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<UUID, OpenElementBase>> relationalRefs = new HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<UUID, OpenElementBase>>();
	protected HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<String, UUID>> queryRefs ;// new HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<String,UUID>>();
	private OpenProcessContext pc;
	private String parentName;
	private String parentType;
	private UUID parentId;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;
	private String state;
	private String status;
	private Integer seqId;
	private String _class;


	private HashMap<String, OpenElementField> fields;// new HashMap<>();
	// private OpenContext context;
    
	public enum ELE_TYPES {
		COMP, VER, REL, SEQ, TRANS, MD, EXECUTABLE_DATA_SET,PRNT,ATTRS
	}

	public static final HashMap<String, ELE_TYPES> eleTypemap = new HashMap<String, OpenElementBase.ELE_TYPES>() {
		{
			put("Component", ELE_TYPES.COMP);
			put("ComponentVersion", ELE_TYPES.VER);
			put("CompositionRelation", ELE_TYPES.REL);
			put("ProcessSequence", ELE_TYPES.SEQ);
			put("CompositionParent", ELE_TYPES.PRNT);
		}
	};

	// public String getCollectionName(){
	// 	return this.collectionName;
	// }
	public void setId(String id) {
		this.id = UUID.fromString(id);
	}

	public void clearRelationalElements() {
		instantiateRelElements();
		this.relationalElements.clear();
	}

	private void instantiateRelElements() {
		if(this.relationalElements==null){
			this.relationalElements= new  HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<UUID, OpenElementBase>>();
		}
		
	}

	public LinkedHashMap<UUID, OpenElementBase> getRelationalElements(OpenElementBase.ELE_TYPES str) {
		instantiateRelElements();
		return relationalElements.get(str);
	}

	public OpenElementBase getRelationalElement(String str, UUID uuid) {
		instantiateRelElements();
		return relationalElements.get(str).get(uuid);
	}

	public boolean hasOneToOneRelationalElements() {
		instantiateRelElements();
		return this.relationalElements.size() == 1;
	}
	
	public void removeAllRelationalElement(ELE_TYPES eleTypes,List<UUID> keys) {
		LinkedHashMap<UUID, OpenElementBase> map = this.relationalElements.get(eleTypes);
		keys.forEach(key->{
			map.remove(key);
		});
	}

	public OpenElementBase getBaseRelationalElement(String str) {
		if (this.relationalElements != null && this.relationalElements.size() > 0) {
			ELE_TYPES elt = ELE_TYPES.valueOf(str);
			if (this.relationalElements.get(elt) != null && this.relationalElements.get(elt).size() > 0) {

				return this.relationalElements.get(elt).values().iterator().next();
			}
		}
		return null;
	}

	private String versionId;
	// private String collectionName;

	public void setRelationalElements(OpenElementBase.ELE_TYPES str,
			LinkedHashMap<UUID, OpenElementBase> relationalElements) {
				instantiateRelElements();
		Set<UUID> keys = relationalElements.keySet();
		if (keys.contains(null)) {
			System.out.println(
					"____________________________setting relational elements hashmap some of relationnal-element the id is null:"
							+ relationalElements + "___________________________");
		}
		this.relationalElements.put(str, relationalElements);
	}

	public void addRelationalElement(OpenElementBase.ELE_TYPES str, OpenElementBase relationalElement) {
		instantiateRelElements();
		if (relationalElement.getId() == null) {
			System.out.println(
					"____________________________setting relational elements for relationnal-element the id is null:"
							+ relationalElement.getId() + "___________________________");
			// throw new AplicationException("0060","setting relational elements for
			// relationnal-element the id is null:"+relationalElement.getId());
		}
		if (this.relationalElements.get(str) == null) {
			this.relationalElements.put(str, new LinkedHashMap<UUID, OpenElementBase>());
		}
		if(this.queryRefs==null){
			this.queryRefs= new HashMap<OpenElementBase.ELE_TYPES, LinkedHashMap<String,UUID>>();
		}
		LinkedHashMap<String, UUID> qrmap = this.queryRefs.get(str);

			if(qrmap==null){
				qrmap=new LinkedHashMap<>();
			}
			qrmap.put(relationalElement.getName(),relationalElement.getId());
		this.relationalElements.get(str).put(relationalElement.getId(), relationalElement);
	}

	public OpenElementBase getElementByTypeName(OpenElementBase.ELE_TYPES str , String name){
		instantiateRelElements();
		LinkedHashMap<UUID, OpenElementBase> data = this.relationalElements.get(str);
		return data.get(queryRefs.get(name));

	}

	public void addRelationalElement(OpenElementBase relationalElement) {
		if (relationalElement.getId() == null) {
			System.out.println(
					"____________________________setting relational elements for relationnal-element the id is null:"
							+ relationalElement.getId() + "___________________________");
			// throw new AplicationException("0060","setting relational elements for
			// relationnal-element the id is null:"+relationalElement.getId());
		}
		instantiateRelElements();
		ELE_TYPES namex = eleTypemap.get(relationalElement.getClass().getSimpleName());
		if (this.relationalElements.get(namex) == null) {
			this.relationalElements.put(namex, new LinkedHashMap<UUID, OpenElementBase>());
		}
		this.relationalElements.get(namex).put(relationalElement.getId(), relationalElement);
	}

	
	public void addField(OpenElementField field) {
		if(fields==null){
		  fields=new HashMap<String, OpenElementField>();
		}
		this.fields.put(field.getName(), field);
	  }
	
	  public void getField(OpenElementField field) {
		fields.put(field.getName(), field);
	  }
	
	  public void setFieldValue(String name, Object value) {
		if(fields==null){
		  fields=new HashMap<String, OpenElementField>();
		}
		if (fields.get(name) == null) {
		  OpenElementField ef = new OpenElementField();
		  ef.setName(name);
		  ef.setFieldValue(value);
		  fields.put(name, ef);
		} else {
		  fields.get(name).setFieldValue(value);
		}
	  }
	
	  public OpenElementField getField(String name) {
		return fields.get(name);
	  }
	
	  public Object getFieldValue(String name) {
		return fields.get(name).getFieldValue();
	  }
  

	// @Override
	// public Object clone() throws CloneNotSupportedException {
	// Object obj= super.clone();
	// OpenElementBase base= (OpenElementBase) obj;
	// if(deepClone){
	// 	cloneRelElements(base);
	// 	cloneQueryRefs(base);

	// }
	// return base;

	// }

	// private void cloneQueryRefs(OpenElementBase base) {
	// 	base.setQueryRefs(null);
	// 	HashMap<ELE_TYPES, LinkedHashMap<String,UUID>> hm = new HashMap<ELE_TYPES, LinkedHashMap<String,UUID>> ();
	// 	ELE_TYPES key;
	// 	instantiateRelElements();
	// 	Iterator<ELE_TYPES> it = this.getRelationalElements().keySet().iterator();
	// 	// Deep Copy of field by field
	// 	while (it.hasNext()) {
	// 		key = it.next();
	// 		LinkedHashMap<String,UUID> chm= new LinkedHashMap<String,UUID>();
	// 		LinkedHashMap<String,UUID> chmold = this.getQueryRefs().get(key);
	// 		chmold.keySet().forEach(ckey->{
	// 			UUID old = chmold.get(ckey);
	// 			UUID newv = UUID.fromString(old.toString());
	// 			chm.put(ckey, newv);
	// 		});
	// 		hm.put(key, chm);
	// 	}
	// 	base.setQueryRefs(hm);
	// }

	// private void cloneRelElements(OpenElementBase base) throws CloneNotSupportedException{
	// 	base.setRelationalElements(null);
	// 	HashMap<ELE_TYPES, LinkedHashMap<UUID,OpenElementBase>> hm = new HashMap<ELE_TYPES, LinkedHashMap<UUID,OpenElementBase>> ();
	// 	// ELE_TYPES key;
	// 	instantiateRelElements();
	// 	this.getRelationalElements().keySet().forEach(key->{
	// 		LinkedHashMap<UUID,OpenElementBase> chm= new LinkedHashMap<UUID,OpenElementBase>();
	// 		LinkedHashMap<UUID, OpenElementBase> chmold = this.getRelationalElements(key);
	// 		chmold.keySet().forEach(ckey->{
	// 			OpenElementBase old = chmold.get(ckey);
	// 			OpenElementBase newv;
	// 			try {
	// 				newv = (OpenElementBase) old.clone();
	// 			} catch (CloneNotSupportedException e) {
	// 				throw new OpenElementsCommonException("503", "CloneNotSupportedException", e);
	// 				}
	// 			chm.put(ckey, newv);
	// 		});
	// 		hm.put(key, chm);
	// 	});;
	// 	// Deep Copy of field by field
		
	// 	base.setRelationalElements(hm);
	// }

}
