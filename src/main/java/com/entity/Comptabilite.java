package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
	
	@Column(name = "COMPTABILITE_TTC")
	private Double ttc;
	
	@Column(name = "COMPTABILITE_PRIXCONSULTATION")
	private Double prixConsultation;

}
