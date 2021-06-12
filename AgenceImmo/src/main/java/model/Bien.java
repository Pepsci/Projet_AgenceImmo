package model;

public class Bien {
	
	private int idBien;
	private String typeDeBien;
	private String statut;
	private String adresse;
	private Float prix;
	private Float surface;
	private int nbrPiece;
	private String imgCouv;
	private String ajouteLe;
	private int idClient;
	
	

	public Bien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bien(String typeDeBien, String statut, String adresse, Float prix, float surface, int nbrPiece) {
		super();
		this.typeDeBien = typeDeBien;
		this.statut = statut;
		this.adresse = adresse;
		this.prix = prix;
		this.surface = surface;
		this.nbrPiece = nbrPiece;
	}

	public Bien(String typeDeBien, String statut, String adresse, Float prix, float surface, int nbrPiece,
			String imgCouv, String ajouteLe) {
		super();
		this.typeDeBien = typeDeBien;
		this.statut = statut;
		this.adresse = adresse;
		this.prix = prix;
		this.surface = surface;
		this.nbrPiece = nbrPiece;
		this.imgCouv = imgCouv;
		this.ajouteLe = ajouteLe;
	}

	public Bien(String typeDeBien, String statut, String adresse, Float prix, float surface, int nbrPiece,
			String imgCouv, String ajouteLe, int idClient) {
		super();
		this.typeDeBien = typeDeBien;
		this.statut = statut;
		this.adresse = adresse;
		this.prix = prix;
		this.surface = surface;
		this.nbrPiece = nbrPiece;
		this.imgCouv = imgCouv;
		this.ajouteLe = ajouteLe;
		this.idClient = idClient;
	}

	public int getIdBien() {
		return idBien;
	}

	public void setIdBien(int idBien) {
		this.idBien = idBien;
	}

	public String getTypeDeBien() {
		return typeDeBien;
	}

	public void setTypeDeBien(String typeDeBien) {
		this.typeDeBien = typeDeBien;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public float getPrix() {
		return prix;
	}
	
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	
	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	public int getNbrPiece() {
		return nbrPiece;
	}

	public void setNbrPiece(int nbrPiece) {
		this.nbrPiece = nbrPiece;
	}

	public String getAjouteLe() {
		return ajouteLe;
	}

	public void setAjouteLe(String ajouteLe) {
		this.ajouteLe = ajouteLe;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getImgCouv() {
		return imgCouv;
	}

	public void setImgCouv(String imgCouv) {
		this.imgCouv = imgCouv;
	}
	

}
