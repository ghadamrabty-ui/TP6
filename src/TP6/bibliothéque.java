package TP6;

public class bibliothéque {

    private documents[] Listdoc;
    private int nb_doc;
    private int cap;

    public bibliothéque(int cap) {
        this.cap = cap;
        Listdoc = new documents[cap];
        nb_doc = 0;
    }

    public int getCap() {
        return cap;
    }

    public int getnb_doc() {
        return nb_doc;
    }

    public void ajout_doc(documents d) {

        if (nb_doc < cap) {

            int i = nb_doc - 1;
            
            
            Listdoc[i + 1] = d;
            nb_doc++;

        } else {
            System.out.println("Bibliotheque pleine !");
        }
    }

    public void Supprim_doc(int num) {

        int i = 0;

        if (i < nb_doc) {

            for (int j = i; j < nb_doc - 1; j++) {
                Listdoc[j] = Listdoc[j + 1];
            }

            nb_doc--;
            System.out.println("Document supprime.");

        } else {
            System.out.println("Document introuvable.");
        }
    }

    public void Inventaire_doc() {

        for (int i = 0; i < nb_doc; i++) {
            Listdoc[i].edition();
        }
    }

    public bibliothéque liste_livre() {

    	bibliothéque b = new bibliothéque(cap);

        for (int i = 0; i < nb_doc; i++) {
            if (Listdoc[i] instanceof livres) {
                b.ajout_doc(Listdoc[i]);
            }
        }

        return b;
    }

    public bibliothéque liste_article() {

    	bibliothéque b = new bibliothéque(cap);

        for (int i = 0; i < nb_doc; i++) {
            if (Listdoc[i] instanceof articles &&
                !(Listdoc[i] instanceof livres)) {
                b.ajout_doc(Listdoc[i]);
            }
        }

        return b;
    }
    public bibliothéque liste_docsimples() {
    	
    	bibliothéque b = new bibliothéque(cap);
    	for (int i = 0; i < nb_doc; i++) {
            if (Listdoc[i].getClass()==documents.class){
                b.ajout_doc(Listdoc[i]);
            }}
            return b;
        }
            
     public bibliothéque liste_periodiques() {
    	 	bibliothéque b = new bibliothéque(cap);
        	for (int i = 0; i < nb_doc; i++) {
                if (Listdoc[i].getClass()==periodiques.class){
                    b.ajout_doc(Listdoc[i]);
                }
     }
            return b;



    	
    	
    	
    	}}

