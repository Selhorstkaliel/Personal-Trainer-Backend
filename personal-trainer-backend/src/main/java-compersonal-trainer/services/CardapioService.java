package com.personaltrainer.services;

import com.personaltrainer.models.Cardapio;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CardapioService {
    public List<Cardapio> getAll() {
        return List.of(
            Cardapio.builder().id(1L).titulo("Cardápio A").descricao("Rico em proteínas").build(),
            Cardapio.builder().id(2L).titulo("Cardápio B").descricao("Dieta balanceada").build()
        );
    }
}
