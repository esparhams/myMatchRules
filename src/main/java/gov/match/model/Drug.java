package gov.match.model;

public class Drug {
	
	private String drugId;
	
	private String name;
	
	private String description;
	
	private String drugClass;
	
	private String pathway;
	
	private String target;

	public String getDrugId() {
		return drugId;
	}
	
	public void setDrugId(String id) {
		this.drugId = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDrugClass() {
		return drugClass;
	}

	public void setDrugClass(String drugClass) {
		this.drugClass = drugClass;
	}
	
	public String getPathway() {
		return pathway;
	}
	
	public void setPathway(String pathway) {
		this.pathway = pathway;
	}
	
	public String getTarget() {
		return target;
	}
	
	public void setTarget(String target) {
		this.target = target;
	}
}