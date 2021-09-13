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
        <form:form action="estudiante.htm" method="post" modelAttribute="estudiante">
            <label>*nombres</label><form:input path="nombre" value="${nombre}"/>
            &nbsp;&nbsp;&nbsp;
            <label>*apellidos</label><form:input path="apellidos" value="${apellidos}"/>
            &nbsp;&nbsp;&nbsp;
            <label>*email</label><form:input path="email" value="${email}"/>
            <br>
            <label>*controsena</label><form:input path="contrasena" value="${contrasena}"/>
            <br>
            <table>
                <tr> 
                    <td>Sexo <form:radiobutton path="sexo" value="H"/>*Hombre <br>  &nbsp;&nbsp;&nbsp;
                        <form:radiobutton path="sexo" value="M"/> *Mujer  
                    </td>
                    <td>
                        Nivel de Estudios <br>
                        <form:radiobutton path="nivel" value="c"/>Certificado Escolar <br>
                        <form:radiobutton path="nivel" value="g"/>Graduado en SCO <br>
                        <form:radiobutton path="nivel" value="b"/>Bachiller Formacion Personal <br>
                        <form:radiobutton path="nivel" value="d"/>Diplomado <br>
                        <form:radiobutton path="nivel" value="p"/>Licenciado o Doctorado <br>
                    </td>
                    <td>
                        Interesado en los siguientes temas: <br>
                        <form:checkbox path="tema" value="musica"/> Musica
                        <br>
                          <form:checkbox path="tema" value="desportes"/> Deportes
                          <br>
                          <form:checkbox path="tema" value="cine"/> Cine
                          <br>
                          <form:checkbox path="tema" value="libros"/> Libros 
                          <br>
                          <form:checkbox path="tema" value="ciencia"/> Ciencia
                        
                    </td>
                </tr>
            </table>
            * Dia de la Semana 
            <form:select path="diasemana">
                <form:option value="0">dia de la semana....</form:option>
                <form:options items="${diasemana}" />
            </form:select>
                <br>
             *Su opinion 
             <form:textarea path="opinion" rows="5" cols="30"/>
  
            
            <form:button>Enviar</form:button>     
        </form:form>
    </body>
</html>
