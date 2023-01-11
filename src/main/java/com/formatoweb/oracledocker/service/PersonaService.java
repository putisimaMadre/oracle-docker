package com.formatoweb.oracledocker.service;

import com.formatoweb.oracledocker.entity.Personas;

import java.util.List;

public interface PersonaService {
    List<Personas> getPersonas();
    Personas savePersonas(Personas personas);
    Personas personaById(Long id);
}
