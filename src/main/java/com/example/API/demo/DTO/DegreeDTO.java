package com.example.API.demo.DTO;

public class DegreeDTO {
    private String message;
    private double averageGrade;
    private StudentDTO student;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    private StudentDTO getAlunoDTO() {
        return student;
    }

    public void setAlunoDTO(StudentDTO studentDTO) {
        this.student = studentDTO;
    }
}
