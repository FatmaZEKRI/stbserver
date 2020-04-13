package fr.univ.rouen.stbserver.Dto;

import java.util.List;
public class DetailDto {
    private Integer id;
	private List<FeatureDto>features ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<FeatureDto> getFeatures() {
		return features;
	}
	public void setFeatures(List<FeatureDto> features) {
		this.features = features;
	}
}
