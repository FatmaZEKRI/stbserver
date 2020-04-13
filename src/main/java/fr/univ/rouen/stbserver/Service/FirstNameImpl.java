package fr.univ.rouen.stbserver.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univ.rouen.stbserver.Repository.IFirstNameDao;
import fr.univ.rouen.stbserver.model.FirstName;


@Service("firstNameService")
@Transactional
public class FirstNameImpl implements IFirstNameService {
	
	@Autowired
	IFirstNameDao firstnameDao;

	@Override
	public FirstName saveFirstName(FirstName fs) {
		
		return firstnameDao.save(fs);
	}

	@Override
	public FirstName update(FirstName fs) {
		
		return firstnameDao.save(fs);
	}

	@Override
	public void deleteFirstName(Integer fsId) {
		this.firstnameDao.deleteById(fsId);
		
	}

	@Override
	public List<FirstName> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkIfIdexists(Integer fsId) {
		// TODO Auto-generated method stub
		return false;
	}

}
