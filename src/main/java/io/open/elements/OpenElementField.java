package io.open.elements;

import java.util.UUID;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class OpenElementField extends OpenElementCore {
	private String field_td_type; // technical data type
	private Object fieldValue;
	private UUID fieldValueRefId;
	// private Object baseValue
	// private Object defaultValue;
	private String field_b_typ; // business type
	private String ref_comp_type;// reference componentname
	/** name of this field in the reference component **/
	private String ref_comp_fld_name;
}
