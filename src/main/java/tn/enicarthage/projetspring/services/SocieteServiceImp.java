package tn.enicarthage.projetspring.services;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import tn.enicarthage.projetspring.entities.Societe;
import tn.enicarthage.projetspring.entities.User;
import tn.enicarthage.projetspring.utils.MessageUtils;
@Service
public class SocieteServiceImp implements ISocieteService{
	public Societe getSocieteFormMap(Map<String,String> requestMap) {
		 Societe user =new Societe();
	     user.setNom(requestMap.get("Nom"));
	     user.setPrenom(requestMap.get("Prenom"));
	     user.setEmail(requestMap.get("Email"));
	     BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder();
	     String mdp=bcrypt.encode(requestMap.get("Mdp"));
	     user.setMdp(mdp);
	        
	       // user.setMdp(new BCryptPasswordEncoder(10).encode(Mdp));
	     user.setRole(requestMap.get("Role"));
	     user.setNomSociete(requestMap.get("NomSociete"));
	     user.setEmplacement(requestMap.get("Emplacement"));
	        
	        
	        //User savedUser = UserRepo.save(user);
	        
	        return user;

	 }
	/*@Override
	public ResponseEntity<String> PostStage(@RequestBody Map<String, String> Request) 
	{
		try {
			if (validationSignUpMap(requestMap)) {
				
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		 return MessageUtils.getResponseEntity("SOME_THING_WENT_WRONG", HttpStatus.BAD_REQUEST);

	}
	private boolean validationStageMap(Map<String,String> requestMap) {
		 return requestMap.containsKey("description")&&requestMap.containsKey("dateDebut");
	 }*/

}
