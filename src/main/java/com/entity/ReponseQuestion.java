package com.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

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
public class ReponseQuestion {
	
	@EmbeddedId
	@Column(name = "REPONSEQUESTION_ID")
	private ReponseQuestionId id;
	
	@Column(name = "REPONSEQUESTION_REPONSE")
	private int reponse;

}
