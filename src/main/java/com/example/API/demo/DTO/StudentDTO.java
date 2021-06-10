package com.example.API.demo.DTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class StudentDTO {
    @NotNull(message = "Nome é obrigatório.")
    @Size(min=8, max=50, message = "Mínimo de 8 caracteres e máximo de 50 caracteres.")
    @Pattern(regexp = "[a-z]+$", message = "Nome aceita apenas letras minusculas.")
    private String name;

    @Valid
    @NotNull(message = "Aluno deve conter lista de matérias.")
    private List<SubjectDTO> subject;

    public StudentDTO(String name, List<SubjectDTO> subject) {
        this.name = name;
        this.subject = subject;
    }

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
