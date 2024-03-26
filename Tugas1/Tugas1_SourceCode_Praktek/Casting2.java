/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Sabtu 25/02/2024
Waktu Pengerjaan : 14:00
*/
public class Casting2 {
    public static void main(String[] args) {
        int a=8,b=9;
        float d=2.f,e=3.2f;
        char g='5';
        double k=3.14;
        String n="67",m="45", l="100";
        
        a = Integer.parseInt(n); 
        k = Double.parseDouble(m); 
        d = Float.parseFloat(l); 
        System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);
        
        n = String.valueOf(b); 
        m = String.valueOf(g); 
        l = String.valueOf(e); 
        
        System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);
        k = Double.valueOf(a).intValue();

        double c = Integer.valueOf(b).doubleValue();
        System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);
    }
}