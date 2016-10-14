package org.drill.model.vo;

public class Undertaker {
	private String name;
	private String cardnum;
	private String case_code;
	private String court_name;
	private String reg_date;
	private String exec_money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getCase_code() {
		return case_code;
	}
	public void setCase_code(String case_code) {
		this.case_code = case_code;
	}
	public String getCourt_name() {
		return court_name;
	}
	public void setCourt_name(String court_name) {
		this.court_name = court_name;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getExec_money() {
		return exec_money;
	}
	public void setExec_money(String exec_money) {
		this.exec_money = exec_money;
	}
	
	@Override
	public String toString() {
		return "UndertakerData [name=" + name + ", cardnum=" + cardnum +", case_code=" + case_code 
				+ ", court_name=" + court_name + ", reg_date=" + reg_date 
				+ ", exec_money=" + exec_money + "]";
	}

}
