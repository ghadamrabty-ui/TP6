package TP6;

public class periodiques extends documents{
	    private String fp;

	    public periodiques(String titre, int id,int nb_page, String fp ){
	    	
	        super(titre,id,nb_page);
	        this.fp=fp;
	    }

	    
	    public void edition() {
	        super.edition();
	        System.out.println("Fréquence de publication :"+fp);
	    }

	    public String getFrequencePublication() {
	        return fp;
	    }

	   


}
