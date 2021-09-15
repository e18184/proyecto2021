<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <!-- modificado 6-1-2020 -->
        <form:form action="usuario.jsp" method="post" modelAttribute="V_usuariorol">
           
            <label>*Usuario</label>
            <form:input path="login" value="${login}"/>
            <form:errors path="login" cssClass="error"  />
            <br>
            <label>*Contrasena</label><form:input path="password" value="${password}"/>
            <form:errors path="password" cssClass="error" />
            <br>
            
            <form:button>Enviar</form:button>     
        </form:form>
    </body>
</html>
