package fr.univ.rouen.stbserver.Service;

import fr.univ.rouen.stbserver.model.Feature;

public interface IFeatureService {
	public Feature save(Feature ft);
	public void delete(Integer idft);

}
