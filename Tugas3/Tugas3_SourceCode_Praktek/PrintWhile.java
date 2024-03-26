/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Selasa 12/03/2024
Waktu Pengerjaan : 23:00
*/

import java.util.Scanner;


public class PrintWhile {

    public static void main(String[] args) {

        int N;
        int i;
        Scanner masukan = new Scanner(System.in);
    
        System.out.print("Nilai N >0 = ");
         N = masukan.nextInt();
        i = 1; 
        System.out.print("Print i dengan WHILE: \n");
        while (i <= N)
        {
            System.out.println(i);
            i++;
        }; 
    }
}