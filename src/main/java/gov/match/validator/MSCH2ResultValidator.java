package gov.match.validator;

import gov.match.model.TreatmentArm;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MSCH2ResultValidator extends AbstractAssayResultValidator implements ConstraintValidator<ValidMSCH2Result, TreatmentArm> {

private static final String GENE = "MSCH2";
	
	public void initialize(ValidMSCH2Result constraintAnnotation) {}

	public boolean isValid(TreatmentArm ta, ConstraintValidatorContext arg1) {
		return isValid(GENE, ta);
	}
	
}
