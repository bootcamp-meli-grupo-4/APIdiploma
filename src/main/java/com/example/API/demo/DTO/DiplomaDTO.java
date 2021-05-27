package com.example.API.demo.DTO;

public class DiplomaDTO {
    private String mensagem;
    private double mediaNota;
    private AlunoDTO alunoDTO;

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

    private AlunoDTO getAlunoDTO() {
        return alunoDTO;
    }

    public void setAlunoDTO(AlunoDTO alunoDTO) {
        this.alunoDTO = alunoDTO;
    }
}
