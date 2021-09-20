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
        
        <form:form method="post" action="modificarEstudiante.htm"  commandName="estudiante">
            
            <p>
                <form:label path="ci">ci</form:label>
                <form:input path="ci" />
            </p>
            
            <p>
                <form:label path="rude">Rude</form:label>
                <form:input path="rude" />
            </p>
            
            <p>
                <form:label path="nombre">Nombre</form:label>
                <form:input path="nombre" />
            </p>
            
            <p>
                <form:label path="ap">Apellido Paterno</form:label>
                <form:input path="ap" />
            </p>
            
            <p>
                <form:label path="am">Apellido Materno</form:label>
                <form:input path="am" />
            </p>
            
            <p>
                <form:label path="correo">Correo</form:label>
                <form:input path="correo" />
            </p>
            
            <p>
                <form:label path="telefono">Telefono</form:label>
                <form:input path="telefono" />
            </p>
            
            <p>
                <form:label path="usuario">Usuario</form:label>
                <form:input path="usuario" />
            </p>
            
            <p>
                <form:label path="contrasena">Contraseña</form:label>
                <form:password path="contrasena" />
            </p>
            
            <p>
             <form:label path="estado">Suspendido</form:label> 
              <form:select path="estado"> 
                    <form:option value="0">Seleccione.....</form:option>
                    <form:options items="${estado}" />
                </form:select>
            </p>
            <p>
                <form:label path="direccion">Direccion</form:label>
                <form:input path="direccion" />
            </p>
            
            <p>
                <form:label path="imagen">Imagen</form:label>
                <form:input path="imagen" />
            </p>
          
            <hr>
            <form:button>Enviar</form:button> <a href="listaEstudiantes.htm"> Cancelar </a>
        </form:form>
        
    </body>
</html>