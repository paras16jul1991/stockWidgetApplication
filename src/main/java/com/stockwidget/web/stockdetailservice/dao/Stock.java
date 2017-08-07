package com.stockwidget.web.stockdetailservice.dao;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Stock {

	@Id
	private long id;
	private String name;
	private String unitValue;
	private String previousVal;
	private Date tschange;
	
	public String getPreviousVal() {
		return previousVal;
	}
	public void setPreviousVal(String previousVal) {
		this.previousVal = previousVal;
	}
	public Date getTschange() {
		return tschange;
	}
	public void setTschange(Date tschange) {
		this.tschange = tschange;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(String unitValue) {
		this.unitValue = unitValue;
	}
}
