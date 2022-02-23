package Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MahasiswaService extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id_mhs");
        String nd = request.getParameter("nama_depan");
        String nb = request.getParameter("nama_belakang");
        String ttl = request.getParameter("ttl_mhs");
        String a = request.getParameter("alamat_mhs");
        
        
        String resp="";
        if (request.getParameter("action").equals("insert")){
            int r = new DAOmhs.MahasiswaDAO().insertOne(id, nd, nb, ttl, a);
            resp=(r>0)?"Berhasil Tambah Data":"Gagal Tambah Data";
        }
        else if (request.getParameter("action").equals("update")){
            int r = new DAOmhs.MahasiswaDAO().updateOne(id, nd, nb, ttl, a);
            resp=(r>0)?"Berhasil Ubah Data":"Gagal Ubah Data";
        }
        else if (request.getParameter("action").equals("delete")){
            int r = new DAOmhs.MahasiswaDAO().deleteOne(id);
            resp=(r>0)?"Berhasil Hapus Data":"Gagal Hapus Data";
        }        
        response.sendRedirect("index.jsp?res="+resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}