package SoloLearn.Control;
import java.util.Scanner;
public class Tip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double tip = bill*0.15;//15% of the bill
        System.out.println(tip);

    }
}
