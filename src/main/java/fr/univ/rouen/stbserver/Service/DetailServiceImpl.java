package fr.univ.rouen.stbserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univ.rouen.stbserver.Dto.DetailDto;
import fr.univ.rouen.stbserver.Repository.IDetailDao;
import fr.univ.rouen.stbserver.model.Detail;
@Service("detailService")
@Transactional
public class DetailServiceImpl implements IDetailService {
	@Autowired
	IDetailDao detailDao;

	@Override
	public Detail saveDetail(Detail dt) {
		
		return this.detailDao.save(dt);
	}

	@Override
	public Detail update(Detail dt) {
		
		return this.detailDao.save(dt);
	}

	@Override
	public void deleteDetail(Integer dtId) {
		this.detailDao.deleteById(dtId);
		
	}

}
