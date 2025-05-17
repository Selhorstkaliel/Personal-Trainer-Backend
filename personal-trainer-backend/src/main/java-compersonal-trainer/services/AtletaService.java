package com.personaltrainer.services;

import com.personaltrainer.models.Atleta;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AtletaService {
  public List<Atleta> getAll() {
    return List.of(
      Atleta.builder().id(1L).nome("João").idade(25).objetivo("Hipertrofia").build(),
      Atleta.builder().id(2L).nome("Maria").idade(30).objetivo("Perda de peso").build()
    );
  }
}
