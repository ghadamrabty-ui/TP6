package TP6;

public class testBibliothéque {
	

	    public static void main(String[] args) {

	    	bibliothéque b = new bibliothéque(20);

	        documents d1 = new documents("Java", 5, 100);
	        articles a1 = new articles("Informatique", 1, 20, "fati");
	        livres l1 = new livres("VIE", 2, 200, "ghada", "mrabty");
	        periodiques p1 = new periodiques("eco", 4, 50, "Mensuel");

	        b.ajout_doc(d1);
	        b.ajout_doc(a1);
	        b.ajout_doc(l1);
	        b.ajout_doc(p1);

	        System.out.println("Inventaire de la bibliotheque ");
	        b.Inventaire_doc();

	        System.out.println("Nombre de documents : " + b.getnb_doc());

	        System.out.println(" Liste des livres ");
	        b.liste_livre().Inventaire_doc();

	        System.out.println(" Liste des articles");
	        b.liste_article().Inventaire_doc();

	        System.out.println("Documents simples");
	        b.liste_docsimples().Inventaire_doc();

	        System.out.println("Liste des periodiques");
	        b.liste_periodiques().Inventaire_doc();

	        System.out.println("Apres suppression");
	        b.Supprim_doc(2);
	        b.Inventaire_doc();
	    }

	}
