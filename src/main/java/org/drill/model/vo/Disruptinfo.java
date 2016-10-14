package org.drill.model.vo;

public class Disruptinfo {
	
	private String name;
	private String cardnum;
	private String case_code;
	private String court_name;
	private String reg_date;
	private String sex_name;
	private String age;
	private String gist_cid;
	private String gist_unit;
	private String publish_date;
	private String performance;
	private String disreput_type_name;
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
	public String getSex_name() {
		return sex_name;
	}
	public void setSex_name(String sex_name) {
		this.sex_name = sex_name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGist_cid() {
		return gist_cid;
	}
	public void setGist_cid(String gist_cid) {
		this.gist_cid = gist_cid;
	}
	public String getGist_unit() {
		return gist_unit;
	}
	public void setGist_unit(String gist_unit) {
		this.gist_unit = gist_unit;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public String getDisreput_type_name() {
		return disreput_type_name;
	}
	public void setDisreput_type_name(String disreput_type_name) {
		this.disreput_type_name = disreput_type_name;
	}
	
	@Override
	public String toString() {
		return "ResultData [name=" + name + ", cardnum=" + cardnum + ", sex_name="
				+ sex_name + ", age=" + age + ", case_code=" + case_code + ", court_name=" + court_name + ", gist_cid="
				+ gist_cid + ", gist_unit=" + gist_unit + ", reg_date=" + reg_date + ", publish_date=" + publish_date
				+ ", performance=" + performance + ", disreput_type_name=" + disreput_type_name + "]";
	}

}
