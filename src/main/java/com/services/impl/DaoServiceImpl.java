/**
 * 
 */
package com.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.repositories.DaoRepository;
import com.services.DaoService;

/**
 * @author Florian
 *
 */
public class DaoServiceImpl<O> implements DaoService<O>{

	@Autowired
	DaoRepository<O> dao;
	
	/**
	 * Methode de sauvegarde ou mise a jour generique 
	 */
	@Override
	public O saveOrUpdate(O obj) {
		return dao.save(obj);
	}

	/**
	 * Methode de suppression generique 
	 */
	@Override
	public void delete(Long id) {
		dao.deleteById(id);
	}

	/**
	 * Methode de recherche generique 
	 */
	@Override
	public O find(Long id) {
		return dao.findById(id).get();
	}

	/**
	 * Methode de recherche de toutes les entites generique 
	 */
	@Override
	public List<O> findAll() {
		return dao.findAll();
	}
}
