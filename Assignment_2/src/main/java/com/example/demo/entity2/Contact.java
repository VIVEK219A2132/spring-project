package com.example.demo.entity2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	private Long id;
	private String name;
	private String email;
	private String contactno;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(Long id, String name, String email, String contactno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactno = contactno;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
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

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", contactno=" + contactno + "]";
	}
	
}
