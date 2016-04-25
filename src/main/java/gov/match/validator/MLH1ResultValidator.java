package gov.match.validator;

import gov.match.model.TreatmentArm;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MLH1ResultValidator extends AbstractAssayResultValidator implements ConstraintValidator<ValidMLH1Result, TreatmentArm> {

	private static final String GENE = "MLH1";
	
	public void initialize(ValidMLH1Result constraintAnnotation) {}

	public boolean isValid(TreatmentArm ta, ConstraintValidatorContext arg1) {
		return isValid(GENE, ta);
	}
	
}
