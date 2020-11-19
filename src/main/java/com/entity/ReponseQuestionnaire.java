package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

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
public class ReponseQuestionnaire {
	
	@EmbeddedId
	@Column(name = "REPONSEQUESTIONNAIRE_ID")
	private ReponseQuestionnaireId id;
	
	@OneToMany
	@Column(name = "REPONSEQUESTIONNAIRE_REPONSES")
	private List<ReponseQuestionId> listeReponses;
	
	@Column(name = "REPONSEQUESTIONNAIRE_REMARQUES")
	private String remarques;
	

}
