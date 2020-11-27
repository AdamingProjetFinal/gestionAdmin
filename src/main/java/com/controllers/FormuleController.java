package com.controllers;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Formule;
import com.services.FormuleService;

import lombok.extern.slf4j.Slf4j;
/**
 * @author Flavien
 *
 */
@RequestMapping("/Formule")
@CrossOrigin(origins = "*")
@RestController
@Slf4j
public class FormuleController extends ControllerImpl<Formule>{

	@Autowired
	FormuleService service;
	/**
	 * 
	 * Methode findLast exposee 
	 * @return Map<String, Object> 
	 * 
	 */
	@GetMapping("/last")
	public Map<String, Object> findLast() {
		Map<String, Object> response = new HashMap<String, Object>();
			Formule formule = service.findLast();
			log.info("recherche");
			response.put("status", HttpStatus.FOUND);
			response.put("data", formule); 
		return response;
	}
	
	/**
	 * 
	 * Methode save exposee 
	 * @param une entitee generique 
	 * @return Map<String, Object> 
	 * 
	 */
	@Override
	public Map<String, Object> save(Formule formule) {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", HttpStatus.OK);
		formule.setDate(ZonedDateTime.now());
		response.put("data",service.saveOrUpdate(formule));
		return response;
	}
}
