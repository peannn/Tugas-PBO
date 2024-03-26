/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Selasa 12/03/2024
Waktu Pengerjaan : 23:00
*/

import java.util.Scanner;

public class PrintXRepeat {
 
    public static void main(String[] args) {
  
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
        x = masukan.nextInt(); 
        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { 
            Sum = 0;
            do {
                Sum = Sum + x; 
                System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
                x = masukan.nextInt(); 
            } while (x != 999);
            System.out.println("Hasil penjumlahan = " + Sum);

        }
    }
}