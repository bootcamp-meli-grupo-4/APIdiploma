package com.example.API.demo.DTO;

import java.util.List;

public class StudentDTO {
    private String nome;
    private List<SubjectDTO> subjectDTO;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<SubjectDTO> getDisciplinaDTO() {
        return subjectDTO;
    }

    public void setDisciplinaDTO(List<SubjectDTO> subjectDTO) {
        this.subjectDTO = subjectDTO;
    }
}
