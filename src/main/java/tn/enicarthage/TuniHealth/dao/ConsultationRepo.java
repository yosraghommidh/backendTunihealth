package tn.enicarthage.TuniHealth.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.TuniHealth.entity.Consultation;
@Repository
public interface ConsultationRepo extends CrudRepository<Consultation, Long>{

}
