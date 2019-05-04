<%@ page import="pl.itacademy.service.StudentService" %>
<%@ page import="pl.itacademy.model.Student" %>
<%@ page import="java.util.List" %>

<html>
<body>
<ul>
    <% StudentService studentService = new StudentService();
    List<Student> students = studentService.getAllStudents();  %>

    <h1>List of students</h1>
    <ul>
         <%for (Student student : students) {%>
                   <li> <%= student.getName() + " " + student.getSurname() %> </li>
        <% }%>
    </ul>
</body>
</html>
