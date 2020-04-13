package fr.univ.rouen.stbserver.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement(name = "detail")
@XmlAccessorType(XmlAccessType.NONE)
public class Detail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	
	@XmlElement(name="feature")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Feature>features ;
	@OneToOne
	private STB stb;
	
	
	public Detail() {
		this.features = new ArrayList<Feature>();
		
	}
	
	public Detail(List<Feature> feature){
		this.features = feature;
		
	}
	
	public List<Feature> getFeatures(){
		return this.features;
	}
	public void setFeatures(List<Feature> f) {
		this.features = f;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
