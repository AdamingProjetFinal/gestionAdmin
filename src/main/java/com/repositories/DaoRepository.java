/**
 * 
 */
package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Florian
 *
 */
@NoRepositoryBean
public interface DaoRepository<O> extends JpaRepository<O, Long> {
	
}
