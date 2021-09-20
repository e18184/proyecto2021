<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar un estudiante</title>
    </head>
    <body>
        <h1>Insertar un estudiante</h1>
    <form:form action="insertarEstudiante.htm" method="post" commandName="datos">
            
            <form:label path="rude">Rude</form:label>
            <form:input path="rude" />
            <br>
             <form:label path="ci"> *Ci </form:label>
             <form:input path="ci" />
            <br>
             <form:label path="nombre"> *Nombre </form:label>
             <form:input path="nombre" />
            <br>
            <form:label path="ap"> *Apellido Paterno </form:label>
             <form:input path="ap" />
            <br>
            <form:label path="am"> *Apellido Materno </form:label>
             <form:input path="am" />
            <br>
            <form:label path="correo"> *Correo </form:label>
             <form:input path="correo" />
            <br>
            <form:label path="telefono"> *Telefono </form:label>
             <form:input path="telefono" />
            <br>
            <form:label path="usuario"> *Usuario </form:label>
            <form:password path="usuario" />
            <br>
            <form:label path="contrasena"> *Contrasena </form:label>
             <form:password path="contrasena" />
             <br>
              <form:label path="estado">Estado</form:label> 
                <form:select path="estado"> 
                    <form:option value="false">Seleccione.....</form:option>
                    <form:options items="${estado}" />
                </form:select>
            <br>
         <form:button >Aceptar</form:button> <a href="listaEstudiantes.htm"> Cancelar </a>   
    </form:form>
    </body>
</html>
