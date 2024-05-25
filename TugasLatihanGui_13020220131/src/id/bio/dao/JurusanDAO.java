/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Sabtu/25 Mei 2024
Waktu Pengerjaan : 18:00
*/

package id.bio.dao;

import id.bio.model. Jurusan; 
import java.util.List;

public interface JurusanDAO {
    public boolean insert (Jurusan j);
    public boolean update (Jurusan j);
    public boolean delete (Jurusan j);
    public List<Jurusan> getAllJurusan ();
    public Jurusan getByID (String id);
    public List<Jurusan> getByName (String name);
}
