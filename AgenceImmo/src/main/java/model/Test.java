package model;

public class Test {
	
	private int id;
	private String typebien;
	private String status;
	private String adresse;
	private Double prix;
	private Double surface;
	private int nbrpiece;
	private String imgcouv;
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(String typebien, String status, String adresse, Double prix, Double surface, int nbrpiece, String imgcouv) {
		super();
		this.typebien = typebien;
		this.status = status;
		this.adresse = adresse;
		this.prix = prix;
		this.surface = surface;
		this.nbrpiece = nbrpiece;
		this.imgcouv = imgcouv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypebien() {
		return typebien;
	}

	public void setTypebien(String typebien) {
		this.typebien = typebien;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Double getSurface() {
		return surface;
	}

	public void setSurface(Double surface) {
		this.surface = surface;
	}

	public int getNbrpiece() {
		return nbrpiece;
	}

	public void setNbrpiece(int nbrpiece) {
		this.nbrpiece = nbrpiece;
	}

	public String getImgcouv() {
		return imgcouv;
	}

	public void setImgcouv(String imgcouv) {
		this.imgcouv = imgcouv;
	}


}
