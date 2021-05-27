package com.example.API.demo.DTO;

import java.util.List;

public class AlunoDTO {
    private String nome;
    private List<DisciplinaDTO> disciplinaDTO;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<DisciplinaDTO> getDisciplinaDTO() {
        return disciplinaDTO;
    }

    public void setDisciplinaDTO(List<DisciplinaDTO> disciplinaDTO) {
        this.disciplinaDTO = disciplinaDTO;
    }
}
