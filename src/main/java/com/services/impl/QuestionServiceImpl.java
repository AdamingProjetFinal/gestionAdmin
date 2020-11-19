package com.services.impl;

import org.springframework.stereotype.Service;

import com.entity.Question;
import com.services.QuestionService;

@Service
public class QuestionServiceImpl extends DaoServiceImpl<Question> implements QuestionService {

}
