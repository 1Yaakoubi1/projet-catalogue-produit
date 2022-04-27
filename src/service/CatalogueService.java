package service;
import metier.entities.Categorie;
import metier.entities.Produit;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sun.jersey.spi.resource.Singleton;
import com.sun.org.glassfish.gmbal.ParameterNames;

import metier.CatalogueMetier;
import metier.IcatalogueMetier;

@Singleton
@Path("/catalogue")
@Produces("application/json")
@Consumes("application/json")
public class CatalogueService implements IcatalogueMetier {
	private CatalogueMetier cat = new CatalogueMetier();
@POST
@Path("/categories")
	@Override
	public void addCat(Categorie c) {
		// TODO Auto-generated method stub
		cat.addCat(c);
		
	}
@POST
@Path("/produits")
	@Override
	public void addProd(Produit p) {
		// TODO Auto-generated method stub
		cat.addProd(p);
		
	}
@GET
@Path("/categories")
	@Override
	public List<Categorie> listCat() {
		// TODO Auto-generated method stub
		return cat.listCat();
	}
@GET
@Path("/produitsParCats/{idCat}")
	@Override
	public List<Produit> listProdParCat(@PathParam (value = "idCat" ) String idCat) {
		// TODO Auto-generated method stub
		return cat.listProdParCat(idCat);
	}
@GET
@Path("/categories/{idCat}")
	@Override
	public Categorie ConsulterCategorie(@PathParam (value = "idCat" ) String idCat) {
		// TODO Auto-generated method stub
		return cat.ConsulterCategorie(idCat);
	}
@GET
@Path("/produits/{idProd}")
	@Override
	public Produit ConsulterProduit(@PathParam (value = "idProd" )String idProd) {
		// TODO Auto-generated method stub
		return cat.ConsulterProduit(idProd);
	}
@GET
@Path("/prodParDesignations/{Desig}")
	@Override
	public List<Produit> listProdParDesignation(@PathParam (value = "Desig" )String Desig) {
		// TODO Auto-generated method stub
		return cat.listProdParDesignation(Desig);
	}
@PUT
@Path("/produits")
	@Override
	public void updateProd(Produit prod) {
		// TODO Auto-generated method stub
		cat.updateProd(prod);
	}
@DELETE
@Path("/produits")
	@Override
	public void deleteProd(String idProd) {
		// TODO Auto-generated method stub
		cat.deleteProd(idProd);
	}
	

	

}
