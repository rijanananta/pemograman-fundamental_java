package PF5desember;

public class Hewan {
    //variabel
    int umur;
    Hewan(int umur){
        this.umur = umur;

    }
    int getUmur(){
        return umur;
    }
    void lari(){
        System.out.println("Lari Dengan Kencang");
    }
    void jalan(){
        System.out.println("Jalan Dengan Pelan");
    }
}
