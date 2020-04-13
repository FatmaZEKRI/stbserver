package fr.univ.rouen.stbserver.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.univ.rouen.stbserver.model.STB;

@Repository
public interface ISTBDao extends JpaRepository<STB, Integer> {
	public  Optional<STB> findById(Integer id);
	public STB findByVersionAndDescription(@Param("version") float version, @Param("descritpion") String description);
	public List<STB> findAll();

}
