/**
 * Repository concert database access 
 */
package com.higuerasprojects.concertback.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higuerasprojects.concertback.model.Concert;

/**
 * @author ruhiguer
 *
 */
public interface ConcertRepository extends JpaRepository<Concert, Long> {

}
