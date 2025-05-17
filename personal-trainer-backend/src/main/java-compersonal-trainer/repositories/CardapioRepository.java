package com.personaltrainer.repositories;

import com.personaltrainer.models.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {}