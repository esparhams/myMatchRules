package gov.match.enumeration;

public enum Biomarkers {
	ICCPTENs("ICCPTENs"), 
	ICCMLH1("ICCMLH1"), 
	ICCMSCH2("ICCMSCH2"), 
	ICCRB("ICCRB");
	
	public static boolean contains(String name){
		for(Biomarkers bioMarker : Biomarkers.values()){
			if (bioMarker.name().equals(name)) return true;
		}
		return false;
	}
	
	private final String name;
	
	private Biomarkers(String s){
		name = s;
	}
	
	public boolean equalsName(String passName){
		return (passName == null) ? false : name.equalsIgnoreCase(passName);
	}
	
	public String toString(){
		return this.name;
	}
}