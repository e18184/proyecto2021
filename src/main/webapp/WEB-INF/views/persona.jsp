<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona</title>
    </head>
    <body>
        <form action="persona.htm" method="post" commandName="persona"> 
        *ci <input type="text" name="ci">
        <br>
        *Nombre <input type="text" name="nombre">
        <br>
        *Ap <input type="text" name="ap">
        <br>
        *Am <input type="text" name="am">
        <br>
        Edad <input type="text" name="edad">
        <br>
        <input type="submit" name="aceptar">
        </form>
    </body>
</html>
