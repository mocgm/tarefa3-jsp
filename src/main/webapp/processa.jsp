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
                response.sendRedirect("mensagem.jsp?perfil="+perfil);
            }                                    
            else response.sendRedirect("errologin.html");                        
        %>        
    </body>
</html>
