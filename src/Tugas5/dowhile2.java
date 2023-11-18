package Tugas5;

public class dowhile2 {
    public static void main(String[] args) {
        String[] jadwal = {"Subuh", "Dzuhur", "Ashar", "Maghrib", "Isya"};
        int i = 0;

        System.out.println("Jadwal Sholat:");
        do {
            System.out.println((i + 1) + ". " + jadwal[i]);
            i++;
        } while (i < jadwal.length);
    }
}
