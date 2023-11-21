package PF21;
public class Account {
    String name;
    String addres;
    double balance;

    public void display() {
        System.out.println(name) ;
        System.out.println("(");
        System.out.println(addres);
        System.out.println(") has $");
        System.out.println(balance);
    }
    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}
