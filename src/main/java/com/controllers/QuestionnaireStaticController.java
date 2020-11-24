package com.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.QuestionnaireStatic;

/**
 * @author Flavien
 *
 */
@RequestMapping("/QuestionnaireStatic")
@CrossOrigin(origins = "*")
@RestController
public class QuestionnaireStaticController extends ControllerImpl<QuestionnaireStatic>{

}
