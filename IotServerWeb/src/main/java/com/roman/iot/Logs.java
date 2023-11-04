package com.roman.iot;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "logs")
public class Logs {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @NotNull
    private String message;
    @NotNull
    private Timestamp date_time;
    
 
    public Logs(@NotNull String message, @NotNull Timestamp date_time) {
		
		this.message = message;
		this.date_time = date_time;
	}
}


