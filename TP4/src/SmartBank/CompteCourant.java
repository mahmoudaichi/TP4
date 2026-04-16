package SmartBank;

public class CompteCourant extends Compte {
	
	private double decouvertAutorise;
	
	public  CompteCourant(String numero,String titulaire,double solde ,double decouvertAutorise ) {
    	super(numero,titulaire,solde);
    	this.decouvertAutorise=decouvertAutorise;
    	
		
	
	}
	@Override
	public void retirer(double montant) {
	       if (montant > 0 && montant-solde < decouvertAutorise) {
	           solde -= montant;
	          
	           
	       } else {
	    	   System.out.println("Solde depasse le decouvert autorise");
	       }
	}
	@Override
	public void afficher() {
		 super.afficher();
		 System.out.println("le decouvert est :" + decouvertAutorise );
		 	 
		 
	 }

	 
	       

}



