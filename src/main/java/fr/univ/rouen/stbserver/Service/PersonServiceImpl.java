package fr.univ.rouen.stbserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univ.rouen.stbserver.Repository.IPersonDao;
import fr.univ.rouen.stbserver.model.Person;


@Service("personService")
@Transactional
public class PersonServiceImpl implements IPersonService{
	@Autowired
	private IPersonDao personDao;

	@Override
	public Person save(Person person) {
		
		return this.personDao.save(person);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.personDao.deleteById(id);
	}

}
