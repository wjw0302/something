package org.drill.utils;

public enum ResultStatus {
	
	RESULT_SECCESS("查询成功","/index"),RESULT_FAILD("查询失败","/error");
	
	private String descript;
	private String content;
	
	private ResultStatus(String descript, String content) {
		this.descript = descript;
		this.content = content;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
