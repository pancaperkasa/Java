/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOmhs;


/**
 *
 * @author rizky
 */
public class Mahasiswa {
    private String id_mhs ;
    private String nama_depan ;
    private String nama_belakang ;
    private String ttl_mhs ;
    private String alamat_mhs ;

    public Mahasiswa() {
    }

    public Mahasiswa(String id_mhs, String nama_depan, String nama_belakang, String ttl_mhs, String alamat_mhs) {
        this.id_mhs = id_mhs;
        this.nama_depan = nama_depan;
        this.nama_belakang = nama_belakang;
        this.ttl_mhs = ttl_mhs;
        this.alamat_mhs = alamat_mhs;
    }

    public String getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(String id_mhs) {
        this.id_mhs = id_mhs;
    }

    public String getNama_depan() {
        return nama_depan;
    }

    public void setNama_depan(String nama_depan) {
        this.nama_depan = nama_depan;
    }

    public String getNama_belakang() {
        return nama_belakang;
    }

    public void setNama_belakang(String nama_belakang) {
        this.nama_belakang = nama_belakang;
    }

    public String getTtl_mhs() {
        return ttl_mhs;
    }

    public void setTtl_mhs(String ttl_mhs) {
        this.ttl_mhs = ttl_mhs;
    }

    public String getAlamat_mhs() {
        return alamat_mhs;
    }

    public void setAlamat_mhs(String alamat_mhs) {
        this.alamat_mhs = alamat_mhs;
    }
    
    
    
}
 