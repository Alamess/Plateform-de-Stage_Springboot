package tn.enicarthage.projetspring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.projetspring.entities.Etudiant;
import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.repositories.EtudiantRepository;
import tn.enicarthage.projetspring.repositories.StageRepository;

@Service
public class EtudiantServiceImp implements IEtudiantService {
	@Autowired
	private EtudiantRepository EtdRepo;
	@Autowired
	private StageRepository StageRepo;
	public void AjouterFavoris(Long etd,Long s) {
		Etudiant e=EtdRepo.getById(etd);
		e.getFavoris().add(s);
		EtdRepo.save(e);
	}
	public String SupprimerFavoris(Long etd,Long s) {
		Etudiant e=EtdRepo.getById(etd);
		if (e.getFavoris().contains(s)) {
			e.getFavoris().remove(s);
			EtdRepo.save(e);
			return "Succesivement supprimé !";
		} else {
			return "N existe pas !";
			}
	}
}
