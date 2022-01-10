package com.jee47.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeRatings")
public class EmployeeRatingModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String department;
	private String designation;

	private int requirUnderstandingScore;
	private int regardingTrainingScore;
	private int equiSoftHandleScore;
	private int rulsPolicyFolloScore;
	private int knoledgeShareWithCoworkersScore;
	private String jobKnoledgeComment;

	private int coworkersTreatedRespectScore;
	private int acceptsCriticismScore;
	private int teamPlayerScore;
	private int teameResourcesShareScore;
	private int executesTaskScore;
	private String teamworkComment;

	private int acceptsMistakeScore;
	private int canWorkWithoutSuperviseScore;
	private int capableTakingAnyDecisionScore;
	private int highPressureSiruationManageScore;
	private int motivateCoworkersToFinishScore;
	private String leadershipComment;

	private String isEligibleForPromotion;
	private String isEligibleForTermination;
	private String extraComments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getRequirUnderstandingScore() {
		return requirUnderstandingScore;
	}

	public void setRequirUnderstandingScore(int requirUnderstandingScore) {
		this.requirUnderstandingScore = requirUnderstandingScore;
	}

	public int getRegardingTrainingScore() {
		return regardingTrainingScore;
	}

	public void setRegardingTrainingScore(int regardingTrainingScore) {
		this.regardingTrainingScore = regardingTrainingScore;
	}

	public int getEquiSoftHandleScore() {
		return equiSoftHandleScore;
	}

	public void setEquiSoftHandleScore(int equiSoftHandleScore) {
		this.equiSoftHandleScore = equiSoftHandleScore;
	}

	public int getRulsPolicyFolloScore() {
		return rulsPolicyFolloScore;
	}

	public void setRulsPolicyFolloScore(int rulsPolicyFolloScore) {
		this.rulsPolicyFolloScore = rulsPolicyFolloScore;
	}

	public int getKnoledgeShareWithCoworkersScore() {
		return knoledgeShareWithCoworkersScore;
	}

	public void setKnoledgeShareWithCoworkersScore(int knoledgeShareWithCoworkersScore) {
		this.knoledgeShareWithCoworkersScore = knoledgeShareWithCoworkersScore;
	}

	public String getJobKnoledgeComment() {
		return jobKnoledgeComment;
	}

	public void setJobKnoledgeComment(String jobKnoledgeComment) {
		this.jobKnoledgeComment = jobKnoledgeComment;
	}

	public int getCoworkersTreatedRespectScore() {
		return coworkersTreatedRespectScore;
	}

	public void setCoworkersTreatedRespectScore(int coworkersTreatedRespectScore) {
		this.coworkersTreatedRespectScore = coworkersTreatedRespectScore;
	}

	public int getAcceptsCriticismScore() {
		return acceptsCriticismScore;
	}

	public void setAcceptsCriticismScore(int acceptsCriticismScore) {
		this.acceptsCriticismScore = acceptsCriticismScore;
	}

	public int getTeamPlayerScore() {
		return teamPlayerScore;
	}

	public void setTeamPlayerScore(int teamPlayerScore) {
		this.teamPlayerScore = teamPlayerScore;
	}

	public int getTeameResourcesShareScore() {
		return teameResourcesShareScore;
	}

	public void setTeameResourcesShareScore(int teameResourcesShareScore) {
		this.teameResourcesShareScore = teameResourcesShareScore;
	}

	public int getExecutesTaskScore() {
		return executesTaskScore;
	}

	public void setExecutesTaskScore(int executesTaskScore) {
		this.executesTaskScore = executesTaskScore;
	}

	public String getTeamworkComment() {
		return teamworkComment;
	}

	public void setTeamworkComment(String teamworkComment) {
		this.teamworkComment = teamworkComment;
	}

	public int getAcceptsMistakeScore() {
		return acceptsMistakeScore;
	}

	public void setAcceptsMistakeScore(int acceptsMistakeScore) {
		this.acceptsMistakeScore = acceptsMistakeScore;
	}

	public int getCanWorkWithoutSuperviseScore() {
		return canWorkWithoutSuperviseScore;
	}

	public void setCanWorkWithoutSuperviseScore(int canWorkWithoutSuperviseScore) {
		this.canWorkWithoutSuperviseScore = canWorkWithoutSuperviseScore;
	}

	public int getCapableTakingAnyDecisionScore() {
		return capableTakingAnyDecisionScore;
	}

	public void setCapableTakingAnyDecisionScore(int capableTakingAnyDecisionScore) {
		this.capableTakingAnyDecisionScore = capableTakingAnyDecisionScore;
	}

	public int getHighPressureSiruationManageScore() {
		return highPressureSiruationManageScore;
	}

	public void setHighPressureSiruationManageScore(int highPressureSiruationManageScore) {
		this.highPressureSiruationManageScore = highPressureSiruationManageScore;
	}

	public int getMotivateCoworkersToFinishScore() {
		return motivateCoworkersToFinishScore;
	}

	public void setMotivateCoworkersToFinishScore(int motivateCoworkersToFinishScore) {
		this.motivateCoworkersToFinishScore = motivateCoworkersToFinishScore;
	}

	public String getLeadershipComment() {
		return leadershipComment;
	}

	public void setLeadershipComment(String leadershipComment) {
		this.leadershipComment = leadershipComment;
	}

	

	public String getIsEligibleForPromotion() {
		return isEligibleForPromotion;
	}

	public void setIsEligibleForPromotion(String isEligibleForPromotion) {
		this.isEligibleForPromotion = isEligibleForPromotion;
	}

	public String getIsEligibleForTermination() {
		return isEligibleForTermination;
	}

	public void setIsEligibleForTermination(String isEligibleForTermination) {
		this.isEligibleForTermination = isEligibleForTermination;
	}

	public String getExtraComments() {
		return extraComments;
	}

	public void setExtraComments(String extraComments) {
		this.extraComments = extraComments;
	}

}
