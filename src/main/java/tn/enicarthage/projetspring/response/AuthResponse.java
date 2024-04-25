package tn.enicarthage.projetspring.response;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AuthResponse {
	
	private String jwt;
	private String message;
	private String Nom;
	private String Prenom;
	private Long Id;
	private String Filiere;
	private ArrayList<Long> Favoris=new ArrayList<>();
	private String Role;

}