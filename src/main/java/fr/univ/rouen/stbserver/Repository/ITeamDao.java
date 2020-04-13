package fr.univ.rouen.stbserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univ.rouen.stbserver.model.Team;

@Repository
public interface ITeamDao extends JpaRepository<Team, Integer> {

}
