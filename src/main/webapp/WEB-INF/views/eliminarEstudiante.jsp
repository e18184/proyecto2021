<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Estudiante</title>
    </head>
    <body>
        <h1>Esta seguro de eliminar al estudiante</h1>
        <form:form action="eliminarEstudiante" method="post" commandName="estudiante">
            
            ${rude}
                ${nombre}
                <br>
                
            ${ap}
            <br>
            ${am}
            <br>
            <form:button>Enviar</form:button> <a href="listaEstudiantes.htm"> Cancelar </a>
        </form:form>
    </body>
</html>
