<%@page import="DAOperpus.Perpustakaan"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="DAOperpus.Perpustakaan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #ABEBC6 ">
        <h1 style="text-align: center">Data Buku</h1>
        <%
            try {
                DAOperpus.PerpustakaanDAO dao = new DAOperpus.PerpustakaanDAO();
                List<Perpustakaan> list =  dao.readAlltoList();
                out.print("<form action='form_buku.jsp' method='post'>"
                        + "<input type='hidden' name='action' value='insert'/>"
                        + "<input type='submit' value='Tambah Data'/></form>");
                        out.print("<form action='index.jsp' method='post'>"
                        + "<input type='hidden' name='action' value=''/>"
                        + "<input type='submit' value='Data Mahasiswa'/></form>"); 
                        
                out.print("<table border=10px>");
                out.print("<tr><td width=100px><strong>ID Buku</strong>");
                out.print("</td><td width=200px><strong>Nama Buku</strong>");
                out.print("</td><td width=300px><strong>Pengarang Buku</strong>");
                out.print("</td><td width=300px><strong>Penerbit Buku</strong>");
                out.print("</td><td width=300px><strong>Tahun Rilis</strong>");
                out.print("</td><td width=300px><strong>Olah Data</strong>");
                out.print("</td></tr>");
                for (Perpustakaan u : list) {
                    String id_buku = u.getId_buku();
                    String nama_buku = u.getNama_buku();
                    String pengarang_buku = u.getPengarang_buku();
                    String penerbit_buku = u.getPenerbit_buku();
                    String tahun_rilis = u.getTahun_rilis();
                    
                    out.print("<tr><td>");
                    out.print(id_buku);
                    out.print("</td><td>");
                    out.print(nama_buku);
                    out.print("</td><td>");
                    out.print(pengarang_buku);
                    out.print("</td><td>");
                    out.print(penerbit_buku);
                    out.print("</td><td>");
                    out.print(tahun_rilis);
                    out.print("</td><td nowrap>");
                    out.print("<form action='form_buku.jsp' method='post'>"
                            + "<input type='hidden' name='action' value='edit'/>"
                            + "<input type='hidden' name='id_buku' value='"+id_buku+"'/>"
                            + "<input type='submit' value='Ubah'/></form>");
                    out.print("<form action='PerpustakaanService' method='post'>"
                            + "<input type='hidden' name='id_buku' value='"+id_buku+"'/>"
                            + "<input type='hidden' name='action' value='delete'/>"
                            + "<input type='submit' value='Hapus'/></form>");
                    out.print("</td></tr>");
                }
                out.print("</table>");
            } catch (Exception e){
                e.printStackTrace(new java.io.PrintWriter(out));
            } 
        %>
    </body>
</html>
