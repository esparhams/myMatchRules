package gov.match.validator;

import gov.match.model.TreatmentArm;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PtenResultValidator extends AbstractAssayResultValidator implements ConstraintValidator<ValidPtenResult, TreatmentArm> {

	private static final String GENE = "PTEN";
	
	public void initialize(ValidPtenResult constraintAnnotation) {}

	public boolean isValid(TreatmentArm ta, ConstraintValidatorContext arg1) {
		return isValid(GENE, ta);
	}

}