package tn.enicarthage.projetspring.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NamedQuery(
		name="findByEmail",
		query="SELECT c FROM User c WHERE c.email=:email")


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Nom;
	private String Prenom;
	private String email;
	private String Mdp;
	private int Role; //0: Etudiant 1:Societé 2:Admin
	
}
