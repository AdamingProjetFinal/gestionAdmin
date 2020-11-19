package com.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class ReponseQuestionId implements Serializable {
	
	@ManyToOne
	private Question idQuestion;
	
	@ManyToOne
	private ReponseQuestionnaire idReponseQuestionnaire;
	
	public ReponseQuestionId(Question idQuestion, ReponseQuestionnaire idReponseQuestionnaire) {
		this.idQuestion = idQuestion;
		this.idReponseQuestionnaire = idReponseQuestionnaire;
	}

}
