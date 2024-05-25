/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Sabtu/25 Mei 2024
Waktu Pengerjaan : 18:00
*/

package id.bio.database;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private static Connection connection = null;
    public static Connection getConnection() throws Exception{
        if(connection == null){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbakademik","root","123");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    return connection;
}
    public static boolean isConnect(){
        try{
            if(getConnection() == null){
                return false;
            }
        }catch(Exception e){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        return true;
    }
}
