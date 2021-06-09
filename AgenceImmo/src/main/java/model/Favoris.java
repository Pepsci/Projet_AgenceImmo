package model;

public class Favoris {

	private int idFav;
	private String mail;
	private int idBien;
	
	public Favoris() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Favoris(String mail, int idBien) {
		super();
		this.mail = mail;
		this.idBien = idBien;
	}

	public int getIdFav() {
		return idFav;
	}

	public void setIdFav(int idFav) {
		this.idFav = idFav;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getIdBien() {
		return idBien;
	}

	public void setIdBien(int idBien) {
		this.idBien = idBien;
	}
}
