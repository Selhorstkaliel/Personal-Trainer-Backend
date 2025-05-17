package com.personaltrainer.services;

import com.personaltrainer.models.Profissional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfissionalService {
    public List<Profissional> getAll() {
        return List.of(
            Profissional.builder().id(1L).nome("Dr. Carlos").especialidade("Nutrição").build(),
            Profissional.builder().id(2L).nome("Dra. Ana").especialidade("Treinamento Funcional").build()
        );
    }
}