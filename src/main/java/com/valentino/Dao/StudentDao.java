package com.valentino.Dao;

import com.valentino.Entity.Student;
 import org.springframework.stereotype.Repository;

 import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "valentine", "Algorithms"));
                put(2, new Student(2, "Roman", "Graphics"));
                put(3, new Student(3, "Spencer", "Artificial Interlligence"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public Student removeStudentById(int id) {
        return this.students.remove(id);
    }

    public void updateStudent(Student student) {
        Student student1 = students.get(student.getId());
        student1.setCourse(student.getCourse());
        student1.setName(student.getName());
        students.put(student.getId(), student);
    }

    public void updateStudentToDb(Student student) {
        this.students.put(student.getId(), student);
    }
}
