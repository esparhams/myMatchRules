package gov.match.model;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Stores the reason why a patient can't be assigned to a 
 * treatment arm that is not a drugs such as a patient
 * have a certain condition.
 */
public class ExclusionCriteria {
	
	/**
	 * A unique id for the exclusion criteria.
	 */
	@NotEmpty
	private String id;
	
	/**
	 * A free-formed description about the exclusion criteria.
	 */
	@NotEmpty
	private String description;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
