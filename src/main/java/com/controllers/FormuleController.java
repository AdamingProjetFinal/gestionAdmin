package com.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Formule;
/**
 * @author Flavien
 *
 */
@RequestMapping("/Formule")
@CrossOrigin(origins = "*")
@RestController
public class FormuleController extends ControllerImpl<Formule>{

}
