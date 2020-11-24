package com.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author Flavien
 *
 */
import org.springframework.web.bind.annotation.RestController;

import com.entity.Comptabilite;
@RequestMapping("/Comptabilite")
@CrossOrigin(origins = "*")
@RestController
public class ComptabiliteController extends ControllerImpl<Comptabilite>{

}
