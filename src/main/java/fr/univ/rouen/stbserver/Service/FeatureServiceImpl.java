package fr.univ.rouen.stbserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univ.rouen.stbserver.Repository.IFeatureDao;
import fr.univ.rouen.stbserver.model.Feature;
@Service("featureService")
@Transactional
public class FeatureServiceImpl implements IFeatureService {
	@Autowired
	private IFeatureDao featureDao; 

	@Override
	public Feature save(Feature ft) {
		
		return this.featureDao.save(ft);
	}

	@Override
	public void delete(Integer idft) {
		this.featureDao.deleteById(idft);
		
	}

}
