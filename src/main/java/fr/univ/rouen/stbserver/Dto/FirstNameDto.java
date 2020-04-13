package fr.univ.rouen.stbserver.Dto;

import fr.univ.rouen.stbserver.model.Gender;

public class FirstNameDto {
	private Integer id;
	private Gender gender;
	private  String lastname;
	private String mail;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
