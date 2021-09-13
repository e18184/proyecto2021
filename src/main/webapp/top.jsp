<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="css/footer.css">
        
        <title></title>
    </head>
    <script>
    function submitFORM(path, params, method) {
    method = method || 'POST'; 

    var form = document.createElement('form');
    form.setAttribute('method', method);
    form.setAttribute('action', path);
    form.setAttribute('target', 'principal');

    //Move the submit function to another variable
    //so that it doesn't get overwritten.
    form._submit_function_ = form.submit;

    for(var key in params) {
        if(params.hasOwnProperty(key)) {
            var hiddenField = document.createElement('input');
            hiddenField.setAttribute('type', 'hidden');
            hiddenField.setAttribute('name', key);
            hiddenField.setAttribute('value', params[key]);

            form.appendChild(hiddenField);
         }
    }
    document.body.appendChild(form);
    form._submit_function_();
    }    
    function myFunc() {
        var selectBox = document.getElementById("idusu");
        var selectedValue = selectBox.options[selectBox.selectedIndex].value;
        submitFORM("${pageContext.request.contextPath}/principal_2.htm",{'idusu':selectedValue},'POST');
        //document.getElementById("fmiusuario").action="${pageContext.request.contextPath}/top.htm"
        //.getElementById("fmiusuario").method = "post";
        
        //alert(selectedValue);
        //document.getElementById("fmiusuario").submit();
   }
    </script>
    <body>
        <footer id="footer">  
        <div id="content-footer"
        <table><tr>
                
                <td> sfds</td> 
                <td>${fmiusuario.getNombre()}&nbsp;${fmiusuario.getApellido1()}&nbsp;${fmiusuario.getApellido2()}</td> 
                <td> 
            
            <form:form method="POST" id="fmiusuario"  name="fmiusuario" commandName="fmiusuario" >
                <form:select id="idusu" path="idusu"  onchange="myFunc()"> 
                     <c:forEach  var="dato2" items="${misusuarios}" >
                         <option value="${dato2.key}" ${dato2.key == selecionado?"selected='selected'":""}>${dato2.value}</option>
                     </c:forEach>
                </form:select> 
           </form:form>
             
                </td>
                </tr>
         </table>
        </div>
        </footer>
    </body>
</html>
