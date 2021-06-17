package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import database.Connect;
import idao.IDAO;
import model.Test;

public class TestDao implements IDAO<Test> {
	
	Connection connect = Connect.getConnection();

	@Override
	public boolean create(Test object) {
		Boolean message = false;
		
		try {
			PreparedStatement req = connect.prepareStatement(""
					+ "Insert INTO test (typebien,status,adresse,prix,surface,nbrpiece,imgcouv)"
					+ "value (?,?,?,?,?,?,?)");
			
			req.setString(1, object.getTypebien());
			req.setString(2, object.getStatus());
			req.setString(3, object.getAdresse());
			req.setDouble(4, object.getPrix());
			req.setDouble(5, object.getSurface());
			req.setInt(6, object.getNbrpiece());
			req.setString(7, object.getImgcouv());
			
			req.executeUpdate();
			
			message = true;
			System.out.println("insert test ok");
		} catch (Exception e) {
			System.out.println("erreur test insert");
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public List<Test> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Test object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Test object) {
		// TODO Auto-generated method stub
		return false;
	}

}
