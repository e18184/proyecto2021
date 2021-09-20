<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/menu.css" type="text/css" />
        
        <title>Pagina Principal e18184</title>
    </head>
     <script>
    function myFunc() {
        window.open("${pageContext.request.contextPath}/uanadir.htm", 'principal');
   }
    </script>
    <body>
        <br>
        
        <c:forEach  var="misp" items="${mismenus}"  varStatus="status" >
             <li><a href="#"><c:out value="${misp.getNombre()}"></c:out></a>
                 <ul>
                 <c:forEach  var="dato2" items="${misp.getORM_Idpro()}"  varStatus="status2" >
                        
                     <li><a href="${dato2.getEnlace()}" target="bottom" ><c:out value="${dato2.getNombre()}"></c:out></a></li>
                     </c:forEach>
                
                </ul> 
               
                 
             
             </li>
         </c:forEach>
