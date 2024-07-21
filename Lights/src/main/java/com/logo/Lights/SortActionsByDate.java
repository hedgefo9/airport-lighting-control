package com.logo.Lights;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SortActionsByDate {
	@JsonFormat(shape=Shape.STRING, pattern="yyyy-MM-dd HH:mm", timezone="Europe/Moscow")
	private Date beforeIt;
	@JsonFormat(shape=Shape.STRING, pattern="yyyy-MM-dd HH:mm", timezone="Europe/Moscow")
	private Date afterIt;
	@JsonProperty("isDesc")
	private boolean isDesc;
		
	public Date getBeforeIt() {
		return beforeIt;
	}
	public void setBeforeIt(Date beforeIt) {
		this.beforeIt = beforeIt;
	}
	public Date getAfterIt() {
		return afterIt;
	}
	public void setAfterIt(Date afterIt) {
		this.afterIt = afterIt;
	}
	public boolean isDesc() {
		return isDesc;
	}
	public void setDesc(boolean isDesc) {
		this.isDesc = isDesc;
	}	
	
}
