package Beljar12;

import java.util.Date;

public class Biodata {
   protected String Nama;
   protected Date TanggalLahir;
   protected String Alamat;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
      this. Nama = nama;
    }

    public Date getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.TanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
       this.Alamat = alamat;
    }
}