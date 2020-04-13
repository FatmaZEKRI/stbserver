package fr.univ.rouen.stbserver.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement(name = "stb")
@XmlAccessorType(XmlAccessType.NONE)
public class STB implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stb_id")
	@XmlAttribute(required = false)
	private Integer id;
	@XmlElement
	@Column(name = "title")
	private String title;
	@XmlElement
	@Column(name = "version")
	private float version;
	@XmlElement
	@Column(name = "date")
	private String date;
	@XmlElement
	@Column(name = "description")
	private String description;
	@XmlElement
	@OneToOne(cascade= CascadeType.ALL)
	private Client client;
	@XmlElement
	@OneToOne(cascade=CascadeType.ALL)
	private Team team;
	@XmlElement
	@OneToOne(cascade=CascadeType.ALL)
	private Detail detail ;
	public STB(String title, int version, String date, String descr/*, Client client*/) {
		
		
		this.title = title;
		this.version = version;
		this.date = date;
		this.description = descr;
		//this.client = client;
	}
	public STB() {
	}
	@Override
	public String toString() {
		return ("STB [Title=" + title + ",Version=" + version 
				+ ",Date=" + date + ",Description=" + description + "]");
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public float getVersion() {
		return this.version;
	}
	public void setVersion(float version) {
		this.version=version;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String descr) {
		this.description=descr;		
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