package com.example.API.demo.service;

import com.example.API.demo.DTO.StudentDTO;
import com.example.API.demo.DTO.DegreeDTO;
import com.example.API.demo.DTO.SubjectDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentGradeService {
    public DegreeDTO getMedia(StudentDTO studentDTO) {
        DegreeDTO degreeDTO = new DegreeDTO();

        double mediaAluno = calculaMediaAluno(studentDTO.getSubject());

        degreeDTO.setStudent(studentDTO);
        degreeDTO.setAverageGrade(mediaAluno);
        withHonors(mediaAluno,degreeDTO);

        return degreeDTO;
    }

    private double calculaMediaAluno(List<SubjectDTO> subjectDTOS) {
        double somaNotas = 0;

        for(SubjectDTO disciplina: subjectDTOS)
            somaNotas += Double.parseDouble(disciplina.getGrade());

        return somaNotas/ subjectDTOS.size();
    }

    private void withHonors(double media, DegreeDTO degreeDTO) {
        if(media > 9) {
            degreeDTO.setMessage("Parabéns!!");
        } else {
            degreeDTO.setMessage("Sua média foi: " + media);
        }
    }
}
