<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del Estudiante</h1>
        
        <a href="index.htm"> MENU PRINCIPAL </a>
        <p><a href="insertarEstudiante.htm"> Insertar Estudiante </a></p>
        <table border="2">
            <thead>
                <tr>
                    <th>ci</th>
                    <th>rude</th>
                    <th>nombre</th>
                    <th>ap</th>
                    <th>am</th>
                    <th>correo</th>
                    <th>telefono</th>
                    <th>direccion</th>
                    <th>imagen</th>
                    <th>suspendido</th>
                    <th> BM </th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach  items="${datos}" var="dato">
                    <tr>
                        <td> <c:out value="${dato.ci}"/></td>
                        <td> <c:out value="${dato.rude}"/></td>
                        <td> <c:out value="${dato.nombre}"/></td>
                        <td> <c:out value="${dato.ap}"/></td>
                        <td> <c:out value="${dato.am}"/></td>
                        <td> <c:out value="${dato.correo}"/></td>
                        <td> <c:out value="${dato.telefono}"/></td>
                        <td> <c:out value="${dato.direccion}"/></td>
                        <td> <c:out value="${dato.imagen}"/></td>
                        <td> <c:out value="${dato.estado}"/></td>
                        <td> <a href="<c:url value="modificarEstudiante.htm?ci=${dato.ci}"/>"> M </a> &NegativeMediumSpace;&NegativeMediumSpace; 
                                <a href="<c:url value="eliminarEstudiante.htm?ci=${dato.ci}"/>"> E </a> 
                        </td>
                    </c:forEach>
                    
            </tbody>
            
        </table>
        
    </body>
</html>