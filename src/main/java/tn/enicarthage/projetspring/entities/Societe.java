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
@DiscriminatorValue("SOC")
public class Societe extends User{
	@Column(name="NomSociete")
	private String NomSociete;
	@Column(name="Emplacement")
	private String Emplacement ; 
	
}
