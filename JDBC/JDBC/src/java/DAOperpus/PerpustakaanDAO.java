/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOperpus;


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
public class PerpustakaanDAO {
    public Perpustakaan readOne(String id_buku) {
        Perpustakaan perpustakaan = null;
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM perpustakaan WHERE id_buku = '"+id_buku+"'");
            while (rs.next()) {
                perpustakaan =new Perpustakaan();
                perpustakaan.setId_buku(rs.getString("id_buku") );
                perpustakaan.setNama_buku(rs.getString("nama_buku") );
                perpustakaan.setPengarang_buku(rs.getString("pengarang_buku"));
                perpustakaan.setPenerbit_buku(rs.getString("penerbit_buku"));
                perpustakaan.setTahun_rilis(rs.getString("tahun_rilis") );
   
            }
            rs.close();
        } catch (Exception ex) {
            System.err.println("read one error: "+ex.getMessage());
        }
        return perpustakaan;
    }
    public List<Perpustakaan> readAlltoList() {
        List<Perpustakaan> list = new ArrayList<Perpustakaan>();
        try {
            Connection conn = Koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM perpustakaan");
            while (rs.next()) {
                Perpustakaan perpustakaan = new Perpustakaan();
                perpustakaan.setId_buku(rs.getString("id_buku") );
                perpustakaan.setNama_buku(rs.getString("nama_buku") );
                perpustakaan.setPengarang_buku(rs.getString("pengarang_buku"));
                perpustakaan.setPenerbit_buku(rs.getString("penerbit_buku"));
                perpustakaan.setTahun_rilis(rs.getString("tahun_rilis") );
                list.add(perpustakaan);
            }
            rs.close();
        } catch (Exception ex) {
            list.add(new Perpustakaan("0", "0","0","0", ex.getMessage()));
            System.err.println("read all error: "+ex.getMessage());
        }
        return list;
    }
    public int insertOne(String id, String nd, String nb, String ttl, String a) {
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO perpustakaan (id_buku,nama_buku,pengarang_buku,penerbit_buku,tahun_rilis) VALUES "
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
    public int deleteOne(String id_buku) {
        try {
            Connection con = Koneksi.getConnection();
            String sql = "delete from perpustakaan where id_buku=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,id_buku);
            int i= ps.executeUpdate(); 
            ps.close();
            return i;
        } catch (SQLException ex) {
            System.err.println("delete error: "+ex.getMessage());
            return 0;
        }
    }
    public int updateOne(String id_buku, String nama_buku, String pengarang_buku, String penerbit_buku, String tahun_rilis) {
        try {
            Connection con = Koneksi.getConnection();
            String sql = "update perpustakaan set nama_buku=?, pengarang_buku=?, penerbit_buku=?, tahun_rilis=? where id_buku=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nama_buku);
            ps.setString(2,pengarang_buku);
            ps.setString(3,penerbit_buku);
            ps.setString(4,tahun_rilis);
            ps.setString(5,id_buku);
            int i= ps.executeUpdate(); 
            ps.close();
            return i;
        } catch (SQLException ex) {
            System.err.println("delete error: "+ex.getMessage());
            return 0;
        }
    }
}
