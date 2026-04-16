package SmartBank;

public class ComptePremium extends Compte {
	
	private double plafondRetrait ;
	public ComptePremium(String numero,String titulaire,double solde ,double plafondRetrait) {
		super(numero,titulaire,solde);
		this.plafondRetrait=plafondRetrait;
	}
	@Override
	public void retirer(double montant) {
		if (montant <  plafondRetrait) {
			 solde -= montant;
			 System.out.println("retrait avec succee");
	          
			
		}else {
			 System.out.println("retrait impossible , depasse le plafond");
			
		}
		
		
	}
	
	

}
