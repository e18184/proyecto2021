<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/menu.css" type="text/css" />
        <title>Pagina Principal</title>
    </head>
    <body>

<nav id="menu">
    <ul>
        <br>
        
        <c:forEach  var="dato" items="${proceso}"  varStatus="status" >
            
             <li><a href="#"><c:out value="${dato}"></c:out></a>
                <ul>
                     <c:forEach  var="dato2" items="${proceso}}"  varStatus="status2" >
                   
                         <li><a href="#" ><c:out value="${dato2.getNombre()}"></c:out></a>
                            
                        </li>
                         
                     </c:forEach>
                </ul> 
                 
             
             </li>
         </c:forEach>
        
            
    </ul>            
</nav>
        
    </body>
</html>