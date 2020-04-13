package fr.univ.rouen.stbserver.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
@Entity
@XmlRootElement(name = "team")
@XmlAccessorType(XmlAccessType.NONE)
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@XmlElement(name="person")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Person> persons;
	
	@OneToOne
	private STB stb;
	
	
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team (List<Person> ls) {
		//assert((ls.size() >2) && (ls.size() > 8));
			this.persons = ls;
	}
	
	public List<Person> getPersons() {   
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
