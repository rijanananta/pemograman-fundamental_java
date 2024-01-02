package belajarlah;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double luas ,phi=3.14;
        System.out.println("Masukan jarijari :");
        int jarijari = sc.nextInt();

        luas = 2 * phi * jarijari;
        System.out.println( "Luas Lingkaran Adalah : "+luas);
    }
}
