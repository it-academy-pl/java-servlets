package pl.itacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.itacademy.model.Student;
import pl.itacademy.service.StudentService;

import java.util.List;

/**
 * Created by Asia on 27.04.2019.
 */

@Controller
public class AllStudentsSpringMvc {

    public StudentService studentService = new StudentService();

    @RequestMapping(path="/allStudentsMvc", method = RequestMethod.GET) //domyslna GET, ale dla posta musi byc ten parametr
    public ModelAndView allStudents(){
         List<Student> students = studentService.getAllStudents();
        return new ModelAndView("/allStudents.jsp", "students", students);


    }











}
