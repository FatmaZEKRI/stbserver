package fr.univ.rouen.stbserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univ.rouen.stbserver.model.FirstName;


@Repository
public interface IFirstNameDao extends JpaRepository<FirstName, Integer> {
	//public FirstName save(FirstName fs);

}
