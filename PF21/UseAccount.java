package PF21;
public class UseAccount {
    public static void main(String args[] ){
        Account myAccount;
        Account yourAccount;

        myAccount  = new Account();
        yourAccount = new Account();

        myAccount.name = "Rijan";
        myAccount.addres = "BuluCina";
        myAccount.balance = 24.02;

        yourAccount.name = "Adjie";
         yourAccount.addres = "AirHitam";
        yourAccount.balance = 55.63;

        myAccount.display();

       System.out.print(" plus $");
        System.out.print(myAccount.getInterest(5.00));
       System.out.println(" interest ");
        yourAccount.display();

        double yourInterestRate = 7.00;
       System. out.print(" plus $");
        double yourInterestAmount =
                yourAccount.getInterest(yourInterestRate);
       System. out.print(yourInterestAmount);
       System . out.println(" interest ");

    }
}
