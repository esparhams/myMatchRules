package gov.match.model;

import java.util.Date;

public class BasicNextGenerationSequenceData {
	private String jobName;
	private Date dateReceived;
	private Date dateVerified;
	private String status;
	private String dnaBamFile;
	private String rnaBamFile;
	private String vcfFile;
	
	private String dnaBaiFile;
	private String rnaBaiFile;
		
	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public Date getDateReceived() {
		return dateReceived;
	}
	
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	
	public Date getDateVerified() {
		return dateVerified;
	}
	
	public void setDateVerified(Date dateVerified) {
		this.dateVerified = dateVerified;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDnaBamFile() {
		return dnaBamFile;
	}
	
	public void setDnaBamFile(String dnaBamFile) {
		this.dnaBamFile = dnaBamFile;
	}
	
	public String getRnaBamFile() {
		return rnaBamFile;
	}
	
	public void setRnaBamFile(String rnaBamFile) {
		this.rnaBamFile = rnaBamFile;
	}
	
	public String getVcfFile() {
		return vcfFile;
	}
	
	public void setVcfFile(String vcfFile) {
		this.vcfFile = vcfFile;
	}

	public String getDnaBaiFile() {
		return dnaBaiFile;
	}

	public void setDnaBaiFile(String dnaBaiFile) {
		this.dnaBaiFile = dnaBaiFile;
	}

	public String getRnaBaiFile() {
		return rnaBaiFile;
	}

	public void setRnaBaiFile(String rnaBaiFile) {
		this.rnaBaiFile = rnaBaiFile;
	}
}