package fr.univ.rouen.stbserver.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="stbs")
@XmlAccessorType(XmlAccessType.NONE)
public class Stbs {
	@XmlElement
	private List<STB> stb;
	public Stbs(List<STB> stbs) {
		super();
		this.stb = stbs;
	}

	public Stbs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<STB> getStbs() {
		return stb;
	}

	

	public void setStbs(List<STB> stbs) {
		this.stb = stbs;
	}

}
