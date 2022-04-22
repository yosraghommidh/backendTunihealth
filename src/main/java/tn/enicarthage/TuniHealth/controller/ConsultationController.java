package tn.enicarthage.TuniHealth.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.TuniHealth.entity.Consultation;
import tn.enicarthage.TuniHealth.service.ConsultationService;
@RestController
public class ConsultationController {
	   @Autowired
	    private ConsultationService ConsultationService;

    @PostMapping({"/registerNewConsultation"})
    public Consultation registerNewConsultation(@RequestBody Consultation Consultation) {
        return ConsultationService.registerNewConsultation(Consultation);
    }

}
