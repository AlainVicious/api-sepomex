package com.codigos.mexico.restservice.entity;

import java.util.List;

/**
 * ZipCOdesResponse
 */
public class ZipCodesResponse {
    private String zip_code;
    private String locality;
    private String federal_entity;
    private List<Asentamiento> settlements;
	private String municipality;
	public ZipCodesResponse(){}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getFederal_entity() {
		return federal_entity;
	}
	public void setFederal_entity(String federal_entity) {
		this.federal_entity = federal_entity;
	}
	public List<Asentamiento> getSettlements() {
		return settlements;
	}
	public void setSettlements(List<Asentamiento> settlements) {
		this.settlements = settlements;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
    
}