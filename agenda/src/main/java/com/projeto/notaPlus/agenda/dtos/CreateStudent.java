package com.projeto.notaPlus.agenda.dtos;

import lombok.Data;

import java.util.Date;


@Data
public class CreateStudent {

    private String name;

    private Date dataNascimento;

    private String serieEscolar;

    private String alunoFixo;

    private String materias;

    private String descricao;
}
