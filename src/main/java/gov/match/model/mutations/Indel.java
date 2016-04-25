package gov.match.model.mutations;

import org.apache.commons.lang.math.NumberUtils;

public class Indel extends ConfirmableVariant {
	
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
	
	@Override
	public Double getAlleleFrequency() {
		Double alleleFrequency = super.getAlleleFrequency();
		if (alleleFrequency != null) {
			return alleleFrequency;
		}
		
		Integer AO = getAlternativeAlleleObservationCount();
		Integer DP = super.getReadDepth();
		if (AO != null && DP != null && DP.intValue() != 0) {
			return ( (double) AO.intValue() / (double) DP.intValue() );
		}
		
		return null;
	}
}