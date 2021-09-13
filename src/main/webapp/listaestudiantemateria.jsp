<%-- 
    Document   : listaestudiantemateria
    Created on : Sep 9, 2019, 11:48:42 AM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Lista Estudiante Materia</h1>
        ${visualizar.getCedula()}
        &nbsp;${visualizar.getNombre()}
        &nbsp;${visualizar.getApellido1()}
        &nbsp;${visualizar.getApellido2()}
         &nbsp;${visualizar.getDocentes().getIdusu()}
    </body>
</html>
