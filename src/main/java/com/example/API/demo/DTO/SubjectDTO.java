package com.example.API.demo.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SubjectDTO {
    @NotNull(message = "O nome da matéria deve ser definido.")
    @Size(min=8, max=50, message = "A matéria deve conter, no m[inimo, 8 caracteres e, no máximo, 50 caracteres.")
    @Pattern(regexp = "[a-z]", message = "O nome deve conter apenas letras minusculas.")
    private String name;

    @NotNull(message = "A nota da matéria deve ser definida.")
    @Size(min = 1, max = 2, message = "A nota deve conter, no mínimo, 1 carcater e, no máximo, 2 caracteres.")
    @Pattern(regexp = "[0-9]", message = "A nota deve conter apenas numeros")
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
