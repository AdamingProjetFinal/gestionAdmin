package com.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Data;
/**
 * @author Flavien
 *
 */
@SuppressWarnings("serial")
@Data
@Embeddable
public class ReponseQuestionnaireId implements Serializable {
	
	private Long idUtilisateur;
	
	@ManyToOne
	private Questionnaire idQuestionnaire;
	
	public ReponseQuestionnaireId (Long idUtilisateur, Questionnaire idQuestionnaire) {
		this.idUtilisateur = idUtilisateur;
		this.idQuestionnaire = idQuestionnaire;
	}

}
