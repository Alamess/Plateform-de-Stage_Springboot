package tn.enicarthage.projetspring.web;

import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.entities.StageETE;
import tn.enicarthage.projetspring.entities.StagePFE;
import tn.enicarthage.projetspring.services.IStageService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/stage")

public class StageController {
	@Autowired
	private IStageService stageServ ;
	@GetMapping("/getall")
	public ResponseEntity<List<Stage>> getStages(){
		List<Stage> s= stageServ.getall();
		return ResponseEntity.ok(s);
	}
	@GetMapping("/getallPFE")
	public ResponseEntity<List<StagePFE>> getStagesPFE(){
		List<StagePFE> s= stageServ.getallPFE();
		return ResponseEntity.ok(s);
	}
	@GetMapping("/getallETE")
	public ResponseEntity<List<StageETE>> getStagesETE(){
		List<StageETE> s= stageServ.getallETE();
		return ResponseEntity.ok(s);
	}
	@GetMapping("/scraping")
	public ResponseEntity<String> getAllStages(){
		return ResponseEntity.ok(stageServ.scraperHiinterns());
	}
}
