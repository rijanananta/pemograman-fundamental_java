package SoloLearn.Methods;
import java.util.Scanner;
public class Suhu {
    static double fahr(double celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
}
