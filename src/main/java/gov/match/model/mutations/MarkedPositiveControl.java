package gov.match.model.mutations;

public class MarkedPositiveControl {
	private PositiveControl positiveControl;
	private boolean hasMatchingVariant;
	
	public PositiveControl getPositiveControl() {
		return positiveControl;
	}
	public void setPositiveControl(PositiveControl positiveControl) {
		this.positiveControl = positiveControl;
	}
	public boolean isHasMatchingVariant() {
		return hasMatchingVariant;
	}
	public void setHasMatchingVariant(boolean hasMatchingVariant) {
		this.hasMatchingVariant = hasMatchingVariant;
	}
}
