package org.drill.model.vo;

public class Court {
	
	private String fct_class;
	private String fct_ggdate;
	private String fct_ggperson;
	private String fct_party;
	private String fct_executiondoc;
	public String getFct_class() {
		return fct_class;
	}
	public void setFct_class(String fct_class) {
		this.fct_class = fct_class;
	}
	public String getFct_ggdate() {
		return fct_ggdate;
	}
	public void setFct_ggdate(String fct_ggdate) {
		this.fct_ggdate = fct_ggdate;
	}
	public String getFct_ggperson() {
		return fct_ggperson;
	}
	public void setFct_ggperson(String fct_ggperson) {
		this.fct_ggperson = fct_ggperson;
	}
	public String getFct_party() {
		return fct_party;
	}
	public void setFct_party(String fct_party) {
		this.fct_party = fct_party;
	}
	public String getFct_executiondoc() {
		return fct_executiondoc;
	}
	public void setFct_executiondoc(String fct_executiondoc) {
		this.fct_executiondoc = fct_executiondoc;
	}
	
	@Override
	public String toString() {
		return "CourtData [fct_class=" + fct_class
				+ ", fct_ggdate=" + fct_ggdate + ", fct_ggpersonf=" + fct_ggperson + ", fct_party=" + fct_party
				+ ", fct_executiondoc=" + fct_executiondoc + "]";
	}

}
