package com.personaltrainer.services;

import com.personaltrainer.models.Treino;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TreinoService {
    public List<Treino> getAll() {
        return List.of(
            Treino.builder().id(1L).titulo("Treino A").descricao("Pernas e glúteos").build(),
            Treino.builder().id(2L).titulo("Treino B").descricao("Peito e tríceps").build()
        );
    }
}