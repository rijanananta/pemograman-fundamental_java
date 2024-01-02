package belajarlah;

import java.util.Scanner;

public class Profit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" input M 1 ");
        int M1 = sc.nextInt();
        System.out.println(" input M 2");
        int M2 = sc.nextInt();
        System.out.println( "input K ");
        int K = sc.nextInt();

        int Profit = M1 + M2 * K ;
        System.out.println("PROFIT: " + Profit);


    }
}
