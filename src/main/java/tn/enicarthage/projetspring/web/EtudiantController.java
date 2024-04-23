package tn.enicarthage.projetspring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.projetspring.services.IEtudiantService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {
	@Autowired
	private IEtudiantService EtdServ ;
	static class AjoutFavorisRequest {
        private Long IdEtd;
        private Long IdStage;

        // Getters et Setters
        public Long getIdEtd() {
            return IdEtd;
        }

        public void setIdEtd(Long IdEtd) {
            this.IdEtd = IdEtd;
        }

        public Long getIdStage() {
            return IdStage;
        }

        public void setIdStage(Long IdStage) {
            this.IdStage = IdStage;
        }
    }
	@PostMapping("/AjouterFavoris")
	public String AjouterFavoris(@RequestBody AjoutFavorisRequest Request) {
		Long IdEtd=Request.getIdEtd();
		Long IdStage=Request.getIdStage();
		EtdServ.AjouterFavoris(IdEtd, IdStage);
		return "le stage "+IdStage+"a été ajouter a "+IdEtd;
	}
	@DeleteMapping("/SupprimerFavoris")
	public String SupprimerFavoris(@RequestBody AjoutFavorisRequest Request) {
		Long IdEtd=Request.getIdEtd();
		Long IdStage=Request.getIdStage();
		
		return EtdServ.SupprimerFavoris(IdEtd, IdStage);
	}
	
	

}
