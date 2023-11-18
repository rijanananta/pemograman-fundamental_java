package Tugas5;

public class forloop2 {
    public static void main(String[] args) {
        String[] jadwal = {"Subuh", "Dzuhur", "Ashar", "Maghrib", "Isya"};

        System.out.println("Jadwal Sholat:");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Sholat"+(i + 1) + ". " + jadwal[i]);
        }
    }
}
