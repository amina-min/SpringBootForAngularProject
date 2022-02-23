package com.jee47.model;

import javax.persistence.Entity;

public class TotalInfo {

	long totalEmployeeCount;
	long totalFeedbackCount;
	long noFeedbackCount;
	public long getTotalEmployeeCount() {
		return totalEmployeeCount;
	}
	public void setTotalEmployeeCount(long totalEmployeeCount) {
		this.totalEmployeeCount = totalEmployeeCount;
	}
	public long getTotalFeedbackCount() {
		return totalFeedbackCount;
	}
	public void setTotalFeedbackCount(long totalFeedbackCount) {
		this.totalFeedbackCount = totalFeedbackCount;
	}
	public long getNoFeedbackCount() {
		return noFeedbackCount;
	}
	public void setNoFeedbackCount(long noFeedbackCount) {
		this.noFeedbackCount = noFeedbackCount;
	}

	
}
