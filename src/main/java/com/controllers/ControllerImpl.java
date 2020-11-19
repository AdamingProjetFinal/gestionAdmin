/**
 * 
 */
package com.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.controllers.ControllerImpl;
import com.services.DaoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Florian
 *
 */
@Slf4j
public class ControllerImpl<O> implements IController<O>{
	@Autowired
	DaoService<O> service;
	
	/**
	 * 
	 * Methode save exposee 
	 * @param une entitee generique 
	 * @return Map<String, Object> 
	 * 
	 */
	@Override
	public Map<String, Object> save(O o) {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", HttpStatus.OK);
		response.put("data",service.saveOrUpdate(o));
		return response;
	}

	/**
	 * 
	 * Methode update exposee 
	 * @param une entitee generique 
	 * @return Map<String, Object> 
	 * 
	 */
	@Override
	public Map<String, Object> update(O o) {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", HttpStatus.OK);
		response.put("data", service.saveOrUpdate(o));
		return response;
	}

	

	/**
	 * 
	 * Methode delete exposee 
	 * @param id : l'id de l'entite a supprimer 
	 * @return Map<String, Object> 
	 * 
	 */
	@Override
	public Map<String, Object> delete(Long id) {
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			service.delete(id);
			response.put("status", HttpStatus.OK);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
		response.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}

	/**
	 * 
	 * Methode find exposee 
	 * @param id : l'id de l'entite a supprimer 
	 * @return Map<String, Object> 
	 * 
	 */
	@Override
	public Map<String, Object> find(Long id) {
		Map<String, Object> response = new HashMap<String, Object>();
			O obj = service.find(id);
			log.info("recherche");
			response.put("status", HttpStatus.FOUND);
			response.put("data", service.find(id)); 
		return response;
	}

	/**
	 * 
	 * Methode findAll exposee 
	 * @return List<O> 
	 * 
	 */
	@Override
	public List<O> findAll() {
		return service.findAll();
	}

}
