package com;

import java.time.ZonedDateTime;
import java.util.Random;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.entity.Admin;
import com.entity.Formule;
import com.entity.QuestionnaireStatic;
import com.entity.ReponseStatic;
import com.services.AdminService;
import com.services.ComptabiliteService;
import com.services.FormuleService;
import com.services.QuestionnaireStaticService;
import com.services.ReponseStaticService;


@EnableDiscoveryClient
@SpringBootApplication
public class GestionAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionAdminApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start( AdminService adminService,
			QuestionnaireStaticService questionService,
			ReponseStaticService reponseService,
			FormuleService formuleService,
			ComptabiliteService comptabiliteService) {
		
		QuestionnaireStatic q = new QuestionnaireStatic(null, "Votre médecin a-t-il été rapide ?", "Rapidité", "Votre médecin a-t-il été à votre écoute ?", "Attention", "Vous a-t-on bien accueilli chez votre médecin?", "Accueil", "Est-ce que votre médecin respecte la confidentialité de votre consultation ?", "Confidentialité");
		ReponseStatic r1 = new ReponseStatic(null, 1L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));
		ReponseStatic r2 = new ReponseStatic(null, 2L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));
		ReponseStatic r3 = new ReponseStatic(null, 3L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));
		ReponseStatic r4 = new ReponseStatic(null, 4L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));
		ReponseStatic r5 = new ReponseStatic(null, 5L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));
		ReponseStatic r8 = new ReponseStatic(null, 8L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));
		ReponseStatic r9 = new ReponseStatic(null, 9L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));
		ReponseStatic r10 = new ReponseStatic(null, 10L, q , new Random().nextInt(6), new Random().nextInt(6),new Random().nextInt(6),new Random().nextInt(6));

		return (args)->{
			Stream.of(q).forEach( item ->questionService.saveOrUpdate( item ) );
			Stream.of(r1,r2,r3,r4,r5,r8,r9,r10).forEach( item ->reponseService.saveOrUpdate( item ) );
			formuleService.saveOrUpdate(new Formule(null,ZonedDateTime.now(),20D));
			adminService.saveOrUpdate(new Admin(null, "admin", "admin"));
		};
	}
};
