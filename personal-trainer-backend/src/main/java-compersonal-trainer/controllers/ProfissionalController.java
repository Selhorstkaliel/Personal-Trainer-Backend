package com.personaltrainer.controllers;

import com.personaltrainer.models.Profissional;
import com.personaltrainer.services.ProfissionalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {
    private final ProfissionalService profissionalService;

    public ProfissionalController(ProfissionalService profissionalService) {
        this.profissionalService = profissionalService;
    }

    @GetMapping
    public List<Profissional> getAll() {
        return profissionalService.getAll();
    }
}