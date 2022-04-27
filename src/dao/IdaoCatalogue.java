package dao;

import java.util.List;

import metier.entities.Categorie;
import metier.entities.Produit;

public interface IdaoCatalogue {
	
	//Ajouter une nouvelle cat�gorie
	public void addCat(Categorie c);
	//Ajouter un nouveau produit
	public void addProd(Produit p);
	
	//Consulter toutes les cat�gories
	public List<Categorie> listCat();
	//Consulter les produits d�une cat�gorie
	public List<Produit> listProdParCat(String idCat);
	//Consulter une cat�gorie
	public Categorie ConsulterCategorie(String idCat);
	//Consulter un produit
	public Produit ConsulterProduit(String idProd);
	//Consulter les produits dont la d�signation contient un mot cl�
	public List<Produit> listProdParDesignation(String Desig);
	
	//Mettre � jour un produit
	public void updateProd(Produit prod);
	
	//Supprimer un produit
	public void deleteProd(String idProd);
	

}
