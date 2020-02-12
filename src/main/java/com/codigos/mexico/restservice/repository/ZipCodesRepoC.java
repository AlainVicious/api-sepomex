package com.codigos.mexico.restservice.repository;

import com.codigos.mexico.restservice.entity.ZipCodesResponse;

public interface ZipCodesRepoC {

    ZipCodesResponse getSettlements(String cp);
}