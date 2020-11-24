package com.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Flavien
 *
 */

import com.entity.Admin;
@RequestMapping("/Admin")
@CrossOrigin(origins = "*")
@RestController
public class AdminController extends ControllerImpl<Admin> {

}
