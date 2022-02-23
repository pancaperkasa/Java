/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOperpus;

/**
 *
 * @author rizky
 */
public class Perpustakaan {
    private String id_buku ;
    private String nama_buku ;
    private String pengarang_buku ;
    private String penerbit_buku ;
    private String tahun_rilis ;

    public Perpustakaan() {
    }

    public Perpustakaan(String id_buku, String nama_buku, String pengarang_buku, String penerbit_buku, String tahun_rilis) {
        this.id_buku = id_buku;
        this.nama_buku = nama_buku;
        this.pengarang_buku = pengarang_buku;
        this.penerbit_buku = penerbit_buku;
        this.tahun_rilis = tahun_rilis;
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getNama_buku() {
        return nama_buku;
    }

    public void setNama_buku(String nama_buku) {
        this.nama_buku = nama_buku;
    }

    public String getPengarang_buku() {
        return pengarang_buku;
    }

    public void setPengarang_buku(String pengarang_buku) {
        this.pengarang_buku = pengarang_buku;
    }

    public String getPenerbit_buku() {
        return penerbit_buku;
    }

    public void setPenerbit_buku(String penerbit_buku) {
        this.penerbit_buku = penerbit_buku;
    }

    public String getTahun_rilis() {
        return tahun_rilis;
    }

    public void setTahun_rilis(String tahun_rilis) {
        this.tahun_rilis = tahun_rilis;
    }
    
    
    
}
