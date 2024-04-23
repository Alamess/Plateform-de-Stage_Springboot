package tn.enicarthage.projetspring.services;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface IUserService {

	public Boolean VerifMdp(String mdp);
	public Boolean VerifEmail(String email);
	public ResponseEntity<String> signUp(Map<String, String> requestMap);

}
