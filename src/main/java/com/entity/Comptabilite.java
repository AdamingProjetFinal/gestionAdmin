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
public class Comptabilite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMPTABILITE_ID")
	private Long idComptabilite;
	
	@Column(name = "COMPTABILITE_CONSULTATION")
	private Long idConsultation;
	
	@Column(name = "COMPTABILITE_FRAIS")
	private Double frais;
	
	@Column(name = "COMPTABILITE_GAIN")
	private Double gain;
	
	@Column(name = "FORMULE_DATE")
	private ZonedDateTime date;

}
