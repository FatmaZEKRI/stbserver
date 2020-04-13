package fr.univ.rouen.stbserver.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univ.rouen.stbserver.Repository.IClientDao;
import fr.univ.rouen.stbserver.Repository.ISTBDao;
import fr.univ.rouen.stbserver.model.STB;
@Service("StbService")
@Transactional
public class STBServiceImpl implements ISTBService {
	
	@Autowired
	private ISTBDao stbDao;
	@Autowired
	private IClientDao cleintDao;
	@Override
	public STB saveSTB(STB stb) {
		
		return stbDao.save(stb);
	}

	@Override
	public STB updateSTB(STB stb) {
		
		return stbDao.save(stb);
	}

	@Override
	public void deleteSTB(Integer stbId) {
		this.stbDao.deleteById(stbId);		
	}

	@Override
	public boolean checkIfIdexists(Integer stbId) {
		
		return this.stbDao.existsById(stbId);
	}

	@Override
	public List<STB> findAll() {
		
		return this.stbDao.findAll();
	}

	@Override
	public STB findById(Integer id) {
		
		return this.stbDao.findById(id).get();
	}

	@Override
	public STB feindByVersionAndDescription(float version, String description) {
		// TODO Auto-generated method stub
		return this.stbDao.findByVersionAndDescription(version, description);
	}

}
