package servicios;

import DAO.ClickDAO;
import POJO.Click;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistraClick", urlPatterns = {"/RegistraClick"})
public class RegistraClick extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        int id = Integer.parseInt( request.getParameter("id") );
        ClickDAO insertarClick = new ClickDAO();
        
        System.out.println("El ID: "+id);
        insertarClick.saveaClick(-1, id);
    }
}
