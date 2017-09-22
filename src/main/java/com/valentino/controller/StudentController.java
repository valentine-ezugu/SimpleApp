package com.valentino.controller;

import com.valentino.Entity.Student;
import com.valentino.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

   @Autowired
 private StudentService studentService;

   @RequestMapping(value = "/", method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return  studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Student removeStudentById(@PathVariable("id") int id ) {
        return studentService.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudent( @RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertStudent( @RequestBody Student student) {
        studentService.insertStudent(student);
    }
 }

