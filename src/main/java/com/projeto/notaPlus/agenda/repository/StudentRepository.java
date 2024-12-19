package com.projeto.notaPlus.agenda.repository;

import com.projeto.notaPlus.agenda.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    //Optional<Student>findBySerieEscolar(String serieEscolar);
}
