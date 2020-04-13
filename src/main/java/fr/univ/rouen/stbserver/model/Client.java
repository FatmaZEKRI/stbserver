package fr.univ.rouen.stbserver.model;

import java.util.List;

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.NONE)
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "entity", nullable = false)
	@XmlElement
	private String entity;
	
	@Column(name = "firstname", nullable = false)
	@XmlElement
	private String firstname;
	
	
	@Column(name = "lastname", nullable = true)
	@XmlElement(required = false)
	private String lastname;
	
	@Column(name = "mail")
	@XmlElement
	private String mail;
	
	@XmlElement(name="tel")
	@Column
	private String telephone;
	

	
	public Client(String entity, String firstname) {
		this.entity = entity;
		this.firstname = firstname;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client (String entity, String firstname, String lastname,String m,String t) {
		this.entity=entity;
		this.firstname= firstname;
		this.lastname=lastname;
		this.mail = m;
		this.telephone = t;
	}

	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	  
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastName) {
		this.lastname = lastName;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


}
