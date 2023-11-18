package Tugas5;

public class dowhile3 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Ayam Bakar", "Soto Ayam", "Mie Goreng", "Nasi Uduk"};

        System.out.println("Jadwal makan:");
        int i = 0;
        do {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
            i++;
        } while (i < menu.length);
    }
}
