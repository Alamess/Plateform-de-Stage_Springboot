package tn.enicarthage.projetspring.services;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.repositories.StageRepository;
@Service
@CrossOrigin(origins = "http://localhost:58809/home") 
public class StageServiceImp implements IStageService {
	@Autowired
	private StageRepository stagerepo ;
	public List<Stage> getall() {
            return stagerepo.findAll();
	}
	public String scraperHiinterns() {
        int startPage = 1;
        int endPage = 30;
        String urlPattern = "https://hi-interns.com/internships?page=%d";
        List<Stage> allStageData = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        for (int pageNumber = startPage; pageNumber <= endPage; pageNumber++) {
            String currentUrl = String.format(urlPattern, pageNumber);
            try {
                Document doc = Jsoup.connect(currentUrl).get();
                Elements stageCards = doc.select("div.flex.flex-col.gap-2");

                for (Element stageCard : stageCards) {
                    String stageTitle = stageCard.select("a.mr-11.line-clamp-2.text-base.font-bold.text-gray-800").text().trim();
                    String stageSociete = stageCard.select("p.text-xs.text-gray-500").text().trim();
                    String description = stageCard.select("p.mb-2.text-sm.font-medium.text-gray-700").text().trim();
                    Stage stage = new Stage();
                    stage.setTitre(stageTitle);
                    stage.setNom(stageSociete);
                    stage.setDescription(description);
                    if(description!=""|stageTitle!=""|stageSociete!="") {
                    	Optional<Stage> existant = stagerepo.findByDescriptionAndTitreAndNom(description, stageTitle, stageSociete);
                    	if (!existant.isPresent()) {
                    	  stagerepo.save(stage);
                    	}
                    }
                    allStageData.add(stage);
                }
                
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            return mapper.writeValueAsString(allStageData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Erreur lors de la conversion des données en JSON.";
        }
    }
}