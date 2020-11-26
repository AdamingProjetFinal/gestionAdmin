package com.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.QuestionnaireStatic;
import com.services.DaoService;
import com.services.QuestionnaireStaticService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Flavien
 *
 */
@RequestMapping("/QuestionnaireStatic")
@CrossOrigin(origins = "*")
@RestController
@Slf4j
public class QuestionnaireStaticController extends ControllerImpl<QuestionnaireStatic>{
	
	@Autowired
	QuestionnaireStaticService service;
	
	/**
	 * 
	 * Methode findLast exposee 
	 * @return Map<String, Object> 
	 * 
	 */
	@GetMapping("/last")
	public Map<String, Object> findLast() {
		Map<String, Object> response = new HashMap<String, Object>();
			QuestionnaireStatic questionnaire = service.findLastQuestionnaire();
			log.info("recherche");
			response.put("status", HttpStatus.FOUND);
			response.put("data", questionnaire); 
		return response;
	}
}
