package com.personaltrainer.repositories;

import com.personaltrainer.models.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtletaRepository extends JpaRepository<Atleta, Long> {}
