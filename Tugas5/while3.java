package Tugas5;

public class while3 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Ayam Bakar", "Soto Ayam", "Mie Goreng", "Nasi Uduk"};

        System.out.println("Jadwal makan:");
        int i = 0;
        while (i < menu.length) {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
            i++;
        }
    }
}
