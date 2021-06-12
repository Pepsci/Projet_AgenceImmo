package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import database.Connect;
import idao.IDAO;
import model.Bien;

public class BienDao implements IDAO<Bien> {
	
	Connection connect = Connect.getConnection();

	@Override
	public boolean create(Bien object) {
		boolean message = false;
		
		try {
			PreparedStatement req = connect.prepareStatement("INSERT INTO bien (typeBien,statut,adress,prix,surface,nbrPiece,ajoutele)"
					+ "value(?,?,?,?,?,now(),?");
			
			req.setString(1, object.getTypeDeBien());
			req.setString(2, object.getStatut());
			req.setString(3, object.getAdresse());
			req.setFloat(4, object.getPrix());
			req.setFloat(5, object.getSurface());
			req.setInt(6, object.getNbrPiece());
			
			req.executeUpdate();
			
			message = true;
		} catch (Exception e) {
			System.out.println("Erreur lors de l'ajout du bien");
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public List<Bien> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Bien object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Bien object) {
		// TODO Auto-generated method stub
		return false;
	}

}
