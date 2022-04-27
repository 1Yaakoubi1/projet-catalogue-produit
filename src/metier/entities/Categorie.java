package metier.entities;

public class Categorie {
	private String idCat;
	private String nomCat;
	private String photoCat;
	public String getIdCat() {
		return idCat;
	}
	public void setIdCat(String idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getPhotoCat() {
		return photoCat;
	}
	public void setPhotoCat(String photoCat) {
		this.photoCat = photoCat;
	}
	public Categorie(String idCat, String nomCat, String photoCat) {
		super();
		this.idCat = idCat;
		this.nomCat = nomCat;
		this.photoCat = photoCat;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Categorie [idCat=" + idCat + ", nomCat=" + nomCat + ", photoCat=" + photoCat + "]";
	}
	

}
