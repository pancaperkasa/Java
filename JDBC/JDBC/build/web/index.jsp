<%@page import="DAOmhs.Mahasiswa"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="DAOmhs.Mahasiswa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  style="background-color: #F5B7B1 ">
        <h1 style="text-align: center">Data Mahasiswa</h1>
        <%
            try {
                DAOmhs.MahasiswaDAO dao = new DAOmhs.MahasiswaDAO();
                List<Mahasiswa> list =  dao.readAlltoList();
                out.print("<form action='form_mahasiswa.jsp' method='post'>"
                        + "<input type='hidden' name='action' value='insert'/>"
                        + "<input type='submit' value='Tambah Data'/></form>");
                        
                   out.print("<form action='lihatdata_buku.jsp' method='post'>"
                        + "<input type='hidden' name='action' value=''/>"
                        + "<input type='submit' value='Data Buku'/></form>");
                        
                        
              
                out.print("<table border=10px>");
                out.print("<tr><td width=100px><strong>ID</strong>");
                out.print("</td><td width=200px><strong>Nama Depan</strong>");
                out.print("</td><td width=300px><strong>Nama Belakang</strong>");
                out.print("</td><td width=300px><strong>TTL</strong>");
                out.print("</td><td width=300px><strong>Alamat</strong>");
                out.print("</td><td width=300px><strong>Olah Data</strong>");
                out.print("</td></tr>");
                for (Mahasiswa u : list) {
                    String id = u.getId_mhs();
                    String nd = u.getNama_depan();
                    String nb = u.getNama_belakang();
                    String ttl = u.getTtl_mhs();
                    String a = u.getAlamat_mhs();
                    
                    out.print("<tr><td>");
                    out.print(id);
                    out.print("</td><td>");
                    out.print(nd);
                    out.print("</td><td>");
                    out.print(nb);
                    out.print("</td><td>");
                    out.print(ttl);
                    out.print("</td><td>");
                    out.print(a);
                    out.print("</td><td nowrap>");
                    out.print("<form action='form_mahasiswa.jsp' method='post'>"
                            + "<input type='hidden' name='action' value='edit'/>"
                            + "<input type='hidden' name='id_mhs' value='"+id+"'/>"
                            + "<input type='submit' value='Ubah'/></form>");
                    out.print("<form action='MahasiswaService' method='post'>"
                            + "<input type='hidden' name='id_mhs' value='"+id+"'/>"
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
