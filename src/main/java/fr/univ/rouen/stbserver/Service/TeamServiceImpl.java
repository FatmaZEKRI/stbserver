package fr.univ.rouen.stbserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univ.rouen.stbserver.Repository.ITeamDao;
import fr.univ.rouen.stbserver.model.Team;

@Service("teamService")
@Transactional
public class TeamServiceImpl implements ITeamService{
	@Autowired
	private ITeamDao teamDao;

	@Override
	public Team save(Team team) {
		return this.teamDao.save(team);
	}

	@Override
	public void delete(Integer id) {
		this.teamDao.deleteById(id);
		
	}

}
