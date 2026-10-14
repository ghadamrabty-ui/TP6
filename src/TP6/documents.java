package TP6;

public class documents {
	String titre;
	int id;
	int nb_page;
	
	public documents (String titre, int id , int nb_page) {
		this.titre=titre;
		this.id=id;
		this.nb_page=nb_page;
		
	}
	public void edition() {
		System.out.println("le titre de document"+titre+"le identification"+id+"le nombre de page"+nb_page);	
		
	}
	public String gettitre() {
		return titre;
	}
	public int getid() {
		return id;
	}
	public int getnb_page() {
		return nb_page;
}
	
	
	
	
	
	
}