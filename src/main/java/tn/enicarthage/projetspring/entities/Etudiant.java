package tn.enicarthage.projetspring.entities;

import java.util.ArrayList;

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
	private String Filiere;
	private int Type ; 
	private ArrayList<Long> Favoris=new ArrayList<>();
	

}
