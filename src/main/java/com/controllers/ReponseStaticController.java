package com.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ReponseStatic;
import com.services.ReponseStaticService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Flavien
 *
 */
@RequestMapping("/ReponseStatic")
@CrossOrigin(origins = "*")
@RestController
@Slf4j
public class ReponseStaticController extends ControllerImpl<ReponseStatic> {

	@Autowired
	ReponseStaticService service;

	@GetMapping("/idConsultation/{id}")
	public Map<String, Object> findByIdconsultation(@PathVariable("id") Long id) {
		log.info("Recherche des reponses par l'idConsultation : " + id);
		Map<String, Object> response = new HashMap<String, Object>();
			ReponseStatic r = service.findReponseByIdConsultation(id);
			if (r == null) {
				response.put("status", HttpStatus.NOT_FOUND);
			} else {
				log.info("Medecin trouvé : " + r.toString());
				response.put("status", HttpStatus.FOUND);
				response.put("data", r);
			}
		return response;
	}
}
