package com.projeto.notaPlus.agenda.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
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
