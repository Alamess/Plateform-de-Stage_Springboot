package tn.enicarthage.projetspring.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.entities.User;
import tn.enicarthage.projetspring.repositories.UserRepository;
import tn.enicarthage.projetspring.services.IUserService;
import tn.enicarthage.projetspring.utils.MessageUtils;


//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@RestController
@RequestMapping("/User")
@CrossOrigin
public class UserController  {

	@Autowired
	private IUserService UserServ;
	
		//@Autowired
    //private BCryptPasswordEncoder encoder ;

	@PostMapping("/SignUp")
	public ResponseEntity<String> AjouterUser(@RequestBody Map<String, String> Request) {
		try {
			return UserServ.signUp(Request);
		}catch(Exception ex) {
			ex.printStackTrace();
		}return MessageUtils.getResponseEntity("SOME_THING_WENT_WRONG", HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

	
}
