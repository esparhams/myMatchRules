package gov.match.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { MSCH2ResultValidator.class })
@Documented
public @interface ValidMSCH2Result {
    String message() default "MSCH2 results may contain max one POSITIVE, one NEGATIVE and one INDETERMINATE AssayResultStatus.";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
