package com.example.hogwartsapp.service;

import com.example.hogwartsapp.model.Student;

public interface StudentService {

    Student addStudent(Student student);

    Student findStudent(long id);

    Student editStudent(long id, Student student);

    void deleteStudent(long id);
}
