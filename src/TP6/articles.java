package TP6;

	public class articles extends documents {
	    private String auteur;

	    public articles(String titre, int id,
	    		int nb_page, String auteur) {
	    	super(titre,id,nb_page);
	    	this.auteur = auteur;
	    }

	   
	    public void edition() {
	        super.edition();
	        System.out.println("Auteur : " + auteur);
	    }

	    public String getauteur() {
	        return auteur;
	    }

	}


