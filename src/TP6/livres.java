package TP6;

public class livres extends articles {
	    private String editeur;

	    public livres(String titre, int id,
	                 int nb_page, String auteur, String editeur) {
	        super(titre, id, nb_page, auteur);
	        this.editeur = editeur;
	    }

	    public void edition() {
	        super.edition();
	        System.out.println("Éditeur : " + editeur);
	    }

	    public String getEditeur() {
	        return editeur;
	    }

	  
	}


