package com.personaltrainer.repositories;

import com.personaltrainer.models.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {}