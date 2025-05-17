package com.personaltrainer.controllers;

import com.personaltrainer.models.Atleta;
import com.personaltrainer.services.AtletaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atletas")
public class AtletaController {
    private final AtletaService atletaService;

    public AtletaController(AtletaService atletaService) {
        this.atletaService = atletaService;
    }

    @GetMapping
    public List<Atleta> getAll() {
        return atletaService.getAll();
    }
}