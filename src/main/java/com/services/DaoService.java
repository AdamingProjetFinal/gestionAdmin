/**
 * 
 */
package com.services;

import java.util.List;

/**
 * @author Florian
 *
 */
public interface DaoService<O> {
	
	O saveOrUpdate(O obj);
	void delete(Long id);
	O find (Long id);
	List<O> findAll();

}
