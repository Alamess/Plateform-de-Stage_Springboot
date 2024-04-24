package tn.enicarthage.projetspring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import tn.enicarthage.projetspring.entities.User;

@RepositoryRestResource
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByEmail(@Param("email") String email);

}
