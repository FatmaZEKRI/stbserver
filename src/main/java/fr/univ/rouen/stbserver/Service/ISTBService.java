package fr.univ.rouen.stbserver.Service;

import java.util.List;
import java.util.Optional;

import fr.univ.rouen.stbserver.model.STB;

public interface ISTBService {
	public STB saveSTB(STB stb);
	public STB updateSTB(STB stb);
	public void deleteSTB(Integer stbId);
	public List<STB> findAll();
	public STB findById(Integer id);
	public boolean checkIfIdexists(Integer stbId);
	public STB feindByVersionAndDescription(float version, String description);

}
