package com.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Flavien
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FORMULE_ID")
	private Long id;
	
	@Column(name = "FORMULE_DATE")
	private ZonedDateTime date;
	
	//Taux à définir
	@Column(name = "FORMULE_TAXE")
	private Double taxe;
	
	@Column(name = "FORMULE_SPEMED")
	private Long idSpecialiteMedecin;
	

}
