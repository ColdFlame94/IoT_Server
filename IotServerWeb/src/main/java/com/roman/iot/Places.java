package com.roman.iot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity 
public class Places {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @NotNull
    private String address;
    @NotNull
    private long phone;
    
    public Places() {}
 
    public Places(String address, long phone) {
		
		this.address = address;
		this.phone = phone;
	}
    
    public Places(long id) {
		
		this.id=id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
}



