package com.personaltrainer.repositories;

import com.personaltrainer.models.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinoRepository extends JpaRepository<Treino, Long> {}