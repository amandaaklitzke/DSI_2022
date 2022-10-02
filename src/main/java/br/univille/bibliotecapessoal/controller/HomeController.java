package br.univille.bibliotecapessoal.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping({"/","/home"})
public class HomeController {
    
    @GetMapping()
    public ModelAndView index(){
        var nome = "Luluzinha";
        var sobrenome = " De Luz";
        HashMap<String,String> mapa_de_dados =new HashMap<>();
        mapa_de_dados.put("nomenatela", nome);
        mapa_de_dados.put("sobrenome", sobrenome);
        return new 
            ModelAndView("home/index", mapa_de_dados);
    }

}
