package tn.enicarthage.TuniHealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.TuniHealth.entity.Patient;
import tn.enicarthage.TuniHealth.service.PatientService;
@RestController
public class PatientController {
	 @Autowired
	    private PatientService patService;
	 @PostMapping({"/registerNewPatient"})
	    public Patient save(@RequestBody Patient pat) {
	        return patService.save(pat);
	    }
}
