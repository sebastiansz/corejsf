package com.corejsf;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
// or import javax.faces.bean.ManagedBean;

// or import javax.faces.bean.SessionScoped;

@Named("bewerbungBean")
@SessionScoped
public class BewerbungBean implements Serializable {

	private static final long serialVersionUID = 1L;

	String stelle;
	String profil;
	String personalberater;
	String firma;
	String firmaStadt;
	String firmaTelnum;
	String status;
	Date bewerbungDate;
	Date antwortDate;
	String weitereInfo;

	public String getPersonalberater() {
		return personalberater;
	}

	public void setPersonalberater(String personalberater) {
		this.personalberater = personalberater;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getFirmaStadt() {
		return firmaStadt;
	}

	public void setFirmaStadt(String firmaStadt) {
		this.firmaStadt = firmaStadt;
	}

	public String getFirmaTelnum() {
		return firmaTelnum;
	}

	public void setFirmaTelnum(String firmaTelnum) {
		this.firmaTelnum = firmaTelnum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getBewerbungDate() {
		return bewerbungDate;
	}

	public void setBewerbungDate(Date bewerbungDate) {
		this.bewerbungDate = bewerbungDate;
	}

	public Date getAntwortDate() {
		return antwortDate;
	}

	public void setAntwortDate(Date antwortDate) {
		this.antwortDate = antwortDate;
	}

	public String getWeitereInfo() {
		return weitereInfo;
	}

	public void setWeitereInfo(String weitereInfo) {
		this.weitereInfo = weitereInfo;
	}

	public String getStelle() {
		return stelle;
	}

	public void setStelle(String stelle) {
		this.stelle = stelle;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

}
