package org.match.builder;

import gov.match.model.Drug;
import gov.match.model.DrugCombo;

public class DrugComboBuilder {
	private DrugCombo drugCombo;
	
	public DrugComboBuilder() {
		drugCombo = new DrugCombo();
	}
	
	public DrugComboBuilder drug(Drug drug) {
		drugCombo.appendDrug(drug);
		return this;
	}
	
	public DrugCombo build() {
		return drugCombo;
	}
}
