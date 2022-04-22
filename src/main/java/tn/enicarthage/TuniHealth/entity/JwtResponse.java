package tn.enicarthage.TuniHealth.entity;

public class JwtResponse {
	private Patient pat;
	private Medecin med;
	

    public Patient getPat() {
		return pat;
	}
	 public Medecin getMed() {
			return med;
		}

	public void setPat(Patient pat) {
		this.pat = pat;
	}

	public void setMed(Medecin med) {
		this.med = med;
	}
	public JwtResponse(Patient pat, String jwtToken) {
		super();
		this.pat = pat;
		this.jwtToken = jwtToken;
	}

	private User user;
    private String jwtToken;

    public JwtResponse(User user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
	public JwtResponse(Medecin med, String jwtToken) {
		super();
		this.med = med;
		this.jwtToken = jwtToken;
	}
    
}
