package com.repositories;

import org.springframework.stereotype.Repository;

import com.entity.ReponseStatic;

/**
 * @author Florian
 *
 */
@Repository
public interface ReponseStaticRepository extends DaoRepository<ReponseStatic> {
	
	/**
	 * @author Florian
	 * @param id	
	 *
	 */
	public ReponseStatic findByIdConsultation(Long id);

}
