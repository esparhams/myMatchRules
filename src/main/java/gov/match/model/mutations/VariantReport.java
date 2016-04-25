package gov.match.model.mutations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

public class VariantReport {

	@Valid
	private List<SingleNucleotideVariant> singleNucleotideVariants;

	@Valid 
	private List<Indel> indels;
	
	@Valid
	private List<CopyNumberVariant> copyNumberVariants;

	@Valid
	private List<GeneFusion> geneFusions;
	
	@Valid
	private List<UnifiedGeneFusion> unifiedGeneFusions;
	
	@Valid 
	private List<NonHotspotRule> nonHotspotRules;

	private Date createdDate;

	public VariantReport() {
		singleNucleotideVariants = new ArrayList<SingleNucleotideVariant>();
		indels = new ArrayList<Indel>();
		copyNumberVariants = new ArrayList<CopyNumberVariant>();
		geneFusions = new ArrayList<GeneFusion>();
		unifiedGeneFusions = new ArrayList<UnifiedGeneFusion>();
		nonHotspotRules = new ArrayList<NonHotspotRule>();
	}
	
	public List<SingleNucleotideVariant> getSingleNucleotideVariants() {
		return singleNucleotideVariants;
	}

	public void setSingleNucleotideVariants(List<SingleNucleotideVariant> singleNucleotideVariants) {
		this.singleNucleotideVariants = singleNucleotideVariants;
	}
	
	public void appendSingleNucleotideVariant(SingleNucleotideVariant singleNucleotideVariant) {
		this.singleNucleotideVariants.add(singleNucleotideVariant);
	}
	
	public List<Indel> getIndels() {
		return indels;
	}

	public void setIndels(List<Indel> indels) {
		this.indels = indels;
	}

	public void appendIndel(Indel indel) {
		this.indels.add(indel);
	}

	public List<CopyNumberVariant> getCopyNumberVariants() {
		return copyNumberVariants;
	}

	public void setCopyNumberVariants(List<CopyNumberVariant> copyNumberVariants) {
		this.copyNumberVariants = copyNumberVariants;
	}

	public void appendCopyNumberVariant(CopyNumberVariant copyNumberVariant) {
		this.copyNumberVariants.add(copyNumberVariant);
	}

	public List<GeneFusion> getGeneFusions() {
		return geneFusions;
	}

	public void setGeneFusions(List<GeneFusion> geneFusions) {
		this.geneFusions = geneFusions;
	}
	
	public void setUnifiedGeneFusions(List<UnifiedGeneFusion> unifiedGeneFusions) {
		this.unifiedGeneFusions = unifiedGeneFusions;
	}
	
	public List<UnifiedGeneFusion> getUnifiedGeneFusions() {
		return unifiedGeneFusions;
	}

	public void appendCopyNumberVariant(GeneFusion geneFusion) {
		this.geneFusions.add(geneFusion);
	}
	
	public List<NonHotspotRule> getNonHotspotRules() {
		return nonHotspotRules;
	}

	public void setNonHotspotRules(List<NonHotspotRule> nonHotspotRules) {
		this.nonHotspotRules = nonHotspotRules;
	}
	
	public void appendNonHotspotRule(NonHotspotRule nonHotspotRule) {
		this.nonHotspotRules.add(nonHotspotRule);
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}