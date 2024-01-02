package belajarlah;

import java.util.Scanner;

public class Deret {
        public static void main(String args[]){

            Scanner input = new Scanner(System.in);

            System.out.println("Program Java Membuat Deret Angka");
            System.out.println("================================");
            System.out.println();

            int jumlah_deret,i;

            System.out.println("Jumlah deret yang diinginkan:");
            jumlah_deret = input.nextInt();
            System.out.println();

            for (i=1;i<=jumlah_deret;i++){
            System.out.println(i*i + " ");
            }
            System.out.println();
        }
    }
