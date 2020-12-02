/**
 * 
 */
package com.higuerasprojects.concertback.model;

import java.io.Serializable;
import java.util.Date;

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
public class Concert implements Serializable{

	/**
	 * Auto-generated UID for class specification serialization -> CONCERT
	 */
	private static final long serialVersionUID = -6426557675774576231L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONCERT_SEQ")
	@JsonFormat
	private long id;
	@Getter
	@Setter
	@JsonFormat
	private String name;
	@Getter
	@Setter
	@JsonFormat
	private String description;
	@Getter
	@Setter
	@JsonFormat
	private int artist;
	@Getter
	@Setter
	@JsonFormat
	private double locationLon;
	@Getter
	@Setter
	@JsonFormat
	private double locationLat;
	@Getter
	@Setter
	@JsonFormat
	private String locationname;
	@Getter
	@Setter
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm")
	private Date time;
	@Getter
	@Setter
	@JsonFormat
	private int maxattendees;
	@Getter
	@Setter
	@JsonFormat
	private int minattendees;
	
}
