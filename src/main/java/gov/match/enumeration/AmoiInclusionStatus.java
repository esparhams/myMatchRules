package gov.match.enumeration;

public enum AmoiInclusionStatus implements IAmoiStatus{

		PRIOR,
		CURRENT,
		FUTURE;
		
		public boolean isName(String name) {
			for (AmoiInclusionStatus amoiStatus : AmoiInclusionStatus.values()) {
				if (amoiStatus.name().equals(name)) return true;
			}
			return false;
		}
		
	}
