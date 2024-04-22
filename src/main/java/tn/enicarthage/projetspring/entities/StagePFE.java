package tn.enicarthage.projetspring.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("PFE")
public class StagePFE extends Stage {
	
}