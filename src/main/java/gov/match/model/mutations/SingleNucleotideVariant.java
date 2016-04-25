package gov.match.model.mutations;

import org.apache.commons.lang.math.NumberUtils;

public class SingleNucleotideVariant extends ConfirmableVariant {
	
	@Override
	public Integer getReadDepth () {
		String FAO = getFlowAlternativeAlleleObservationCount();
		String FRO = getFlowReferenceAlleleObservations();
		if (NumberUtils.isNumber(FAO) && NumberUtils.isNumber(FRO)) {
			return Integer.parseInt(FAO) + Integer.parseInt(FRO);
		}
		
		Integer AO = getAlternativeAlleleObservationCount();
		Integer RO = getReferenceAlleleObservations();
		if (AO != null && RO != null) {
			return AO.intValue() + RO.intValue();
		}
		
		return super.getReadDepth();
	}
}