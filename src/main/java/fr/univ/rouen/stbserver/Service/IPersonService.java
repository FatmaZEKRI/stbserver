package fr.univ.rouen.stbserver.Service;

import fr.univ.rouen.stbserver.model.Person;

public interface IPersonService {
	public Person save(Person person);
	public void delete(Integer id);

}
