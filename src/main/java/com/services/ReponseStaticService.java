package com.services;



import java.io.IOException;

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
}
