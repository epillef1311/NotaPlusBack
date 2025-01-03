package com.projeto.notaPlus.agenda.service;

import com.projeto.notaPlus.agenda.domain.Student;
import com.projeto.notaPlus.agenda.dtos.CreateStudent;
import com.projeto.notaPlus.agenda.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    public Student addStudent(CreateStudent student){
        Student entity = modelMapper.map(student, Student.class);
        return  studentRepository.save(entity);
    }
}
