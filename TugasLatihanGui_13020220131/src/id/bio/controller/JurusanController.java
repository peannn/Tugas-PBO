/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Sabtu/25 Mei 2024
Waktu Pengerjaan : 18:00
*/

package id.bio.controller;


import id.bio.dao.*;
import id.bio.model.Jurusan;
import java.util.List;
import java.util.Observable;
public class JurusanController extends Observable {
    private JurusanDAO dao = new JurusanDAOImpl();
    private CrudState crud;
    public List<Jurusan> getAllData(){
        return dao.getAllJurusan();
    }
    public void manipulate(Jurusan j, CrudState c){
        boolean result = false;
        switch(c){
            case INSERT:
                result = dao.insert(j);
                break;
            case UPDATE:
                result = dao.update(j);
                break;
            case DELETE:
                result = dao.delete(j);
                break;
        }
        setChanged();
        if(result){
            notifyObservers(j);
        }else{
            notifyObservers();
        }
    }
    public CrudState getCrudState(){
        return crud;
    }
}
