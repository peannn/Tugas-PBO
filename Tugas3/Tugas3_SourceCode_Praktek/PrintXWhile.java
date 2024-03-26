/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Selasa 12/03/2024
Waktu Pengerjaan : 23:00
*/

import java.util.Scanner;

public class PrintXWhile {
   
    public static void main(String[] args) {
   
 
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        Sum = 0;
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();
        while (x != 999) {
            Sum = Sum + x; 
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();
        }
        System.out.println("Hasil penjumlahan = " + Sum);
    }
}