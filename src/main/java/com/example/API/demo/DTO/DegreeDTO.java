package com.example.API.demo.DTO;

public class DegreeDTO {
    private String mensagem;
    private double mediaNota;
    private StudentDTO studentDTO;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public double getMediaNota() {
        return mediaNota;
    }

    public void setMediaNota(double mediaNota) {
        this.mediaNota = mediaNota;
    }

    private StudentDTO getAlunoDTO() {
        return studentDTO;
    }

    public void setAlunoDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }
}
