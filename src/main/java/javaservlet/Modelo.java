/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Universidade Tecnológica Federal do Paraná
 * IF6AE Desenvolvimento de Aplicaçoões Web
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
@WebServlet(name = "Modelo", urlPatterns = {"/modelo", "/xyz"})
public class Modelo extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" "
                    + "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
            
            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
            out.println("<head>");
            out.println("<title>Login</title>");   
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='processa' method='post'>");
            out.println("Login: <input type=\"text\" name=\"login\"/><br/>");
            out.println("Senha: <input type=\"password\" name=\"senha\"/><br/>");
            out.println("Perfil: <select name = \"perfil\">");
            out.println("<option value=\"1\">Cliente</option>");
            out.println("<option value=\"2\">Gerente</option>");
            out.println("<option value=\"3\">Administrator</option>");
            out.println("</select>");
            out.println("<input type=\"submit\" value=\"Enviar\"/>");
            out.println("</form>");
            
            /*String nome = request.getParameter("nome");
            String codigo = request.getParameter("codigo");
            if  (request.getMethod().equalsIgnoreCase("post")) {
                if (nome == null || nome.trim().isEmpty()) {
                    out.println("<h2 style='color: red'>Informe o nome!</h2>");
                } else if (codigo == null || codigo.trim().isEmpty()) {
                    //out.println("<h2>Olá, " + nome + "</h2>");
                    out.println("<h2 style='color: red'>Informe o codigo!</h2>");
                }
                else {
                    out.println("<h2>O user " + nome + " tem código " + codigo + "</h2>");
                }
            }*/
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);        
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Modelo de servlet";
    }// </editor-fold>
}
