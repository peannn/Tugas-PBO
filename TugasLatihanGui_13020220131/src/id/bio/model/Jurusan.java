/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Sabtu/25 Mei 2024
Waktu Pengerjaan : 18:00
*/

package id.bio.model;

public class Jurusan {
    private String id;
    private String nama;
    public Jurusan(String id) {
        this.id = id;
        this.nama = nama;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString(){
        return "Jurusan{" + "id=" + id + ", nama=" + nama + '}' ;
    }
}
