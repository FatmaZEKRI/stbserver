package fr.univ.rouen.stbserver.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.univ.rouen.stbserver.model.Person;
import fr.univ.rouen.stbserver.model.Team;


@Repository
public interface IPersonDao extends JpaRepository<Person, Integer> {
	//List<Person> findByTeam(@Param("team") Team team);

}
