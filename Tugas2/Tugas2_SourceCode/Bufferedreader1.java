/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufrr = new BufferedReader(new InputStreamReader(System.in));
        // Input
        System.out.println("===========================================");
        System.out.println("Silahkan isi data mahasiswa dibawah ini !!!");
        System.out.println("===========================================");
        System.out.print("Nim      : ");
        String nim = bufrr.readLine();
        System.out.print("Nama     : ");
        String nama = bufrr.readLine();
        System.out.print("Jurusan  : ");
        String jurusan = bufrr.readLine();
        System.out.print("Fakultas : ");
        String fakultas = bufrr.readLine();

        // Output
        System.out.println("================================");
        System.out.println("Data mahasiswa yang dimasukkan: ");
        System.out.println("================================");
        System.out.println("Nim      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Fakultas : " + fakultas);
        
        bufrr.close();
    }
}