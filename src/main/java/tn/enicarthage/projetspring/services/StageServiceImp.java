package tn.enicarthage.projetspring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.repositories.StageRepository;
@Service

public class StageServiceImp implements IStageService {
	@Autowired
	private StageRepository stagerepo ;
	public Stage afficherStagebyid(Long id) {
		Optional<Stage>  s = stagerepo.findById(id);
		if (s.isPresent()) {
            return s.get();
        } else {
            throw new RuntimeException("Stage not found with id: " + id);
        }
	}
}
