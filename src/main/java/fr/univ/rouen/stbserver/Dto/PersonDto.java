package fr.univ.rouen.stbserver.Dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;


public class PersonDto {
	private Integer id;
	private FirstNameDto firstname;
	private List<String> fonction;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public FirstNameDto getFirstname() {
		return firstname;
	}
	public void setFirstname(FirstNameDto firstname) {
		this.firstname = firstname;
	}
	public List<String> getFonction() {
		return fonction;
	}
	public void setFonction(List<String> fonction) {
		this.fonction = fonction;
	}

}
