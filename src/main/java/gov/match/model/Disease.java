package gov.match.model;


public class Disease {

	//@org.kie.api.definition.type.Position(value = 0)
	private String medraCode;
	
	//@org.kie.api.definition.type.Position(value = 1)
	private String ctepCategory;
	
	//@org.kie.api.definition.type.Position(value = 2)
	private String ctepSubCategory;
	
	//@org.kie.api.definition.type.Position(value = 3)
	private String ctepTerm;
	
	//@org.kie.api.definition.type.Position(value = 4)
	private String shortName;
	
	public String getMedraCode() {
		return medraCode;
	}
	public void setMedraCode(String medraCode) {
		this.medraCode = medraCode;
	}
	public String getCtepCategory() {
		return ctepCategory;
	}
	public void setCtepCategory(String ctepCategory) {
		this.ctepCategory = ctepCategory;
	}
	public String getCtepSubCategory() {
		return ctepSubCategory;
	}
	public void setCtepSubCategory(String ctepSubCategory) {
		this.ctepSubCategory = ctepSubCategory;
	}
	public String getCtepTerm() {
		return ctepTerm;
	}
	public void setCtepTerm(String ctepTerm) {
		this.ctepTerm = ctepTerm;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
}