package belajarlah;
import java.util.Scanner;
public class Ratarata {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a :");
        int a = sc.nextInt();
        System.out.println("input b :");
        int b = sc.nextInt();
        System.out.println("input C :");
        int c = sc.nextInt();

        int x = a+b+c;
        System.out.println("Rata-rata :" + x/3);


    }
}
