/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Selasa 12/03/2024
Waktu Pengerjaan : 23:00
*/

import java.util.Scanner;

public class PrintWhile1 {
   
    public static void main(String[] args) {
  
        int N;
        int i = 1;
        Scanner masukan = new Scanner(System.in);
     
        System.out.print("Nilai N >0 = ");
        N = masukan.nextInt();
        System.out.print("Print i dengan WHILE (ringkas): \n");
        while (i <= N) {
            System.out.println(i++);
        }
    }
}