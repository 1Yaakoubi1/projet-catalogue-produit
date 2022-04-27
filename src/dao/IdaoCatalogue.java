package dao;

import java.util.List;

import metier.entities.Categorie;
import metier.entities.Produit;

public interface IdaoCatalogue {
	
	//Ajouter une nouvelle catégorie
	public void addCat(Categorie c);
	//Ajouter un nouveau produit
	public void addProd(Produit p);
	
	//Consulter toutes les catégories
	public List<Categorie> listCat();
	//Consulter les produits d’une catégorie
	public List<Produit> listProdParCat(String idCat);
	//Consulter une catégorie
	public Categorie ConsulterCategorie(String idCat);
	//Consulter un produit
	public Produit ConsulterProduit(String idProd);
	//Consulter les produits dont la désignation contient un mot clé
	public List<Produit> listProdParDesignation(String Desig);
	
	//Mettre à jour un produit
	public void updateProd(Produit prod);
	
	//Supprimer un produit
	public void deleteProd(String idProd);
	

}
