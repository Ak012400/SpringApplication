package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
 @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    // public Student saveStudent(Student student) {
    // // ensure that the student does not already have an ID
    //     return studentRepository.save(student);
    // }
}
