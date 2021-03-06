package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCrypt;

import database.Connect;
import idao.IDAO;
import model.Client;

public class ClientDao implements IDAO<Client>{
	
	Connection connect = Connect.getConnection();

	@Override
	public boolean create(Client object) {
		boolean message = false;
		
		try {
			PreparedStatement req = connect.prepareStatement("Insert INTO client (nom,prenom,mail,password)"
					+ "value (?,?,?,?");
			
			req.setString(1, object.getNom());
			req.setString(1, object.getPrenom());
			req.setString(1, object.getMail());
			req.setString(1, object.getPassword());
			
			req.executeUpdate();
			
			System.out.println(object.getPrenom() + " "+ object.getNom()+" "+object.getMail()+ "? bien ?t? ajout?");
			
			message = true;
		} catch (Exception e) {
			System.out.println("Erreur lors de la creation du compte Client");
			e.printStackTrace();
		}
		return message;
	}
	
	public Client login(String mail, String password) {
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM client WHERE mail=?");
			req.setString(1, mail);
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				
			if (BCrypt.checkpw(password, rs.getString("password"))) {
				return new Client(rs.getString("nom"),rs.getString("prenom"),rs.getInt("tel")
						 ,rs.getString("password"),rs.getString("mail"),rs.getString("statut"));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Client> read() {
		
		return null;
	}

	@Override
	public boolean update(Client object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Client object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int Id_test) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}
