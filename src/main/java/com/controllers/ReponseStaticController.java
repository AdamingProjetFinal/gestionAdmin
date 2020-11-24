package com.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ReponseStatic;

/**
 * @author Flavien
 *
 */
@RequestMapping("/ReponseStatic")
@CrossOrigin(origins = "*")
@RestController
public class ReponseStaticController extends ControllerImpl<ReponseStatic>{

}
