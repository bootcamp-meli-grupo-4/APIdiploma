package com.example.API.demo.unit;

import com.example.API.demo.DTO.StudentDTO;
import com.example.API.demo.DTO.SubjectDTO;
import com.example.API.demo.service.StudentGradeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

public class CertificateServiceImplTest {
    StudentGradeService studentGradeService;

    @BeforeEach
    void setup() {
        studentGradeService = new StudentGradeService();
    }

    @Test
    public void ShoukdCalculateAveerageGrade() {
        //arrange
        List<SubjectDTO> subjects = new LinkedList<>();

        subjects.add(new SubjectDTO("biologia","8"));
        subjects.add(new SubjectDTO("portugues","7"));

        StudentDTO student = new StudentDTO("alunoteste",subjects);

        //act
        double media = studentGradeService.getMedia(student).getAverageGrade();

        //assert
        Assertions.assertEquals(media ,7.5);
    }
}
