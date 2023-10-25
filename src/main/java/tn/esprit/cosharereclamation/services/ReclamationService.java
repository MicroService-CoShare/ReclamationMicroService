package tn.esprit.cosharereclamation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.cosharereclamation.entities.Reclamation;
import tn.esprit.cosharereclamation.repositories.ReclamationRepository;
@Service
public class ReclamationService {
    @Autowired
    private ReclamationRepository reclamationRepository;
    public Reclamation addReclamation(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }
}
