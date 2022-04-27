package metier;


import java.util.ArrayList;
import java.util.List;

import dao.IdaoCatalogue;
import dao.ImpdaoCatalogue;
import metier.entities.Categorie;
import metier.entities.Produit;

public class CatalogueMetier implements IcatalogueMetier  {
	private Categorie categorie;
	private Produit produit;
	private List<Categorie> lstCategorie = new ArrayList<Categorie>();
	private List<Produit> lstProduit = new ArrayList<Produit>();
	IdaoCatalogue serviceCatlogue = new ImpdaoCatalogue();
	//***********************************
	public Categorie getCategorie() {
		return categorie;
	}

	public Produit getProduit() {
		return produit;
	}
	
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	//***********************************	

	@Override
	public void addCat(Categorie c) {
		// TODO Auto-generated method stub
		serviceCatlogue.addCat(c);
	}

	@Override
	public void addProd(Produit p) {
		// TODO Auto-generated method stub
		serviceCatlogue.addProd(p);;
	}

	@Override
	public List<Categorie> listCat() {
		// TODO Auto-generated method stub
		lstCategorie = serviceCatlogue.listCat();
		return lstCategorie;
	}

	@Override
	public List<Produit> listProdParCat(String idCat) {
		// TODO Auto-generated method stub
		lstProduit = serviceCatlogue.listProdParCat(idCat);
		return lstProduit;
	}

	@Override
	public Categorie ConsulterCategorie(String idCat) {
		// TODO Auto-generated method stub
		
		return serviceCatlogue.ConsulterCategorie(idCat) ;
	}

	@Override
	public Produit ConsulterProduit(String idProd) {
		// TODO Auto-generated method stub
		return serviceCatlogue.ConsulterProduit(idProd);
	}

	@Override
	public List<Produit> listProdParDesignation(String Desig) {
		// TODO Auto-generated method stub
		return serviceCatlogue.listProdParDesignation(Desig) ;
	}

	@Override
	public void updateProd(Produit prod) {
		// TODO Auto-generated method stub
		serviceCatlogue.updateProd(prod);
	}

	@Override
	public void deleteProd(String idProd) {
		// TODO Auto-generated method stub
		serviceCatlogue.deleteProd(idProd);
	}

}
