<%@page import="DAOperpus.Perpustakaan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #AED6F1  ">
        <h1>Olah Data</h1>
        <% Perpustakaan u = null;
            if (request.getParameter("action").toString().equalsIgnoreCase("edit")) {
            String id_buku = request.getParameter("id_buku");
            u = new DAOperpus.PerpustakaanDAO().readOne(id_buku);        
        %>
            <form method="post" action="PerpustakaanService">
            <input type="hidden" name="action" value="update"/><br/>
        <% } else if (request.getParameter("action").toString().equalsIgnoreCase("insert")) { %>
            <form method="post" action="PerpustakaanService">
            <input type="hidden" name="action" value="insert"/><br/>
        <% } %>
        <%
            if (u==null) 
                out.write("ID : <input name='id_buku' type='text'/><br/>");
            else {
                out.write("ID : "+ u.getId_buku()+ "<br/>");
                out.write("<input name='id_buku' type='hidden' value='"+u.getId_buku()+"'/>");
            }
        %>
            Nama Buku : <input type="text" name="nama_buku" <% if (u!=null) out.write("value='"+u.getNama_buku()+"'"); %>/><br/>
            Pengarang Buku : <input type="text" name="pengarang_buku" <% if (u!=null) out.write("value='"+u.getPengarang_buku()+"'"); %>/><br/>
            Penerbit Buku : <input type="text" name="penerbit_buku" <% if (u!=null) out.write("value='"+u.getPenerbit_buku()+"'"); %>><br/>
            Tahun Rilis : <input type="text" name="tahun_rilis" <% if (u!=null) out.write("value='"+u.getTahun_rilis()+"'"); %>><br/>
            <input type="submit" value="Simpan"/>
        </form>
    </body>
</html>