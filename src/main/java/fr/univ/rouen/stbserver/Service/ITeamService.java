package fr.univ.rouen.stbserver.Service;

import fr.univ.rouen.stbserver.model.Team;

public interface ITeamService {
	public Team save(Team team);
	public void delete(Integer id);

}
