package com.codigos.mexico.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.codigos.mexico.restservice.entity.ZipCodesResponse;
import com.codigos.mexico.restservice.repository.ZipCodesRepository;

@RestController
@RequestMapping(path = "/zip-codes")
public class ZipCodesController {

	@Autowired
	private ZipCodesRepository repository;
	
	@GetMapping(path = "/{cp}")
	public ZipCodesResponse findByCp(@PathVariable("cp") String cp) {
		return repository.getAsentamientos(cp);
	}

	

}