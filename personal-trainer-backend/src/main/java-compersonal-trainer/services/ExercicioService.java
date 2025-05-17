package com.personaltrainer.services;

import com.personaltrainer.models.Exercicio;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExercicioService {
    public List<Exercicio> getAll() {
        return List.of(
            Exercicio.builder().id(1L).nome("Agachamento").grupoMuscular("Pernas").repeticoes("3x12").build(),
            Exercicio.builder().id(2L).nome("Supino").grupoMuscular("Peito").repeticoes("4x10").build()
        );
    }
}