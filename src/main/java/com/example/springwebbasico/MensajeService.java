package com.example.springwebbasico;

import org.springframework.stereotype.Service;

@Service
public class MensajeService {

    public String obtenerMensaje() {
        return "Hola desde Spring Boot";
    }
}
