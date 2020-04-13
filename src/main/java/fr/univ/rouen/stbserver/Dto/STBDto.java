package fr.univ.rouen.stbserver.Dto;

import fr.univ.rouen.stbserver.model.Client;
import fr.univ.rouen.stbserver.model.Detail;
import fr.univ.rouen.stbserver.model.Team;

public class STBDto {
	private Integer id;
	private Integer version;
	private String title;

	private String date;

	private String descr;

	private Client client;

	private Team team;

	private Detail detail ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

}
