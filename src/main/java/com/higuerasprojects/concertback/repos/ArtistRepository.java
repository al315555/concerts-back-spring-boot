/**
 *  Repository concert database access 
 */
package com.higuerasprojects.concertback.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higuerasprojects.concertback.model.Artist;

/**
 * @author ruhiguer
 *
 */
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
