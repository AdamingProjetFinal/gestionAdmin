package com.services.impl;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Formule;
import com.repositories.FormuleRepository;
import com.services.FormuleService;
/**
 * @author Flavien
 *
 */
@Service
public class FormuleServiceImpl extends DaoServiceImpl<Formule> implements FormuleService {

	@Autowired
	FormuleRepository dao;
	@Override
	public Formule findLast() {
		List<Formule> formules = dao.findAll();
		
		return formules.stream().sorted(Comparator.comparing(Formule::getId).reversed()).findFirst().get();
	}

}
