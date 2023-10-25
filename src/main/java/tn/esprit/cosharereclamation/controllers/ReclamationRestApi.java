package tn.esprit.cosharereclamation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cosharereclamation.entities.Reclamation;
import tn.esprit.cosharereclamation.services.ReclamationService;

@RestController
public class ReclamationRestApi {


    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("test");
        return "test";
    }
    @Autowired
    private ReclamationService reclamationService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation) {
        return new ResponseEntity<>(reclamationService.addReclamation(reclamation), HttpStatus.OK);
    }

}
