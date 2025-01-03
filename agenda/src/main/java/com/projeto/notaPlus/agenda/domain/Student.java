package com.projeto.notaPlus.agenda.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;


@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date dataNascimento;

    @Column(nullable = false)
    private String serieEscolar;

    @Column(nullable = false)
    private String alunoFixo;

    @Column(nullable = true)
    private String materias;

    @Column(nullable = true)
    private String descricao;
}
