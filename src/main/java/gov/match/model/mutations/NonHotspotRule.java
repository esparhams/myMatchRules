package gov.match.model.mutations;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.json.JSONObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NonHotspotRule extends Variant {
	
	private String gene;
	private String oncominevariantclass;
	private String exon;
	private String function;
	private String proteinMatch;
	
	public String getMatchingId() {
		return super.getIdentifier();
	}
	
	public String getGene() {
		return gene;
	}
	
	public void setGene(String gene) {
		this.gene = gene;
	}

	public String getOncominevariantclass() {
		return oncominevariantclass;
	}

	public void setOncominevariantclass(String oncominevariantclass) {
		this.oncominevariantclass = oncominevariantclass;
	}

	public String getExon() {
		return exon;
	}

	public void setExon(String exon) {
		this.exon = exon;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		if (function != null) {
			this.function = function.replaceAll(",", ";");
		}
	}
	
	public String getProteinMatch() {
		return proteinMatch;
	}

	public void setProteinMatch(String proteinMatch) {
		this.proteinMatch = proteinMatch;
	}

	public JSONObject toJSONObject() {
		JSONObject self = super.toJSONObject();
		self.put("gene", gene);
		self.put("oncominevariantclass", oncominevariantclass);
		self.put("exon", exon);
		self.put("function", function);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}
	
}
