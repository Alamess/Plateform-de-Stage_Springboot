package tn.enicarthage.projetspring.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("ETD")

public class Etudiant extends User{
	@Column(name="Filiere")
	private String Filiere;
	@Column(name="Type")
	private String Type ; 
	@Column(name="Favoris")
	private ArrayList<Long> Favoris=new ArrayList<>();
	

}
