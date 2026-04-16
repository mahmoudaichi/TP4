package SmartBank;

public class TesteBanque {
    public static void main(String[] args) {

        Compte[] comptes = new Compte[4];

        comptes[0] = new CompteCourant("01", "Mahmoud", 1000, 500);
        comptes[1] = new CompteEpargne("02", "Mehdi", 2000, 0.05);
        comptes[2] = new ComptePremium("03", "Rkia", 3000, 1000);
        comptes[3] = new CompteCourant("04", "Lina", 1500, 300);
        

        for (Compte c : comptes) {
            c.deposer(100);
            c.retirer(200);
            c.afficher();
            System.out.println("------");
        }
        
        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
        Compte c = new CompteEpargne("01", "Yassine", 1000, 0.05);
        CompteCourant cc = (CompteCourant) c;
        
       
}
    
}