package metier.entities;

public class Produit {
	private String idProd;
	private String desiProd;
	private String prixProd;
	private String photoProd;
	private Categorie categorie;
	public String getIdProd() {
		return idProd;
	}
	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}
	public String getDesiProd() {
		return desiProd;
	}
	public void setDesiProd(String desiProd) {
		this.desiProd = desiProd;
	}
	public String getPrixProd() {
		return prixProd;
	}
	public void setPrixProd(String prixProd) {
		this.prixProd = prixProd;
	}
	public String getPhotoProd() {
		return photoProd;
	}
	public void setPhotoProd(String photoProd) {
		this.photoProd = photoProd;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Produit(String idProd, String desiProd, String prixProd, String photoProd, Categorie categorie) {
		super();
		this.idProd = idProd;
		this.desiProd = desiProd;
		this.prixProd = prixProd;
		this.photoProd = photoProd;
		this.categorie = categorie;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Produit [idProd=" + idProd + ", desiProd=" + desiProd + ", prixProd=" + prixProd + ", photoProd="
				+ photoProd + ", categorie=" + categorie + "]";
	} 

}
