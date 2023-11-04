package com.roman.iot;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "devices")
public class Devices {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NotNull
	private String type;
	@NotNull
	private String name;
	@NotNull
	private int Place_ID;
	@NotNull
	private int Client_ID;
	@NotNull 
	private String state1_name;
	@NotNull
	private String curr_state1;
	@NotNull
	private String state2_name;
	@NotNull
	private String curr_state2;
	@NotNull
	private Integer connected;
	@NotNull
	private Timestamp date_time;    

	public Devices(){
		
	}
	
	public Devices(long id, @NotNull String type, @NotNull String name, @NotNull int place_ID, @NotNull int client_ID,
			@NotNull String state1_name, @NotNull String curr_state1, @NotNull String state2_name, @NotNull String curr_state2,
			@NotNull Integer connected, @NotNull Timestamp date_time) {
		
		this.id = id;
		this.type = type;
		this.name = name;
		this.Place_ID = place_ID;
		this.Client_ID = client_ID;
		this.state1_name = state1_name;
		this.curr_state1 = curr_state1;
		this.state2_name = state2_name;
		this.curr_state2 = curr_state2;
		this.connected = connected;
		this.date_time = date_time;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getClient_ID() {
		return Client_ID;
	}
	
	public String getState1_name() {
		return state1_name;
	}
	public void setState1_name(String state1_name) {
		this.state1_name = state1_name;
	}
	
	public String getCurr_state1() {
		return curr_state1;
	}
	public void setCurr_state1(String curr_state1) {
		this.curr_state1 = curr_state1;
	}
	
	public String getState2_name() {
		return state2_name;
	}
	public void setState2_name(String state2_name) {
		this.state2_name = state2_name;
	}
	
	public String getCurr_state2() {
		return curr_state2;
	}
	public void setCurr_state2(String curr_state2) {
		this.curr_state2 = curr_state2;
	}
	
	public void setConnected(Integer connected) {
		this.connected = connected;
	}
	
	public void setDate_time(Timestamp  date_time) {
		this.date_time = date_time;
	}
	
}

