package io.open.elements;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class OpenElementProcessSequence extends OpenElementCore {
	private UUID soruceId;
	private UUID targetId;

	private String strat_id;

}
