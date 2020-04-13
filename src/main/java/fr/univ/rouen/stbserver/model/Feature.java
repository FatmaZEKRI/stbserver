package fr.univ.rouen.stbserver.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement(name = "feature")
@XmlAccessorType(XmlAccessType.NONE)
public class Feature {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	@XmlAttribute
	private String name;
	
	@XmlAttribute
	@Column(name = "section")
	private int section;
	
	@Column(name = "number")
	@XmlAttribute
	private int number;

	@Column(name = "description")
	@XmlElement(name="descritpion")
	private String description;
	
	@Column(name = "priority")
	@XmlElement(name="priority")
	private int priority; 
	
	@Column(name = "delivery")
	@XmlElement(required = false)
	private Date delivery ;
	
	public Feature(String name,  int section, int number, String desc, int priority, Date delivery) {
		this.name = name;
		this.section = section;
		this.number = number;
		this.description = desc;
		this.priority = priority;
		this.delivery = delivery;
	}
	public Feature() {
		
	}
	
	public String getName() {
	return this.name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSection() {
		return this.section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String descritpion) {
		this.description = descritpion;
	}
	
	public int getPriority() {
		return this.priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public Date getDelivery() {
		return this.delivery;
	}
	public void setDelivery(Date delivery) {
		this.delivery = delivery;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	}

