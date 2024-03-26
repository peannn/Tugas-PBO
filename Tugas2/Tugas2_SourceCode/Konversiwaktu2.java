/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
*/
import java.util.Scanner;

public class Konversiwaktu2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total detik : ");
        int totalDetik = scanner.nextInt();

        // Hitung jam, menit, dan detik
        int detik = totalDetik % 60;
        int menit = (totalDetik / 60) % 60;
        int jam = (totalDetik / 3600) % 24;

        // Format output
        String waktuFormat = String.format("%02d:%02d:%02d", jam, menit, detik);

        // Cetak hasil
        System.out.println("Tampil Waktu         : " + waktuFormat);

        scanner.close();
    }
}