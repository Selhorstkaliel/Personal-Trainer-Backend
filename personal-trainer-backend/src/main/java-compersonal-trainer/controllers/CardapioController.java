package com.personaltrainer.controllers;

import com.personaltrainer.models.Cardapio;
import com.personaltrainer.services.CardapioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardapios")
public class CardapioController {
    private final CardapioService cardapioService;

    public CardapioController(CardapioService cardapioService) {
        this.cardapioService = cardapioService;
    }

    @GetMapping
    public List<Cardapio> getAll() {
        return cardapioService.getAll();
    }
}