package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Florian
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReponseStatic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REPONSE_STAT_ID")
	private Long id;
	
	@Column(name = "REPONSE_STAT_IDCONSULT")
	private Long idConsultation;
	
	@ManyToOne
	@JoinColumn(name = "QUESTIONNAIRE_ID", referencedColumnName = "QUESTIONNAIRESTAT_ID")
	private QuestionnaireStatic questionnaire;
	
	@Column(name = "REPONSE_STAT_REP1")
	private int reponse1;
	
	@Column(name = "REPONSE_STAT_REP2")
	private int reponse2;

	@Column(name = "REPONSE_STAT_REP3")
	private int reponse3;

	@Column(name = "REPONSE_STAT_REP4")
	private int reponse4;

}
