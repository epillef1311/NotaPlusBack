package com.projeto.notaPlus.agenda.service;

import com.projeto.notaPlus.agenda.domain.Student;
import com.projeto.notaPlus.agenda.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student){
        return  studentRepository.save(student);
    }
}
