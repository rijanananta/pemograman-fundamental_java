package PF5desember;

public class Kelinci {
    public static void main(String[]args ){
        Hewan kelinci = new Hewan(10);
        kelinci.jalan();
        kelinci.lari();

        System.out.println("Umur Kelinci Adalah "+kelinci.getUmur()+ " Tahun");
    }
}
