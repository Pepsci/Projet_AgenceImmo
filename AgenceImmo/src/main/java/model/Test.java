package model;

import java.sql.Timestamp;

public class Test {
	
	private int id_test;
	private String typebien;
	private String status;
	private String adresse;
	private Double prix;
	private Double surface;
	private int nbrpiece;
	private String imgcouv;
	private Timestamp created_at;
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Test(String status, String adresse, Double prix) {
		super();
		this.status = status;
		this.adresse = adresse;
		this.prix = prix;
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

	@Override
	public String toString() {
		return "Test [status=" + status + ", adresse=" + adresse + ", prix=" + prix + "]";
	}


	public Timestamp getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}


	public int getId_test() {
		return id_test;
	}


	public void setId_test(int id_test) {
		this.id_test = id_test;
	}

}
