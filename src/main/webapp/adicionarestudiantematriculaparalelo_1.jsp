<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
       
        <form:form method="post"  action="adicionarestudiantematriculaparalelo.jsp" comandName="matricula">
            <p>
            <form:label path="estudianteId">Ci del Estudiante</form:label>
            <input type="text" name="estudianteId" value="<c:out value="${matricula.getEstudiante().getCi()}"></c:out>" readonly="TRUE">
            <c:out value="${matricula.getEstudiante().getNombre()} "/> <c:out value="${matricula.getEstudiante().getAp()} "/> <c:out value="${matricula.getEstudiante().getAm()} "/>
            </p>
            <p>
           
            <hr>
            <form:button>Enviar</form:button> <a href="listarmatriculaParaleloEstudiantes.htm"> Cancelar </a>
            
        </form:form>
        
    </body>
</html>
