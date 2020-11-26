package com.services;



import java.io.IOException;
import java.util.List;

import com.entity.ReponseStatic;

/**
 * @author Florian
 *
 */
public interface ReponseStaticService extends DaoService<ReponseStatic> {
	/**
	 * @author Florian
	 *
	 */
	public ReponseStatic findReponseByIdConsultation(Long id) ;
	
	/**
	 * @author Florian
	 *
	 */
	public List<ReponseStatic> findReponsesByIdQuestionnaire(Long id) ;
}
