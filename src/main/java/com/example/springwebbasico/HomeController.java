package com.example.springwebbasico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private MensajeService mensajeService;

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("mensaje", mensajeService.obtenerMensaje());
        return "inicio";
    }
}
