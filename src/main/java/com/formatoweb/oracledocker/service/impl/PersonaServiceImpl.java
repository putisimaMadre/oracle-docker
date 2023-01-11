package com.formatoweb.oracledocker.service.impl;

import com.formatoweb.oracledocker.entity.Personas;
import com.formatoweb.oracledocker.repository.PersonaRepository;
import com.formatoweb.oracledocker.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Personas> getPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Personas savePersonas(Personas persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Personas personaById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }
}
