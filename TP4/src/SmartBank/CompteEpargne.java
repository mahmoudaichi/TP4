package SmartBank;

public class CompteEpargne extends Compte {
	private double tauxInteret ;
    public CompteEpargne(String numero,String titulaire,double solde ,double tauxInteret) {
    	super(numero,titulaire,solde);
    	this.tauxInteret=tauxInteret;
    	
		
	
	}
	public void calculerInteret() {
		solde += solde*tauxInteret ;
		
	}
	@Override
	public void retirer(double montant) {
		 if (montant > 0 && solde >= montant) {
	           solde -= montant;
	           System.out.println("Retrait avec succee");
	       } else {
	           System.out.println("Retrait refuse solde insuffusant");
	       }
	}


}
