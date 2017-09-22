package com.valentino.service;


import com.valentino.Dao.StudentDao;
import com.valentino.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

  @Autowired
private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return  this.studentDao.getStudentById(id) ;
    }


    public Student removeStudentById(int id){
        return this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
         studentDao.updateStudent(student);
    }

    public void insertStudent(Student student){
        studentDao.updateStudentToDb(student);
    }

}
