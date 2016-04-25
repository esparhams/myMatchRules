package gov.match.model.mutations;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleControlVariantReport {

	private VariantReport variantReport;
	
	private List<MarkedPositiveControl> positiveControls;
	private Map<String, String> matchingCriteria;
	
	private int positiveControlVersion;
	private Date positiveControlLoadedDate;
	
	private List<ConfirmableVariant> negativeVariants;
	
	private boolean passed;
	
	public SampleControlVariantReport() {
		positiveControls = new ArrayList<MarkedPositiveControl>();
		matchingCriteria = new HashMap<String, String>();
		negativeVariants = new ArrayList<ConfirmableVariant>();
	}
	
	public VariantReport getVariantReport() {
		return variantReport;
	}
	public void setVariantReport(VariantReport variantReport) {
		this.variantReport = variantReport;
	}
	public List<MarkedPositiveControl> getPositiveControls() {
		return positiveControls;
	}
	public void setPositiveControls(List<MarkedPositiveControl> positiveControls) {
		this.positiveControls = positiveControls;
	}

	public Map<String, String> getMatchingCriteria() {
		return matchingCriteria;
	}

	public void setMatchingCriteria(Map<String, String> matchingCriteria) {
		this.matchingCriteria = matchingCriteria;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public int getPositiveControlVersion() {
		return positiveControlVersion;
	}

	public void setPositiveControlVersion(int positiveControlVersion) {
		this.positiveControlVersion = positiveControlVersion;
	}

	public Date getPositiveControlLoadedDate() {
		return positiveControlLoadedDate;
	}

	public void setPositiveControlLoadedDate(Date positiveControlLoadedDate) {
		this.positiveControlLoadedDate = positiveControlLoadedDate;
	}

	public List<ConfirmableVariant> getNegativeVariants() {
		return negativeVariants;
	}

	public void setNegativeVariants(List<ConfirmableVariant> negativeVariants) {
		this.negativeVariants = negativeVariants;
	}
}
