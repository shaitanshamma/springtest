<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
   <head>
      <title>Product list</title>
   </head>

   <body>
      <h2>Submitted Product</h2>
      <table>
         <tr>
            <td>id</td>
            <td>${id}</td>
         </tr>
         <tr>
            <td>title</td>
            <td>${title}</td>
         </tr>
         <tr>
            <td>cost</td>
            <td>${cost}</td>
         </tr>
      </table>
      <ul>
         <c:forEach var="item" items="${product.list}">
            <li>${item}</li>
         </c:forEach>
      </ul>
   </body>

</html>