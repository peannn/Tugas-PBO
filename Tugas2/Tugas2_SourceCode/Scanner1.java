/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
*/
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.println("===========================================");
        System.out.println("Silahkan isi data mahasiswa dibawah ini !!!");
        System.out.println("===========================================");
        System.out.print("Nim      : ");
        String nim = scanner.nextLine();
        System.out.print("Nama     : ");
        String nama = scanner.nextLine();
        System.out.print("Jurusan  : ");
        String jurusan = scanner.nextLine();
        System.out.print("Fakultas : ");
        String fakultas = scanner.nextLine();

        //Output
        System.out.println("================================");
        System.out.println("Data mahasiswa yang dimasukkan: ");
        System.out.println("================================");
        System.out.println("Nim      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Fakultas : " + fakultas);
        
        scanner.close();
    }
}