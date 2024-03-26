/*
Nama             : Nur Ikhwan Alfiansyah
Nim              : 13020220131
Kelas            : A4 -TI
Modul            : Modul 4, No 2.
Waktu Pengerjaan : 26/03/2024, 14:00 WITA
*/
import java.util.*;

class Orang {
    public String nama;

    public Orang() {
        this.nama = "Nur Ikhwan Alfiansyah";
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Orang.");
    }
}

class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "1302002131"; //stambuk anda
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Mahasiswa.");
    }
}

public class Utamaa {
    public static void main(String[] args) {
        // Memanggil method info() dari kelas Orang
        Orang.info();
        
        // Memanggil method info() dari kelas Mahasiswa
        Mahasiswa.info();
    }
}
