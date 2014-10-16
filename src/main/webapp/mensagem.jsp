<%-- 
    Document   : mensagem
    Created on : Oct 15, 2014, 8:49:54 PM
    Author     : Gionatta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso</title>
    </head>
    <body>
        <%
            String perfil = request.getParameter("perfil");
            Date data = new Date();
        %>
        <%= perfil %>, login bem sucedido, requisição submetida às <%= data %>
    </body>
</html>
