/**
 * 
 */
package com.higuerasprojects.concertback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.higuerasprojects.concertback.model.Artist;
import com.higuerasprojects.concertback.model.Concert;
import com.higuerasprojects.concertback.repos.ArtistRepository;
import com.higuerasprojects.concertback.repos.ConcertRepository;

/**
 * @author ruhiguer
 *
 */
@RestController
@RequestMapping("/server/v1/api/main")
public class MainController {
	
	/**
	 * CONCERTS REST SERVICES
	 */
	
	@Autowired
	private ConcertRepository concertRepo;
	
	@GetMapping("/allconcerts")
	public List<Concert> allConcertsGetRestAPI() {
		List<Concert> concerts = concertRepo.findAll();
		return concerts;
	}
	
	@GetMapping("/concert/{id}")
	public Concert concertGetRestAPI(@PathVariable("id") long id) {
		return concertRepo.getOne(id);
	}
	
	@PostMapping("/concert/newone")
	@ResponseStatus(HttpStatus.OK)
	public void createConcertPostRestAPI(@RequestBody Concert concert) {
		concertRepo.save(concert);
	}
	
	/**
	 *  ARTISTS REST SERVICES
	 */
	
	@Autowired
	private ArtistRepository artistRepo;
	
	@GetMapping("/allartists")
	public List<Artist> allArtistsGetRestAPI() {
		List<Artist> artists = artistRepo.findAll();
		return artists;
	}
	
	@GetMapping("/artist/{id}")
	public Artist artistGetRestAPI(@PathVariable("id") long id) {
		return artistRepo.getOne(id);
	}
	
	@PostMapping("/artist/newone")
	@ResponseStatus(HttpStatus.OK)
	public void createArtistPostRestAPI(@RequestBody Artist artist) {
		artistRepo.save(artist);
	}
	
	
}
