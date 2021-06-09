package com.example.API.demo.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class StudentDTO {
    @NotNull(message = "Nome é obrigatório.")
    @Size(min=8, max=50, message = "Mínimo de 8 caracteres e máximo de 50 caracteres.")
    private String name;

    @NotNull(message = "Aluno deve conter lista de matérias.")
    private List<SubjectDTO> subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubject() {
        return subject;
    }

    public void setSubject(List<SubjectDTO> subject) {
        this.subject = subject;
    }
}
