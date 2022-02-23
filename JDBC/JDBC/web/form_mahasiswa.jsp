<%@page import="DAOmhs.Mahasiswa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #F9E79F">
        <h1>Olah Data</h1>
        <% Mahasiswa u = null;
            if (request.getParameter("action").toString().equalsIgnoreCase("edit")) {
            String id_mhs = request.getParameter("id_mhs");
            u = new DAOmhs.MahasiswaDAO().readOne(id_mhs);        
        %>
            <form method="post" action="MahasiswaService">
            <input type="hidden" name="action" value="update"/><br/>
        <% } else if (request.getParameter("action").toString().equalsIgnoreCase("insert")) { %>
            <form method="post" action="MahasiswaService">
            <input type="hidden" name="action" value="insert"/><br/>
        <% } %>
        <%
            if (u==null) 
                out.write("ID : <input name='id_mhs' type='text'/><br/>");
            else {
                out.write("ID : "+ u.getId_mhs()+ "<br/>");
                out.write("<input name='id_mhs' type='hidden' value='"+u.getId_mhs()+"'/>");
            }
        %>
            Nama Depan : <input type="text" name="nama_depan" <% if (u!=null) out.write("value='"+u.getNama_depan()+"'"); %>/><br/>
            Nama Belakang : <input type="text" name="nama_belakang" <% if (u!=null) out.write("value='"+u.getNama_belakang()+"'"); %>/><br/>
            TTL : <input type="text" name="ttl_mhs" <% if (u!=null) out.write("value='"+u.getTtl_mhs()+"'"); %>><br/>
            Alamat : <input type="text" name="alamat_mhs" <% if (u!=null) out.write("value='"+u.getAlamat_mhs()+"'"); %>><br/>
            <input type="submit" value="Simpan"/>
        </form>
    </body>
</html>