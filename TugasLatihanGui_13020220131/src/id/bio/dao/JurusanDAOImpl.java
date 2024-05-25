/*
NIM              : 13020220131
Nama             : Nur Ikhwan Alfiansyah
Hari/Tanggal     : Sabtu/25 Mei 2024
Waktu Pengerjaan : 18:00
*/

package id.bio.dao;

import id.bio.database.Database;
import id.bio.model.Jurusan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JurusanDAOImpl implements JurusanDAO {
    @Override
    public boolean insert(Jurusan j) {
        String sql = "INSERT INTO jurusan (id, nama) VALUES (?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, j.getId());
            statement.setString(2, j.getNama());
            int row = statement.executeUpdate();
            return row > 0;
        } catch (SQLException ex) {
            Logger.getLogger(JurusanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Jurusan j) {
        String sql = "UPDATE jurusan SET nama=? WHERE id=?";
        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, j.getNama());
            statement.setString(2, j.getId());
            int row = statement.executeUpdate();
            return row > 0;
        } catch (SQLException ex) {
            Logger.getLogger(JurusanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Jurusan j) {
        String sql = "DELETE FROM jurusan WHERE id=?";
        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, j.getId());
            int row = statement.executeUpdate();
            return row > 0;
        } catch (SQLException ex) {
            Logger.getLogger(JurusanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Jurusan> getAllJurusan() {
        List<Jurusan> categories = new ArrayList<>();
        String sql = "SELECT * FROM jurusan";
        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                Jurusan c = new Jurusan(rs.getString("id"), rs.getString("nama"));
                categories.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JurusanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

    @Override
    public Jurusan getByID(String id) {
        String sql = "SELECT * FROM jurusan WHERE id=?";
        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return new Jurusan(rs.getString("id"), rs.getString("nama"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JurusanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Jurusan> getByName(String name) {
        String sql = "SELECT * FROM jurusan WHERE nama LIKE ?";
        List<Jurusan> categories = new ArrayList<>();
        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, "%" + name + "%");
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Jurusan c = new Jurusan(rs.getString("id"), rs.getString("nama"));
                    categories.add(c);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JurusanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
}
