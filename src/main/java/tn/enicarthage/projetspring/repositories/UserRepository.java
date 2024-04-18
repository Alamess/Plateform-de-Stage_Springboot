package tn.enicarthage.projetspring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.enicarthage.projetspring.entities.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long>{

}
