package Tugas4;
import java.util.Scanner;
public class konversi1IF {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input huruf : ");
        String nilaiHuruf = input.nextLine();

        double nilaiIndex;

        if (nilaiHuruf.equals("A")) {
            nilaiIndex = 4.0;
        } else if (nilaiHuruf.equals("B")) {
            nilaiIndex = 3.0;
        } else if (nilaiHuruf.equals("C")) {
            nilaiIndex = 2.0;
        } else if (nilaiHuruf.equals("D")) {
            nilaiIndex = 1.0;
        } else if (nilaiHuruf.equals("E")) {
            nilaiIndex = 0;
        } else {
            System.out.println("Nilai huruf tidak valid.");
            return;
        }

        System.out.println("Nilai indeks : "  + nilaiIndex);
    }
}

