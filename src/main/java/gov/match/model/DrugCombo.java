package gov.match.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;

public class DrugCombo {

	private List<Drug> drugs;
	
	public DrugCombo() {
		drugs = new ArrayList<Drug>();
	}
	
	public List<Drug> getDrugs() {
		return drugs;
	}
	
	public void setDrugs(List<Drug> drugs) {
		this.drugs = drugs;
	}
	
	public void appendDrug(Drug drug) {
		this.drugs.add(drug);
	}
	
	public boolean equals(Object obj) {
		if (obj == null || ! (obj instanceof DrugCombo)) {
			return false;
		}
		
		DrugCombo other = (DrugCombo) obj;
		if (this.drugs.size() == 0 && other.drugs.size() == 0) return true;
		if (this.drugs.size() != other.drugs.size()) return false;
		
		for (Drug drug : this.drugs) {
			boolean found = false;
			for (Drug otherDrug : other.drugs) {
				if (! StringUtils.isBlank(drug.getDrugId()) && 
					! StringUtils.isBlank(otherDrug.getDrugId()) &&
					drug.getDrugId().equals(otherDrug.getDrugId())) {
					found = true;
					break;
				}
			}
			if (! found) return false;
		}
		
		return true;
	}
	
	public int hashCode() {
		int result = 5;
		List<String> drugIds = new ArrayList<String>();
		for (Drug drug : this.drugs) {
			if (StringUtils.isBlank(drug.getDrugId())) continue;
			drugIds.add(drug.getDrugId());
		}
		Collections.sort(drugIds);
		for (String drugId : drugIds) {
			result = 37 * result + drugId.hashCode();
		}
		return result;
	}
	
	public String toString() {
		JSONArray self = new JSONArray();
		for (Drug drug : this.drugs) {
			String drugName = StringUtils.isBlank(drug.getName()) ? "-" : drug.getName();
			String drugId = StringUtils.isBlank(drug.getDrugId()) ? "-" : drug.getDrugId();
			self.put("Name: " + drugName + " ID: " + drugId);
		}
		return self.toString();
	}
	
}
