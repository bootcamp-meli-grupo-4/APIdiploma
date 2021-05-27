package com.example.API.demo.controller;

import com.example.API.demo.DTO.AlunoDTO;
import com.example.API.demo.DTO.DiplomaDTO;
import com.example.API.demo.service.APINotaAlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APINotaAlunoController {
    private APINotaAlunoService apiNotaAlunoService;

    public APINotaAlunoController(APINotaAlunoService apiNotaAlunoService) {
        this.apiNotaAlunoService = apiNotaAlunoService;
    }

    @PostMapping("/mediaAluno")
    public ResponseEntity<DiplomaDTO> getMediaAluno(@RequestBody AlunoDTO alunoDTO) {
        return new ResponseEntity<>(apiNotaAlunoService.getMedia(alunoDTO), HttpStatus.OK);
    }
}
