<%-- 
    Document   : processa
    Created on : Oct 15, 2014, 1:24:31 AM
    Author     : Gionatta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processa login</title>
    </head>
    <body>
        <% 
            String perfil = request.getParameter("perfil");
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            if (login.equals(senha)) 
            {
                response.sendRedirect("http://localhost:8084/servlet-simples-2/mensagem.jsp?perfil="+perfil);
            }
            else response.sendRedirect("http://localhost:8084/servlet-simples-2/errologin.html");                        
        %>        
    </body>
</html>
