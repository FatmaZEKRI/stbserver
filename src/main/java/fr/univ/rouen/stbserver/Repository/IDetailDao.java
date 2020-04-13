package fr.univ.rouen.stbserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univ.rouen.stbserver.model.Detail;


@Repository
public interface IDetailDao extends JpaRepository<Detail, Integer>  {

}
