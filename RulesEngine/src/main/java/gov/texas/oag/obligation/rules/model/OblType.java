package gov.texas.oag.obligation.rules.model;

/**
 * 
 */
public class OblType {
	private java.math.BigDecimal balFund;
	private java.math.BigDecimal balFee;
	private java.math.BigDecimal appliedAmt;
	
	@Override
	public String toString() {
		return "OblType [balFund=" + balFund + ", balFee=" + balFee + ", appliedAmt=" + appliedAmt + "]";
	}
	
	public java.math.BigDecimal getBalFund() {
		return balFund;
	}
	public void setBalFund(java.math.BigDecimal balFund) {
		this.balFund = balFund;
	}
	public java.math.BigDecimal getBalFee() {
		return balFee;
	}
	public void setBalFee(java.math.BigDecimal balFee) {
		this.balFee = balFee;
	}
	public java.math.BigDecimal getAppliedAmt() {
		return appliedAmt;
	}
	public void setAppliedAmt(java.math.BigDecimal appliedAmt) {
		this.appliedAmt = appliedAmt;
	}
	
	
}
