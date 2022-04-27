package utilitaire;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import metier.CatalogueMetier;
import metier.entities.Categorie;
import metier.entities.Produit;

public class Test {

	public static void main(String[] args) {
		//Connection connexion=SingletonConnexion.getConnection();
		//CatalogueMetier cat = new CatalogueMetier();
		
		/* ****creation categories***
		Categorie pc =new Categorie("1","pc","c:/1.jpg");
		Categorie tablette =new Categorie("2","tablette","c:/2.jpg");
		Categorie smartphone =new Categorie("3","smartphone","c:/3.jpg");
		cat.setCategorie(pc);
		cat.addCat();
		cat.setCategorie(tablette);
		cat.addCat();
		cat.setCategorie(smartphone);
		cat.addCat();
		*/
		
		/* ***lister tous les categorie*** 
		for(Categorie elem: cat.listCat())
	       {
	       	 System.out.println (elem);
	       }
		*/
		
		/* *** consulter categorie by ID ****/
		//System.out.println (cat.ConsulterCategorie("2"));
		
		/* *** ajouter produit ***
		Produit pcHP = new Produit("5", "Oppo", "500", "c:/prod/samsung.jpg",cat.ConsulterCategorie("1"));
		cat.addProd(pcHP); */
		
		/* *** Liste *produit by Id categorie ***
		for(Produit elem: cat.listProdParCat("1"))
	       {
	       	 System.out.println (elem);
	       }
	       */
		
		//System.out.println (cat.ConsulterProduit("1"));
		/*System.out.println (cat.ConsulterProduit("2"));
		System.out.println (cat.ConsulterProduit("3"));
		System.out.println (cat.ConsulterProduit("4"));
		System.out.println (cat.ConsulterProduit("5"));
		*/
		
		/* liste produit qui contier mot clé dans designation 
		for(Produit elem: cat.listProdParDesignation("am"))
	       {
	       	 System.out.println (elem);
	       }
	       */
		/*
		Produit pcHP = new Produit("1", "hp0001", "001", "hp001.jpg",cat.ConsulterCategorie("5"));
		cat.updateProd(pcHP);
		System.out.println (cat.ConsulterProduit("1"));*/
		
		//cat.deleteProd("2");
		
	}

}
