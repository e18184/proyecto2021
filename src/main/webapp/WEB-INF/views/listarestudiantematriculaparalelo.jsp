<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Pantalla Principal Matricular un estudiante a un Paralelo</title>
    </head>
    <body>        <h1>Pantalla Principal Matricular un estudiante a un Paralelo.</h1>
        <p><a href="index.htm"> Principal </a></p>
        <table border="2">
            <thead>
                <tr>
                    <th>ci</th>
                    <th>nombre</th>
                    <th>ap</th>
                    <th>am</th>
                    <th>correo</th>
                    <th>telefono</th>
                    <th> Matricular </th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach  items="${datos}" var="dato">
                    <tr>
                        <td> <c:out value="${dato.ci}"/></td>
                        <td> <c:out value="${dato.nombre}"/></td>
                        <td> <c:out value="${dato.ap}"/></td>
                        <td> <c:out value="${dato.am}"/></td>
                        <td> <c:out value="${dato.correo}"/></td>
                        <td> <c:out value="${dato.telefono}"/></td>
                        <td> <a href="adicionarestudiantematriculaparalelo.htm?ci=${dato.ci}"> Matricular </a> </td>
                       

                       
                    </c:forEach>
                    
            </tbody>
            
        </table>
        
    </body>
</html>
