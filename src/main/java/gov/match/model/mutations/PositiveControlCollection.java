package gov.match.model.mutations;

import gov.match.model.MatchObject;

import java.util.Date;
import java.util.List;

public class PositiveControlCollection extends MatchObject {
	
	private List<PositiveControl> positiveControls;
	
	private Date dateLoaded;
	private int version;
	
	public PositiveControlCollection() {
		dateLoaded = new Date();
	}
	
	public List<PositiveControl> getPositiveControls() {
		return positiveControls;
	}
	public void setPositiveControls(List<PositiveControl> positiveControls) {
		this.positiveControls = positiveControls;
	}
	public Date getDateLoaded() {
		return dateLoaded;
	}
	public void setDateLoaded(Date dateLoaded) {
		this.dateLoaded = dateLoaded;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
