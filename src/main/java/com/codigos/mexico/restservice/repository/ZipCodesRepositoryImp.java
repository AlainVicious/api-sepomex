package com.codigos.mexico.restservice.repository;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import com.codigos.mexico.restservice.entity.Asentamiento;
import com.codigos.mexico.restservice.entity.ZipCodesResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.stereotype.Repository;

@Repository
public class ZipCodesRepositoryImp implements ZipCodesRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ZipCodesResponse getAsentamientos(String cp) {
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("getAsentamientos");

		storedProcedure.registerStoredProcedureParameter("cp", String.class, ParameterMode.IN);
		storedProcedure.setParameter("cp", cp);

		ArrayList<Object> storedProcedureResults = (ArrayList<Object>) storedProcedure.getResultList();

		// ZipCodes res = storedProcedureResults.get(0);
		ZipCodesResponse result = new ZipCodesResponse();
		if (storedProcedureResults.size() > 0) {
			Object[] obj = (Object[]) storedProcedureResults.get(0);
	
			Gson gson = new Gson();
			Type type = new TypeToken<List<Asentamiento>>(){}.getType();
			List<Asentamiento> contactList = gson.fromJson(String.valueOf(obj[3]).toString(), type);
	
			result.setZip_code(String.valueOf(obj[0]).toString());
			result.setLocality(String.valueOf(obj[1]).toString());
			result.setFederal_entity(String.valueOf(obj[2]).toString());
			result.setSettlements(contactList);
			result.setMunicipality(String.valueOf(obj[4]).toString());
		}
		return result;
	}
}