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
        <form:form action="persona2.htm" method="post" modelAttribute="persona">
           
            <label>*ci</label><form:input path="ci" value="${ci}"/>
            
            <br>
            <label>*nombre</label><form:input path="nombre" value="${nombre}"/>
            <form:errors path="nombre" />
            <br>
            <label>*ap</label><form:input path="ap" value="${ap}"/>
            <br>
            <label>*am</label><form:input path="am" value="${am}"/>
            <br>
            <label>*edad</label><form:input path="edad" value="${edad}"/>
            <form:errors path="edad" />
            <br>
            <label>*Correo</label><form:input path="correo" value="${correo}"/>
            <form:errors path="correo" />
            <form:button>Enviar</form:button>     
        </form:form>
    </body>
</html>
