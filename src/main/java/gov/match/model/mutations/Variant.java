package gov.match.model.mutations;

import java.util.List;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.json.JSONObject;


@JsonTypeInfo(  
    use = JsonTypeInfo.Id.NAME,  
    include = JsonTypeInfo.As.PROPERTY,  
    property = "type")  
@JsonSubTypes({    
    @Type(value = CopyNumberVariant.class, 			name = "cnv"),
    @Type(value = GeneFusion.class, 				name = "gf"),
    @Type(value = UnifiedGeneFusion.class, 			name = "ugf"),
    @Type(value = SingleNucleotideVariant.class, 	name = "snv"),
    @Type(value = Indel.class, 						name = "id"),
    @Type(value = NonHotspotRule.class,				name = "nhr")})  
public abstract class Variant {

	private Metadata metadata;
	private List<String> publicMedIds;
	private String geneName;
	private String chromosome;
	private String position;
	private String identifier;
	private String reference; 
	private String alternative;
	private String filter;
	private String description;
	private String protein;
	private String transcript;
	private String hgvs;
	private String location;
	private Integer readDepth; // only available for patient variant
	private boolean rare;
	private Double alleleFrequency; // only available for patient variant
	private String flowAlternativeAlleleObservationCount;
	private String flowReferenceAlleleObservations;
	private Integer referenceAlleleObservations;
	private Integer alternativeAlleleObservationCount;
	private String variantClass;
	private Float levelOfEvidence;
	private boolean inclusion = true;
	private boolean armSpecific = false;
	
	public Variant () {
		this.rare = false;
	}
	
	public Metadata getMetadata() {
		return this.metadata;
	}
	
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	
	public List<String> getPublicMedIds() {
		return publicMedIds;
	}
	
	public void setPublicMedIds(List<String> publicMedIds) {
		this.publicMedIds = publicMedIds;
	}
	
	public void appendPublicMedId(String publicMedId) {
		this.publicMedIds.add(publicMedId);
	}

	public String getGeneName() {
		return geneName;
	}

	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}
	
	public String getVariantClass() {
		return variantClass;
	}

	public void setVariantClass(String variantClass) {
		this.variantClass = variantClass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChromosome() {
		return chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getAlternative() {
		return alternative;
	}

	public void setAlternative(String alternative) {
		this.alternative = alternative;
	}
	
	public String getFilter() {
		return filter;
	}
	
	public void setFilter(String filter) {
		this.filter = filter;
	}

	public boolean isRare() {
		return rare;
	}

	public void setRare(boolean rare) {
		this.rare = rare;
	}

	public boolean isInclusion() {
		return inclusion;
	}

	public void setInclusion(boolean inclusion) {
		this.inclusion = inclusion;
	}
	
	public boolean isArmSpecific() {
		return armSpecific;
	}
	
	public void setArmSpecific(boolean armSpecific) {
		this.armSpecific = armSpecific;
	}
	
	public Float getLevelOfEvidence() {
		return levelOfEvidence;
	}

	public void setLevelOfEvidence(Float levelOfEvidence) {
		this.levelOfEvidence = levelOfEvidence;
	}

	public Double getAlleleFrequency() {
		return alleleFrequency;
	}

	public void setAlleleFrequency(Double alleleFrequency) {
		this.alleleFrequency = alleleFrequency;
	}

	public void setReadDepth(Integer readDepth) {
		this.readDepth = readDepth;
	}
	
	public Integer getReadDepth () {
		return readDepth;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}
	
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
	
	public String getProtein() {
		return protein;
	}
	
	public String getTranscript () {
		return transcript;
	}
	
	public String getHgvs () {
		return hgvs;
	}
	
	public void setHgvs (String hgvs) {
		this.hgvs = hgvs;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}

	public void setAlternativeAlleleObservationCount(Integer alternativeAlleleObservationCount) {
		this.alternativeAlleleObservationCount = alternativeAlleleObservationCount;
	}
	
	public Integer getAlternativeAlleleObservationCount() {
		return alternativeAlleleObservationCount;
	}
	
	public void setReferenceAlleleObservations(Integer referenceAlleleObservations) {
		this.referenceAlleleObservations = referenceAlleleObservations;
	}
	
	public Integer getReferenceAlleleObservations() {
		return referenceAlleleObservations;
	}
	
	public void setFlowAlternativeAlleleObservationCount(String flowAlternativeAlleleObservationCount) {
		this.flowAlternativeAlleleObservationCount = flowAlternativeAlleleObservationCount;
	}
	
	public String getFlowAlternativeAlleleObservationCount() {
		return flowAlternativeAlleleObservationCount;
	}
	
	public void setFlowReferenceAlleleObservations(String flowReferenceAlleleObservations) {
		this.flowReferenceAlleleObservations = flowReferenceAlleleObservations;
	}
	
	public String getFlowReferenceAlleleObservations() {
		return flowReferenceAlleleObservations;
	}
	
	public JSONObject toJSONObject() {
		JSONObject self = new JSONObject();
		self.put("metadata", metadata);
		self.put("publicMedIds", publicMedIds);
		self.put("geneName", geneName);
		self.put("chromosome", chromosome);
		self.put("position", position);
		self.put("identifier", identifier);
		self.put("reference", reference);
		self.put("alternative", alternative);
		self.put("description", description);
		self.put("readDepth", readDepth);
		self.put("rare", rare);
		self.put("alleleFrequency", alleleFrequency);
		self.put("variantClass", variantClass);
		self.put("levelOfEvidence", levelOfEvidence);
		self.put("inclusion", inclusion);
		self.put("armSpecific", armSpecific);
		self.put("transcript", transcript);
		self.put("protein", protein);
		self.put("hgvs", hgvs);
		self.put("location", location);
		self.put("referenceAlleleObservations", referenceAlleleObservations);
		self.put("alternativeAlleleObservationCount", alternativeAlleleObservationCount);
		self.put("flowReferenceAlleleObservations", flowReferenceAlleleObservations);
		self.put("flowAlternativeAlleleObservationCount", flowAlternativeAlleleObservationCount);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}
}