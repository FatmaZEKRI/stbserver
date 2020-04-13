package fr.univ.rouen.stbserver.Dto;

import java.util.List;

public class TeamDto {
	private Integer id;
	private List<PersonDto> persons;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<PersonDto> getPersons() {
		return persons;
	}
	public void setPersons(List<PersonDto> persons) {
		this.persons = persons;
	}
}
