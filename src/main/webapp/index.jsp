<html xmlns="http://www.w3.org/1999/xhtml">
   <head>
      <title>Login</title>
   </head>
   <body>
      <form method="post" action="processa.jsp">
         Login: <input type="text" name="login"/><br/>
         Senha: <input type="password" name="senha"/><br/>
         Perfil: <select name="perfil">
                     <option value="1">Cliente</option>
                     <option value="2">Gerente</option>
                     <option value="3">Administrador</option>
                 <select>
         <input type="submit" value="Enviar"/>
      </form>
   </body>
</html>