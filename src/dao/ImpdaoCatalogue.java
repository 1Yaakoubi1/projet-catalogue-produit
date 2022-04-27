package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import metier.entities.Categorie;
import metier.entities.Produit;
import utilitaire.SingletonConnexion;

public class ImpdaoCatalogue implements IdaoCatalogue {
private Connection connexion = SingletonConnexion.getConnection();

	@Override
	public void addCat(Categorie c) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = connexion.prepareStatement("insert into categorie (identifiant, nom, photo)values(?,?,?)");
			ps.setString(1, c.getIdCat());
			ps.setString(2, c.getNomCat());
			ps.setString(3, c.getPhotoCat());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e1) {
			e1.printStackTrace();
			System.out.println("erreure ajout de Categorie");
		}
		
	}

	@Override
	public void addProd(Produit p) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = connexion.prepareStatement("insert into produit (identifiant, désignation, prix,photo, categorie_id )values(?,?,?,?,?)");
			ps.setString(1, p.getIdProd());
			ps.setString(2, p.getDesiProd());
			ps.setString(3, p.getPrixProd());
			ps.setString(4, p.getPhotoProd());
			ps.setString(5, p.getCategorie().getIdCat());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e1) {
			e1.printStackTrace();
			System.out.println("erreure ajout de Produit");
		}
		
	}

	@Override
	public List<Categorie> listCat() {
		// TODO Auto-generated method stub
		List<Categorie> lstCategorie = new ArrayList<Categorie>();
		try {
			PreparedStatement ps=connexion.prepareStatement("select * from categorie");
		       ResultSet rs=ps.executeQuery();
		       while(rs.next()) {
		    	   Categorie cat = new Categorie();
		    	   cat.setIdCat(rs.getString(1));
		    	   cat.setNomCat(rs.getString(2));
		    	   cat.setPhotoCat(rs.getString(3));
		    	   lstCategorie.add(cat);
		       }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lstCategorie;
	}

	@Override
	public List<Produit> listProdParCat(String idCat) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		List<Produit> lstProduit = new ArrayList<Produit>();
		try {
			ps=connexion.prepareStatement("select * from produit where categorie_id = ?");
			ps.setString(1, idCat);
		       ResultSet rs=ps.executeQuery();
		       while(rs.next()) {
		    	   Produit prod = new Produit();
		    	   prod.setIdProd(rs.getString(1));
		    	   prod.setDesiProd(rs.getString(2));
		    	   prod.setPrixProd(rs.getString(3));
		    	   prod.setPhotoProd(rs.getString(4));
		    	   prod.setCategorie(ConsulterCategorie(rs.getString(5)));
		    	   lstProduit.add(prod);
		       }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lstProduit;
	}

	@Override
	public Categorie ConsulterCategorie(String idCat) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		Categorie cat = new Categorie();
		try {
			ps = connexion.prepareStatement("select * from categorie where identifiant=?");
			ps.setString(1, idCat);
			ResultSet rs=ps.executeQuery();
		       while(rs.next()) {
		    	   cat.setIdCat(rs.getString(1));
		    	   cat.setNomCat(rs.getString(2));
		    	   cat.setPhotoCat(rs.getString(3));
		       }
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return cat;
	}

	@Override
	public Produit ConsulterProduit(String idProd) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		Produit prod = new Produit();
		try {
			ps = connexion.prepareStatement("select * from produit where identifiant=?");
			ps.setString(1, idProd);
			ResultSet rs=ps.executeQuery();
		       while(rs.next()) {
		    	   prod.setIdProd(rs.getString(1));
		    	   prod.setDesiProd(rs.getString(2));
		    	   prod.setPrixProd(rs.getString(3));
		    	   prod.setPhotoProd(rs.getString(4));
		    	   prod.setCategorie(ConsulterCategorie(rs.getString(5)));
		       }
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return prod;
	}

	@Override
	public List<Produit> listProdParDesignation(String Desig) {
		PreparedStatement ps;
		
		List<Produit> lstProduit = new ArrayList<Produit>();
		try {
			ps=connexion.prepareStatement("select * from produit where désignation like '%"+Desig+"%' ");
			//ps.setString(1, Desig);
		       ResultSet rs=ps.executeQuery();
		       while(rs.next()) {
		    	   Produit prod = new Produit();
		    	   prod.setIdProd(rs.getString(1));
		    	   prod.setDesiProd(rs.getString(2));
		    	   prod.setPrixProd(rs.getString(3));
		    	   prod.setPhotoProd(rs.getString(4));
		    	   prod.setCategorie(ConsulterCategorie(rs.getString(5)));
		    	   lstProduit.add(prod);
		       }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lstProduit;
	}

	@Override
	public void updateProd(Produit prod) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps= connexion.prepareStatement("UPDATE produit SET désignation=?, prix=?, photo=?, categorie_id=? WHERE identifiant=?");
		
			//ps.setString(1, prod.getIdProd());
			ps.setString(1, prod.getDesiProd());
			ps.setString(2, prod.getPrixProd());
			ps.setString(3, prod.getPhotoProd());
			ps.setString(4, prod.getCategorie().getIdCat());
			ps.setString(5, prod.getIdProd());
			ps.executeUpdate();
			ps.close();
			} catch (SQLException e1) {
			//e1.printStackTrace();
				System.out.println("Update Erreur ");
			}
		
	}

	@Override
	public void deleteProd(String idProd) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps= connexion.prepareStatement("DELETE from produit where identifiant=?");
			ps.setString(1, idProd);
			ps.executeUpdate();
			ps.close();
			System.out.println("Produit Supprimer ");
		}catch (SQLException e1) {
			//e1.printStackTrace();
			System.out.println("delete Erreur ");
		}
			
	}

}
