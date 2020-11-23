package com.entity;

import java.util.List;

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
public class QuestionnaireStatic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUESTIONNAIRESTAT_ID")
	private Long id;
	
	@Column(name = "QUESTIONNAIRESTAT_IDCONSULT")
	private Long idConsultation;
	
	@Column(name = "QUESTIONNAIRESTAT_QUES1")
	private String question1;
	@Column(name = "QUESTIONNAIRESTAT_REP1")
	private int reponse1;
	
	@Column(name = "QUESTIONNAIRESTAT_QUES2")
	private String question2;
	@Column(name = "QUESTIONNAIRESTAT_REP2")
	private int reponse2;
	
	@Column(name = "QUESTIONNAIRESTAT_QUES3")
	private String question3;
	@Column(name = "QUESTIONNAIRESTAT_REP3")
	private int reponse3;
	
	@Column(name = "QUESTIONNAIRESTAT_QUES4")
	private String question4;
	@Column(name = "QUESTIONNAIRESTAT_REP4")
	private int reponse4;

}
