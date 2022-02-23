package Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PerpustakaanService extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id_buku");
        String nd = request.getParameter("nama_buku");
        String nb = request.getParameter("pengarang_buku");
        String ttl = request.getParameter("penerbit_buku");
        String a = request.getParameter("tahun_rilis");
        
        
        String resp="";
        if (request.getParameter("action").equals("insert")){
            int r = new DAOperpus.PerpustakaanDAO().insertOne(id, nd, nb, ttl, a);
            resp=(r>0)?"Berhasil Tambah Data":"Gagal Tambah Data";
        }
        else if (request.getParameter("action").equals("update")){
            int r = new DAOperpus.PerpustakaanDAO().updateOne(id, nd, nb, ttl, a);
            resp=(r>0)?"Berhasil Ubah Data":"Gagal Ubah Data";
        }
        else if (request.getParameter("action").equals("delete")){
            int r = new DAOperpus.PerpustakaanDAO().deleteOne(id);
            resp=(r>0)?"Berhasil Hapus Data":"Gagal Hapus Data";
        }        
        response.sendRedirect("lihatdata_buku.jsp?res="+resp);
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