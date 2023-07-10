package gov.texas.oag.obligation.rules.model;

public class Obligation {
	private String dmnNamespace="https://kiegroup.org/dmn/_54ECE9F7-AD45-45D7-89AF-DA8E2318F866";
	private String dmnModel="oagObligation";
	
	private java.math.BigDecimal currentFund;
	
	private java.math.BigDecimal cspp1Amt;
	private java.math.BigDecimal mspp1Amt;
	private java.math.BigDecimal dspp1Amt;
	private java.math.BigDecimal sspp1Amt;
		
	private OblType cspp1Type;
	private OblType mspp1Type;
	private OblType dspp1Type;
	private OblType sspp1Type;
	
	private java.math.BigDecimal balFund;

	public String getDmnNamespace() {
		return dmnNamespace;
	}

	
	public String getDmnModel() {
		return dmnModel;
	}

	

	public java.math.BigDecimal getCurrentFund() {
		return currentFund;
	}

	public void setCurrentFund(java.math.BigDecimal currentFund) {
		this.currentFund = currentFund;
	}

	public java.math.BigDecimal getCspp1Amt() {
		return cspp1Amt;
	}

	public void setCspp1Amt(java.math.BigDecimal cspp1Amt) {
		this.cspp1Amt = cspp1Amt;
	}

	public java.math.BigDecimal getMspp1Amt() {
		return mspp1Amt;
	}

	public void setMspp1Amt(java.math.BigDecimal mspp1Amt) {
		this.mspp1Amt = mspp1Amt;
	}


	public java.math.BigDecimal getDspp1Amt() {
		return dspp1Amt;
	}


	public void setDspp1Amt(java.math.BigDecimal dspp1Amt) {
		this.dspp1Amt = dspp1Amt;
	}


	public java.math.BigDecimal getSspp1Amt() {
		return sspp1Amt;
	}


	public void setSspp1Amt(java.math.BigDecimal sspp1Amt) {
		this.sspp1Amt = sspp1Amt;
	}


	public OblType getCspp1Type() {
		return cspp1Type;
	}

	public void setCspp1Type(OblType cspp1Type) {
		this.cspp1Type = cspp1Type;
	}

	public OblType getMspp1Type() {
		return mspp1Type;
	}

	public void setMspp1Type(OblType mspp1Type) {
		this.mspp1Type = mspp1Type;
	}

	public OblType getDspp1Type() {
		return dspp1Type;
	}

	public void setDspp1Type(OblType dspp1Type) {
		this.dspp1Type = dspp1Type;
	}

	public OblType getSspp1Type() {
		return sspp1Type;
	}

	public void setSspp1Type(OblType sspp1Type) {
		this.sspp1Type = sspp1Type;
	}

	public java.math.BigDecimal getBalFund() {
		return balFund;
	}

	public void setBalFund(java.math.BigDecimal balFund) {
		this.balFund = balFund;
	}
	
	
	
}
