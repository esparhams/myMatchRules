package gov.match.model.message;

import java.util.Date;
import java.util.List;

public class PatientRejoinTrigger {
	private List<PatientRejoinEligibleArm> eligibleArms;
	private Date dateScanned;
	private Date dateSentToECOG;
	private Date dateRejoined;
	
	public List<PatientRejoinEligibleArm> getEligibleArms() {
		return eligibleArms;
	}
	
	public void setEligibleArms(List<PatientRejoinEligibleArm> eligibleArms) {
		this.eligibleArms = eligibleArms;
	}

	public Date getDateScanned() {
		return dateScanned;
	}

	public void setDateScanned(Date dateScanned) {
		this.dateScanned = dateScanned;
	}

	public Date getDateSentToECOG() {
		return dateSentToECOG;
	}

	public void setDateSentToECOG(Date dateSentToECOG) {
		this.dateSentToECOG = dateSentToECOG;
	}

	public Date getDateRejoined() {
		return dateRejoined;
	}

	public void setDateRejoined(Date dateRejoined) {
		this.dateRejoined = dateRejoined;
	}
}