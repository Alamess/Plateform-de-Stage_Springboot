package tn.enicarthage.projetspring.web;

import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.services.IStageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/stage")

public class StageController {
	@Autowired
	private IStageService stageServ ;
	@GetMapping("/getone/{id}")
	public ResponseEntity<Stage> afficherStagebyid(@PathVariable Long id ){
		Stage s= stageServ.afficherStagebyid(id);
		return ResponseEntity.ok(s);
	}
}
