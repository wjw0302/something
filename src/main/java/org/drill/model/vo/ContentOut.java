package org.drill.model.vo;

public class ContentOut<T> {
	
	private T result;
	private int resultcode;
	private String message;
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public int getResultcode() {
		return resultcode;
	}
	public void setResultcode(int resultcode) {
		this.resultcode = resultcode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "ContentOut [result=" + result + ", resultcode=" + resultcode + ", message=" + message + "]";
	}

}
