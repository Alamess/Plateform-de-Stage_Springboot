package tn.enicarthage.projetspring.services;
import java.util.List;

import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.entities.StageETE;
import tn.enicarthage.projetspring.entities.StagePFE;

public interface IStageService {
 public List<Stage> getall() ;
 public String scraperHiinterns();
 public List<StagePFE> getallPFE();
 public List<StageETE> getallETE();
 public List<StageETE> getallE() ;
}