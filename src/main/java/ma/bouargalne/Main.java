package ma.bouargalne;


public class Main {
    public static void main(String[] args) {
        // Création d'un compte bancaire
        Account account = new Account();

        // Dépôts et retraits
        account.desposit(1000);
        account.withdraw(500);
        account.desposit(200);

        // Impression du relevé
        account.printStatement();
    }
}
