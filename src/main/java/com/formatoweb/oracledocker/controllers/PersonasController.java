package com.formatoweb.oracledocker.controllers;

import com.formatoweb.oracledocker.entity.Personas;
import com.formatoweb.oracledocker.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonasController {
    @Autowired
    private PersonaService personaService;
    @GetMapping("/personas")
    List<Personas> getPersonas(){
        return personaService.getPersonas();
    }
    @PostMapping("/personas")
    Personas savePersonas(@RequestBody Personas persona){
        return personaService.savePersonas(persona);
    }
}
