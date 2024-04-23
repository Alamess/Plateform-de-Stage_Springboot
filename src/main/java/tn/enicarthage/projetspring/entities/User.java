package tn.enicarthage.projetspring.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NamedQuery(
		name="findByEmail",
        query="SELECT c FROM User c WHERE c.email =:email"
)
@Entity
@Data	
@AllArgsConstructor
@NoArgsConstructor
@Table(name="USER")

public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long Id;
	@Column(name="Nom")
	private String Nom;
	@Column(name="Prenom")
	private String Prenom;
	@Column(name="email")
	private String email;
	@Column(name="Mdp")
	private String Mdp;
	@Column(name="Role")
	private String Role; //0: Etudiant 1:Societé 2:Admin
	
}
