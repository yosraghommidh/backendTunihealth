package tn.enicarthage.TuniHealth.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import tn.enicarthage.TuniHealth.dao.PatientRepo;
import tn.enicarthage.TuniHealth.dao.RoleDao;
import tn.enicarthage.TuniHealth.dao.UserDao;
import tn.enicarthage.TuniHealth.entity.Patient;
import tn.enicarthage.TuniHealth.entity.Role;
import tn.enicarthage.TuniHealth.entity.User;
 
@Service
public class PatientService {
	@Autowired 	PatientRepo patRepo;
	@Autowired 	UserDao userDao;
	@Autowired 	RoleDao roleDao;
	@Autowired UserService userserv;
	@Autowired
    private PasswordEncoder passwordEncoder;
	  public Patient save(Patient patient) {
		  System.out.println("the pass"+patient.getPatPassword());
		  System.out.println("the pass"+patient.getPatFirstName());
		  User user = new User();
		  Role role = roleDao.findById("Patient").get();
	        Set<Role> userRoles = new HashSet<>();
	        userRoles.add(role);
	        user.setUserName(patient.getPatName());
	        user.setUserFirstName(patient.getPatFirstName());
	        user.setUserLastName(patient.getPatLastName());
	        user.setRole(userRoles);
	        user.setUserPassword(getEncodedPasswordPat(patient.getPatPassword()));
	        userDao.save(user);
	        return patRepo.save(patient);
	                             
	    }
	  public String getEncodedPasswordPat(String password) {
	        return passwordEncoder.encode(password);
	    }
}
