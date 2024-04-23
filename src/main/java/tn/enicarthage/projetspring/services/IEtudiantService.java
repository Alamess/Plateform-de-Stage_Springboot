package tn.enicarthage.projetspring.services;
import java.util.Map;

import tn.enicarthage.projetspring.entities.Etudiant;
import tn.enicarthage.projetspring.entities.Stage;

public interface IEtudiantService {
	public void AjouterFavoris(Long etd,Long s);
	public String SupprimerFavoris(Long etd,Long s);
}
