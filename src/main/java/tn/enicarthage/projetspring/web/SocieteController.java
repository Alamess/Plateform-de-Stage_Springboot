package tn.enicarthage.projetspring.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.projetspring.services.ISocieteService;
import tn.enicarthage.projetspring.utils.MessageUtils;

@RestController
@RequestMapping("/Societe")

public class SocieteController {
	@Autowired
	private ISocieteService SocServ;
	/*@PostMapping("/PostStage")
	public ResponseEntity<String> AjouterStage(@RequestBody Map<String, String> Request) {
	try {
		return SocServ.PostStage(Request);
	}catch(Exception ex ) {
		ex.printStackTrace();
	}return MessageUtils.getResponseEntity("SOME_THING_WENT_WRONG", HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
}
