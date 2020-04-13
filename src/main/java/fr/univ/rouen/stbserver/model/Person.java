package fr.univ.rouen.stbserver.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.NONE)
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@XmlElement
	@OneToOne(cascade=CascadeType.ALL)
	private FirstName firstname;
	
	@XmlElement(name = "function")
	@Column
	private String fonction;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(FirstName fs,String f) {
		this.firstname = fs;
		this.fonction = f;
	}
	
	public FirstName getFirstname() {
		return firstname;
	}
	public void setFirstname(FirstName firstname) {
		this.firstname = firstname;
	}
	
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

}
 