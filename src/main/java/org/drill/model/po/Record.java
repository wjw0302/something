package org.drill.model.po;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the records database table.
 * 
 */
@Entity
@Table(name = "type")
public class Record implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;

	private Date createDate;

	private String info;

	private String type;

	public Record() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}