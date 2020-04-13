package fr.univ.rouen.stbserver.Service;

import java.util.List;

import fr.univ.rouen.stbserver.model.FirstName;




public interface IFirstNameService {
	public FirstName saveFirstName(FirstName fs);
	public FirstName update(FirstName fs);
	public void deleteFirstName(Integer fsId);
	public List<FirstName> findAll();
	public boolean checkIfIdexists(Integer fsId);


}
