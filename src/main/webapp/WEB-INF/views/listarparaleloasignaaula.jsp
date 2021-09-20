<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Pantalla Principal Matricular un estudiante a un Paralelo</title>
    </head>
    <body>
        <h1>Pantalla Principal Matricular un estudiante a un Paralelo</h1>
        <p><a href="index.htm"> Principal </a></p>
        <table border="2">
            <thead>
                <tr>
                    <th>idparalelo</th>
                    <th>nombreparalelo</th>
                    <th>nombredelcurso</th>
                    
                    <!--<th>usuario</th>
                    <th>contrasena</th>
                    <th>suspendido</th>
                    <th>direccion</th>
                    <th>imagen</th>-->
                    <th> Asignar </th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach  items="${datos}" var="dato">
                    <tr>
                        <td> <c:out value="${dato.idparalelo}"/></td>
                        
                        <td> <c:out value="${dato.nombre}"/></td>
                        <td> <c:out value="${dato.getCursos().getNombre()}"/></td>
                        
                        <td> <a href="adicionarestudiantematriculaparalelo.htm?ci=${dato.idparalelo}"> Asignar </a> </td>
                       

                       
                    </c:forEach>
                    
            </tbody>
            
        </table>
        
    </body>
</html>