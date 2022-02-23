/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOmhs;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizky
 */
public class MahasiswaDAO {
    public Mahasiswa readOne(String id_mhs) {
        Mahasiswa mahasiswa = null;
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa WHERE id_mhs = '"+id_mhs+"'");
            while (rs.next()) {
                mahasiswa=new Mahasiswa();
                mahasiswa.setId_mhs(rs.getString("id_mhs") );
                mahasiswa.setNama_depan(rs.getString("nama_depan") );
                mahasiswa.setNama_belakang(rs.getString("nama_belakang"));
                mahasiswa.setTtl_mhs(rs.getString("ttl_mhs"));
                mahasiswa.setAlamat_mhs(rs.getString("alamat_mhs") );
   
            }
            rs.close();
        } catch (Exception ex) {
            System.err.println("read one error: "+ex.getMessage());
        }
        return mahasiswa;
    }
    public List<Mahasiswa> readAlltoList() {
        List<Mahasiswa> list = new ArrayList<Mahasiswa>();
        try {
            Connection conn = Koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa");
            while (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setId_mhs(rs.getString("id_mhs") );
                mahasiswa.setNama_depan(rs.getString("nama_depan") );
                mahasiswa.setNama_belakang(rs.getString("nama_belakang"));
                mahasiswa.setTtl_mhs(rs.getString("ttl_mhs"));
                mahasiswa.setAlamat_mhs(rs.getString("alamat_mhs") );
                list.add(mahasiswa);
            }
            rs.close();
        } catch (Exception ex) {
            list.add(new Mahasiswa("0", "0","0","0", ex.getMessage()));
            System.err.println("read all error: "+ex.getMessage());
        }
        return list;
    }
    public int insertOne(String id, String nd, String nb, String ttl, String a) {
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO mahasiswa (id_mhs,nama_depan,nama_belakang,ttl_mhs,alamat_mhs) VALUES "
                    + "("
                    + "'" + id + "','"
                    + nd + "','"
                    + nb + "','"
                    + ttl + "','"
                    + a + "')";
            int i = st.executeUpdate(sql);
            st.close();
            return i;
        } catch (SQLException ex) {
            System.err.println("insert error: "+ex.getMessage());
            return 0;
        }
    }
    public int deleteOne(String id_mhs) {
        try {
            Connection con = Koneksi.getConnection();
            String sql = "delete from mahasiswa where id_mhs=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,id_mhs);
            int i= ps.executeUpdate(); 
            ps.close();
            return i;
        } catch (SQLException ex) {
            System.err.println("delete error: "+ex.getMessage());
            return 0;
        }
    }
    public int updateOne(String id_mhs, String nama_depan, String nama_belakang, String ttl_mhs, String alamat_mhs) {
        try {
            Connection con = Koneksi.getConnection();
            String sql = "update mahasiswa set nama_depan=?, nama_belakang=?, ttl_mhs=?, alamat_mhs=? where id_mhs=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nama_depan);
            ps.setString(2,nama_belakang);
            ps.setString(3,ttl_mhs);
            ps.setString(4,alamat_mhs);
            ps.setString(5,id_mhs);
            int i= ps.executeUpdate(); 
            ps.close();
            return i;
        } catch (SQLException ex) {
            System.err.println("delete error: "+ex.getMessage());
            return 0;
        }
    }
}
