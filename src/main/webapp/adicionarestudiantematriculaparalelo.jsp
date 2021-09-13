<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Adicionar Estudiante 2</title>
    </head>
    <body>
        <h1>Datos del Estudiante</h1>
        
        <form:form method="post" action="adicionarestudiantematriculaparalelo.htm"  commandName="matricula">
             <p>
                 
                <form:label path="estudianteId">Ci del Estudiante</form:label>
                <input type="text" name="estudianteId" value="<c:out value="${matricula.getEstudiante().getCi()}"></c:out>" readonly="TRUE">  
                <c:out value="${matricula.getEstudiante().getNombre()} "/> <c:out value="${matricula.getEstudiante().getAp()} "/> <c:out value="${matricula.getEstudiante().getAm()} "/>
                
            
                 
                
            </p>
            <p>
                
                
               <form:label path="paraleloId">Paralelo a Matricular</form:label>
                <form:select path="paraleloId">
                    <option value="0">Seleccione...</option>
                  <c:forEach items="${paraleloId}" var="paraleloId">
                   <option value="${paraleloId.key}" ${paraleloId.key ==  matricula.getParalelo().getIdparalelo() ? 'selected="selected"' : ''}>${paraleloId.value}</option>
                  </c:forEach>
               </form:select>
                
            </p>
            <p>
                <form:label path="fecha">Fecha Matriculacion</form:label>
                <form:input path="fecha" />
            </p>
            
          
          
            <hr>
            <form:button>Enviar</form:button> <a href="listarestudiantematriculaparalelo.htm"> Cancelar </a>
        </form:form>
        
    </body>
</html>