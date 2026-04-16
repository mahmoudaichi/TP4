package SmartBank;

public class Compte {
	protected String numero ;
	protected String titulaire ;
	protected double solde ; 
	
	public Compte(String numero,String titulaire ,double solde) {
		
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = solde;
	}
	
	public String getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

   public double getsolde() {
	   return solde;
   }
   
   public void setTitulaire(String titulaire) {
	   this.titulaire = titulaire;
   }
   
   public void setsolde(double solde) {
	   this.solde = solde;
   }
   
   public void deposer(double montant) {
       if (montant > 0) {
           solde += montant;
           System.out.println(" le depot a ete effectuer avec succee");
       }
       else {
    	   System.out.println("Montant de depot invalide");
       }
   }
   
   public void retirer(double montant) {
       if (montant > 0 && solde >= montant) {
           solde -= montant;
           System.out.println("Retrait avec succee");
       } else {
           System.out.println("Retrait refuse");
       }
   }
   
   public void afficher() {
       System.out.println("Numéro : " + numero +
                          ", Titulaire : " + titulaire +
                          ", Solde : " + solde);
   }


}
