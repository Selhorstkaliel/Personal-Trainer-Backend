package com.personaltrainer.controllers;

import com.personaltrainer.models.Treino;
import com.personaltrainer.services.TreinoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treinos")
public class TreinoController {
    private final TreinoService treinoService;

    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    @GetMapping
    public List<Treino> getAll() {
        return treinoService.getAll();
    }
}