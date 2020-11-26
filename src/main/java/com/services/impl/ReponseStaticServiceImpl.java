package com.services.impl;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ReponseStatic;
import com.repositories.ReponseStaticRepository;
import com.services.ReponseStaticService;

/**
 * @author Florian
 *
 */
@Service
public class ReponseStaticServiceImpl extends DaoServiceImpl<ReponseStatic> implements ReponseStaticService {

	@Autowired
	ReponseStaticRepository dao;
	
	@Override
	public ReponseStatic findReponseByIdConsultation(Long id){
		return dao.findByIdConsultation(id);
	}

	@Override
	public List<ReponseStatic> findReponsesByIdQuestionnaire(Long id) {
		return dao.findAll().stream().filter(rep -> rep.getQuestionnaire().getId() == id).collect(Collectors.toList());
	}

}
