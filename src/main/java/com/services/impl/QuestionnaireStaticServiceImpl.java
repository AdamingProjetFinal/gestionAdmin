package com.services.impl;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.QuestionnaireStatic;
import com.repositories.QuestionnaireStaticRepository;
import com.services.QuestionnaireStaticService;

/**
 * @author Flavien
 *
 */
@Service
public class QuestionnaireStaticServiceImpl extends DaoServiceImpl<QuestionnaireStatic> implements QuestionnaireStaticService {

	@Autowired
	QuestionnaireStaticRepository dao;

	@Override
	public QuestionnaireStatic findLastQuestionnaire() {
		List<QuestionnaireStatic> listQuestionnaire = dao.findAll();
		
		return listQuestionnaire.stream().sorted(Comparator.comparing(QuestionnaireStatic::getId).reversed()).findFirst().get();
	}
}
