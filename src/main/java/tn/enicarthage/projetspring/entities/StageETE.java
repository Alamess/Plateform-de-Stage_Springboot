package tn.enicarthage.projetspring.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("ETE")
public  class StageETE extends Stage{

}
