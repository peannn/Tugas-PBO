/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Sabtu/25 Mei 2024
Waktu Pengerjaan : 18:00
*/

package id.bio.dao;

import id.bio.model.Mahasiswa;
import java.util.List;
public interface MahasiswaDAO {
    public boolean insert (Mahasiswa m);
    public boolean update (Mahasiswa m);
    public boolean delete (Mahasiswa m);
    public List<Mahasiswa> getAllMahasiswa();
    public Mahasiswa getByID (String nim);
    public List<Mahasiswa> getByName (String name);
}
