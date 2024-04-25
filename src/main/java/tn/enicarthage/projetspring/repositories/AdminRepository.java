package tn.enicarthage.projetspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enicarthage.projetspring.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
	
}
