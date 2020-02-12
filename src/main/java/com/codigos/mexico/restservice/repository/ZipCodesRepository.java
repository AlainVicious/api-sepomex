package com.codigos.mexico.restservice.repository;

import com.codigos.mexico.restservice.entity.ZipCodesResponse;


public interface ZipCodesRepository {
	public ZipCodesResponse getAsentamientos(String cp);
}