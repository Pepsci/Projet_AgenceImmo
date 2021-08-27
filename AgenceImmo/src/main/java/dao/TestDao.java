package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
	public boolean update(Test object) {
		
		try {
			PreparedStatement req = connect.prepareStatement("UPDATE TEST SET typebien=?, status=?, adresse=?, prix=?, surface=?, nbrpiece=?, imgcouv=?"
					+ "WHERE id_test=?");
			
			req.setString(1, object.getTypebien());
			req.setString(2, object.getStatus());
			req.setString(3, object.getAdresse());
			req.setDouble(4, object.getPrix());
			req.setDouble(5, object.getSurface());
			req.setInt(6, object.getNbrpiece());
			req.setString(7, object.getImgcouv());
			req.setInt(8, object.getId_test());
			
			req.executeUpdate();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean delete(int Id_test) {
		
		try {
			PreparedStatement req = connect.prepareStatement("DELETE FROM test where id_test=?");
			req.setInt(1, Id_test);
			req.executeUpdate();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Test> read() {

		List<Test> list = new ArrayList<>();
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Test test = new Test();
				
				test.setId_test(rs.getInt("id_test"));
				test.setTypebien(rs.getString("typebien"));
				test.setStatus(rs.getString("status"));
				test.setAdresse(rs.getString("adresse"));
				test.setPrix(rs.getDouble("prix"));
				test.setSurface(rs.getDouble("surface"));
				test.setNbrpiece(rs.getInt("nbrpiece"));
				test.setImgcouv(rs.getString("imgcouv"));
				test.setCreated_at(rs.getTimestamp("created_at"));
				
				list.add(test);
			}
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Test> readbyappartementvente() {
		
		List<Test> listappartementvente = new ArrayList<>();
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test WHERE typebien like 'appartement' and status like 'vente'");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Test test = new Test();
				
				test.setId_test(rs.getInt("id_test"));
				test.setStatus(rs.getString("status"));
				test.setAdresse(rs.getString("adresse"));
				test.setPrix(rs.getDouble("prix"));
				test.setSurface(rs.getDouble("surface"));
				test.setNbrpiece(rs.getInt("nbrpiece"));
				test.setImgcouv(rs.getString("imgcouv"));
				
				listappartementvente.add(test);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listappartementvente;
	}
	public List<Test> readbymaisonlocation() {
		
		List<Test> listmaisonlocation = new ArrayList<>();
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test WHERE typebien like 'maison' and status like 'location'");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Test test = new Test();
				
				test.setId_test(rs.getInt("id_test"));
				test.setStatus(rs.getString("status"));
				test.setAdresse(rs.getString("adresse"));
				test.setPrix(rs.getDouble("prix"));
				test.setSurface(rs.getDouble("surface"));
				test.setNbrpiece(rs.getInt("nbrpiece"));
				test.setImgcouv(rs.getString("imgcouv"));
				
				listmaisonlocation.add(test);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listmaisonlocation;
	}
	public List<Test> readbyappartementlocation() {
		
		List<Test> listappartementlocation = new ArrayList<>();
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test WHERE typebien like 'appartement' and status like 'location'");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Test test = new Test();
				
				test.setId_test(rs.getInt("id_test"));
				test.setStatus(rs.getString("status"));
				test.setAdresse(rs.getString("adresse"));
				test.setPrix(rs.getDouble("prix"));
				test.setSurface(rs.getDouble("surface"));
				test.setNbrpiece(rs.getInt("nbrpiece"));
				test.setImgcouv(rs.getString("imgcouv"));
				
				listappartementlocation.add(test);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listappartementlocation;
	}
	
	public List<Test> readbymaisonvente() {
		List<Test> listmaisonvente = new ArrayList<>();
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test WHERE typebien like 'maison' and status like 'vente'");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Test test = new Test();
				
				test.setId_test(rs.getInt("id_test"));
				test.setStatus(rs.getString("status"));
				test.setAdresse(rs.getString("adresse"));
				test.setPrix(rs.getDouble("prix"));
				test.setSurface(rs.getDouble("surface"));
				test.setNbrpiece(rs.getInt("nbrpiece"));
				test.setImgcouv(rs.getString("imgcouv"));
				
				listmaisonvente.add(test);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listmaisonvente;
	}
	
	public List<Test> readbylocation() {
		List<Test> listlocation = new ArrayList<>();
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test WHERE status like 'location' ORDER  BY  created_at  DESC  LIMIT  11");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Test test = new Test();
				
				test.setId_test(rs.getInt("id_test"));
				test.setStatus(rs.getString("status"));
				test.setAdresse(rs.getString("adresse"));
				test.setPrix(rs.getDouble("prix"));
				test.setSurface(rs.getDouble("surface"));
				test.setNbrpiece(rs.getInt("nbrpiece"));
				test.setImgcouv(rs.getString("imgcouv"));
				
				listlocation.add(test);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listlocation;
	}
	public List<Test> readbyvente() {
		List<Test> listlocation = new ArrayList<>();
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test WHERE status like 'vente' ORDER  BY  created_at  DESC  LIMIT  11");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Test test = new Test();
				
				test.setId_test(rs.getInt("id_test"));
				test.setPrix(rs.getDouble("prix"));
				test.setImgcouv(rs.getString("imgcouv"));
				
				listlocation.add(test);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listlocation;
	}
	
	public Test readbyid(int id_test) {
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM test WHERE id_test=?" );
			
		req.setInt(1, id_test);
		
		ResultSet rs = req.executeQuery();
		if (rs.next()) {
			Test test = new Test();
			test.setId_test(rs.getInt("id_test"));
			test.setStatus(rs.getString("status"));
			test.setAdresse(rs.getString("adresse"));
			test.setPrix(rs.getDouble("prix"));
			test.setSurface(rs.getDouble("surface"));
			test.setNbrpiece(rs.getInt("nbrpiece"));
			test.setImgcouv(rs.getString("imgcouv"));
			
			return test;
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public boolean delete(Test object) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
}
