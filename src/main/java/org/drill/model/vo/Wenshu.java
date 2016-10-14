package org.drill.model.vo;

public class Wenshu {
	
	private String casetype;
	private String content;
	private String judgedate;
	private String desc;
	private String casecode;
	private String judgetitle;
	public String getCasetype() {
		return casetype;
	}
	public void setCasetype(String casetype) {
		this.casetype = casetype;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getJudgedate() {
		return judgedate;
	}
	public void setJudgedate(String judgedate) {
		this.judgedate = judgedate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCasecode() {
		return casecode;
	}
	public void setCasecode(String casecode) {
		this.casecode = casecode;
	}
	public String getJudgetitle() {
		return judgetitle;
	}
	public void setJudgetitle(String judgetitle) {
		this.judgetitle = judgetitle;
	}
	
	@Override
	public String toString() {
		return "ResultData [casetype=" + casetype + ", content=" + content + ", judgedate=" + judgedate + ", desc="
				+ desc + ", casecode=" + casecode + ", judgetitle=" + judgetitle + "]";
	}


}
