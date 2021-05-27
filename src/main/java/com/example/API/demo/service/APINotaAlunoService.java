package com.example.API.demo.service;

import com.example.API.demo.DTO.AlunoDTO;
import com.example.API.demo.DTO.DiplomaDTO;
import com.example.API.demo.DTO.DisciplinaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APINotaAlunoService {
    public DiplomaDTO getMedia(AlunoDTO alunoDTO) {
        DiplomaDTO diplomaDTO = new DiplomaDTO();

        double mediaAluno = calculaMediaAluno(alunoDTO.getDisciplinaDTO());

        diplomaDTO.setAlunoDTO(alunoDTO);
        diplomaDTO.setMediaNota(mediaAluno);
        if(mediaAluno > 9) {
            diplomaDTO.setMensagem("Parabéns!!");
        } else {
            diplomaDTO.setMensagem("...");
        }

        return diplomaDTO;
    }

    private double calculaMediaAluno(List<DisciplinaDTO> disciplinaDTOS) {
        double somaNotas = 0;

        for(DisciplinaDTO disciplina: disciplinaDTOS)
            somaNotas += disciplina.getNota();

        return somaNotas/disciplinaDTOS.size();
    }
}
