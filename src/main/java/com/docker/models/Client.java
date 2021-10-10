package com.docker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	private String fullName;
	
	
	public Client(Long idClient, String fullName) {
		super();
		this.idClient = idClient;
		this.fullName = fullName;
	}


	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdClient() {
		return idClient;
	}


	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
