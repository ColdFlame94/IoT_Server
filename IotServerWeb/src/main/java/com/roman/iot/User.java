package com.roman.iot;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; 
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String phone;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private Integer signed;
    
 // Public methods
    
    public User() { }

    public User(long id) { 
      this.id = id;
    }

    public User(@NotNull String name, @NotNull String email, @NotNull String phone, @NotNull String username,
			@NotNull String password, @NotNull Integer signed) {
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.signed = signed;
	}

	public long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

	public void setPhone(String phone) {
		this.phone = phone;
	}

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
