package belajarlah;

import java.util.Scanner;

public class NilaiIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input angka :");
        int angka = sc.nextInt();

        double index = 0.0;
        String huruf = "";

        if (angka >= 0 && angka <= 100 ) {
            if (angka >= 100) {
                index = 4.0;
                huruf = "A";
            } else if (angka >= 90) {
                index = 3.0;
                huruf = "B";
            } else if (angka >= 80) {
                index = 2.0;
                huruf = "C";
            } else if (angka >= 70) {
                index = 1.0;
                huruf = "D";
            }

            System.out.println("Nilai Huruf :" + huruf );
            System.out.println("Nilai Index : "+ index );
        } else  {
            System.out.println("Nilai  Yang di Masukan Tidak Valid");


        }

    }
}
