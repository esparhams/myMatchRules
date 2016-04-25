package gov.match.validator;

import java.util.ArrayList;
import java.util.List;

import gov.match.enumeration.AssayResultStatus;
import gov.match.model.AssayResult;
import gov.match.model.TreatmentArm;

public abstract class AbstractAssayResultValidator {

	protected boolean isValid(String gene, TreatmentArm ta) {
		// Only allow max of one NEGATIVE, one POSITIVE, one INDETERMINATE PtenIhcStatus in TA PtenResults
		if (ta == null || ta.getAssayResults() == null || ta.getAssayResults().isEmpty()) {
			return true;
		}
		
		List<AssayResult> ptenAssayResults = new ArrayList<AssayResult>();
		for (AssayResult assayResult : ta.getAssayResults()) {
			if (assayResult.getGene().equals(gene)) {
				ptenAssayResults.add(assayResult);
			}
		}
		
		if (ptenAssayResults.size() == 0) return true;
		if (ptenAssayResults.size() > 3) return false;
		
		List<AssayResultStatus> existingStatusList = new ArrayList<AssayResultStatus>();
		for (AssayResult result : ptenAssayResults) {
			if (existingStatusList.contains(result.getAssayResultStatus())) return false;
			existingStatusList.add(result.getAssayResultStatus());
		}
		
		return true;
	}
	
}
