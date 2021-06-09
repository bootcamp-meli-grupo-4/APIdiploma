package com.example.API.demo.controller;

import com.example.API.demo.DTO.StudentDTO;
import com.example.API.demo.DTO.DegreeDTO;
import com.example.API.demo.service.StudentGradeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StudentGrade {
    private StudentGradeService studentGradeService;

    public StudentGrade(StudentGradeService studentGradeService) {
        this.studentGradeService = studentGradeService;
    }

    @PostMapping("/analyzeNotes")
    public ResponseEntity<DegreeDTO> getMediaAluno(@RequestBody @Valid StudentDTO studentDTO) {
        return new ResponseEntity<>(studentGradeService.getMedia(studentDTO), HttpStatus.CREATED);
    }
}
