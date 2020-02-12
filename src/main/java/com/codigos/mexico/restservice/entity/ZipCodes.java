package com.codigos.mexico.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;


import javax.persistence.ParameterMode;

@Entity
@Table(name = "ZipCodes")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
        name = "getAsentamientos",
        procedureName = "db_api_codigos.getAsentamientos",
        resultClasses = ZipCodes.class,
        parameters = {
          @StoredProcedureParameter(mode=ParameterMode.IN, name="cp", type=String.class)
    })
})
public class ZipCodes {
    @Id
    private String zip_code;
    private String locality;
    private String federal_entity;
    private String settlements;
    private String municipality;

    public ZipCodes(String cp) {
        this.zip_code = cp;
    }

    public ZipCodes() {
    }

    public String getZip_code() {
        return zip_code;
    }

    public String getLocality() {
        return locality;
    }

    public String getFederal_entity() {
        return federal_entity;
    }

    public String getSettlements() {
        return settlements;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setFederal_entity(String federal_entity) {
        this.federal_entity = federal_entity;
    }

    public void setSettlements(String settlements) {
        this.settlements = settlements;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

}