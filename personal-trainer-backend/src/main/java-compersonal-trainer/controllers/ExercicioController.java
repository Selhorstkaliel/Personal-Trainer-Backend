package com.personaltrainer.controllers;

import com.personaltrainer.models.Exercicio;
import com.personaltrainer.services.ExercicioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {
    private final ExercicioService exercicioService;

    public ExercicioController(ExercicioService exercicioService) {
        this.exercicioService = exercicioService;
    }

    @GetMapping
    public List<Exercicio> getAll() {
        return exercicioService.getAll();
    }
}
