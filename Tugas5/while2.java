package Tugas5;

public class while2 {
    public static void main(String[] args) {
        String[] jadwal = {"Subuh", "Dzuhur", "Ashar", "Maghrib", "Isya"};
        int i = 0;

        System.out.println("Jadwal Sholat:");
        while (i < jadwal.length) {
            System.out.println((i + 1) + ". " + jadwal[i]);
            i++;
        }
    }
}
