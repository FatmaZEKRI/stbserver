package fr.univ.rouen.stbserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "firstname")
@XmlRootElement(name = "firstname")
@XmlAccessorType(XmlAccessType.NONE)
public class FirstName {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@XmlAttribute
	@Column(name = "firstname")
	private String firstname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@XmlAttribute
	@Column(name = "gender")
	private Gender gender;
	@XmlAttribute
	@Column(name = "lastName")
	private  String lastname;
	@XmlAttribute
	@Column(name = "mail")
	private String mail;
	@OneToOne
	private Person person;
	public FirstName() {
		
	}
	public FirstName(Gender g, String ln, String m) {
		this.setGender(g);
		this.setLastname(ln);
		this.setMail(m);
		
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

}
