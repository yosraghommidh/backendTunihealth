package tn.enicarthage.TuniHealth.entity;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Medecin {
	
	@Id
    @Column(name = "Medecin_username")
	 private String medName;
    @Column(name = "Medecin_firstName")
    private String medFirstName;    
    @Column(name = "Medecin_Last_name")
    private String medLastName;
    @Column(name = "Medecin_user_Password")
    private String medPassword;
	@Column(name = "Medecin_date_naiss")
	private Date date_naiss;
	@Column(name = "Medecin_duree_cons")
	private int medCons;
	 @Column(name = "Medecin_spécialité")
	    private String medSpecialite;
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "medecin")
    private Set<Consultation> Consultations;
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "medecin")
    @OrderBy("id")
    private Set<CalendrierJour> jours_cal;

	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medecin(String medName, String medFirstName, String medLastName, String medPassword, Date date_naiss,
			int medCons, Set<Consultation> consultations, Set<CalendrierJour> jours_cal, String medSpecialite) {
		super();
		this.medName = medName;
		this.medFirstName = medFirstName;
		this.medLastName = medLastName;
		this.medPassword = medPassword;
		this.date_naiss = date_naiss;
		this.medCons = medCons;
		Consultations = consultations;
		this.jours_cal = jours_cal;
		this.medSpecialite = medSpecialite;

	}




    
	
}
