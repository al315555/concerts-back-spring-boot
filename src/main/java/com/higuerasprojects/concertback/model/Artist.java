/**
 * 
 */
package com.higuerasprojects.concertback.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ruhiguer
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Artist implements Serializable{

	/**
	 *  Auto-generated UID for class specification serialization -> ARTIST
	 */
	private static final long serialVersionUID = -971546151152760580L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTIST_SEQ")
	@JsonFormat
	private long id;
	@Getter
	@Setter
	@JsonFormat
	private String name;
	@Getter
	@Setter
	@JsonFormat
	private String realname;
	@Getter
	@Setter
	@JsonFormat
	private double bornlocationLat;
	@Getter
	@Setter
	@JsonFormat
	private double bornlocationLon;
	@Getter
	@Setter
	@JsonFormat
	private String bornlocationname;
	@Getter
	@Setter
	@JsonFormat
	private String biography;
	@Getter
	@Setter
	@JsonFormat
	private String picture;
	
}
