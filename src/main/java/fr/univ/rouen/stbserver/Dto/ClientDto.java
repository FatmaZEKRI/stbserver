package fr.univ.rouen.stbserver.Dto;

import java.util.List;


public class ClientDto {
	private Integer id;
	
	private String entity;

	private String firstName;

	private String lastName;
	private List<String> mail;

	private List<String> telephone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getMail() {
		return mail;
	}

	public void setMail(List<String> mail) {
		this.mail = mail;
	}

	public List<String> getTelephone() {
		return telephone;
	}

	public void setTelephone(List<String> telephone) {
		this.telephone = telephone;
	}
}
