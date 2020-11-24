package com.entity;

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
	
	@Column(name = "QUESTIONNAIRESTAT_QUES1")
	private String question1;
	@Column(name = "QUESTIONNAIRESTAT_TAG1")
	private String tagQuestion1;
	
	@Column(name = "QUESTIONNAIRESTAT_QUES2")
	private String question2;
	@Column(name = "QUESTIONNAIRESTAT_TAG2")
	private String tagQuestion2;
	
	@Column(name = "QUESTIONNAIRESTAT_QUES3")
	private String question3;
	@Column(name = "QUESTIONNAIRESTAT_TAG3")
	private String tagQuestion3;
	
	@Column(name = "QUESTIONNAIRESTAT_QUES4")
	private String question4;
	@Column(name = "QUESTIONNAIRESTAT_TAG4")
	private String tagQuestion4;

}
