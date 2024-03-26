/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Selasa 12/03/2024
Waktu Pengerjaan : 23:00
*/

import java.util.Scanner;

public class PriFor {
   
    public static void main(String[] args) {
     
        int i, N;
        Scanner masukan = new Scanner(System.in);
     
        System.out.print("Baca N, print 1 s/d N ");
        System.out.print("N = ");
        N = masukan.nextInt();
        for (i = 1; i <= N; i++) {
            System.out.println(i);
        }
        ;
        System.out.println("Akhir program \n");
    }
}