<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<%@ page import="pl.itacademy.model.Student" %>
<%@ page import="java.util.List" %>

<html>
<body>
<ul>
    <%
    List<Student> students = (List)request.getAttribute("students") ;%>
    <h1>List of students 2</h1>
    <ul>

    <h3>JSTL VERSION</h3>
    <c:forEach items="${students}" var="student"  >
        <li>${student.name}</li>
    </c:forEach>


    <h3>JSP VERSION</h3>
         <%for (Student student : students) {%>
                   <li> <%= student.getName() + " " + student.getSurname() %> </li>
        <% }%>


    </ul>
</body>
</html>
