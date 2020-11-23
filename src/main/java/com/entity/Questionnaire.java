package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Flavien
 *
 */
//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Questionnaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUESTIONNAIRE_ID")
	private Long id;
	
	@ManyToMany
	@JoinTable(
		name = "QUESTION_QUESTIONNAIRE",
		joinColumns = @JoinColumn(name = "QUESTIONNAIRE_ID"),
		inverseJoinColumns = @JoinColumn(name = "QUESTION_ID"))
	private List<Question> questions;
	
	@OneToMany
	private List<ReponseQuestionnaireId> idReponsesQuestionnaire;

}
