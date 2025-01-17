package fr.univ.rouen.stbserver.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univ.rouen.stbserver.model.Client;



@Repository
public interface IClientDao extends JpaRepository<Client, Integer> {
	public  Optional<Client> findById(Integer id);
	public List<Client> findAll();
	
}
