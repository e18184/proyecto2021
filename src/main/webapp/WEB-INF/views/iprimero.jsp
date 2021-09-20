<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>><font size="40">Primero</font></h1>
         <table border="2">
            <thead>
                <tr>
                    <th>nombre</th>
                    <th>apellido1</th>
                    <th>apellido2</th>
                    <th>sexo</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach  items="${listado}" var="m">
                    <tr>
                        <td> <c:out value="${m.nombre}"/></td>
                        <td> <c:out value="${m.apellido1}"/></td>
                        <td> <c:out value="${m.apellido2}"/></td>
                        <td> <c:out value="${m.sexo}"/></td>
                        esto es una prueba 2
                    </tr> 
                </c:forEach>
                    
            </tbody>
            
        </table>

    </body>
</html>
