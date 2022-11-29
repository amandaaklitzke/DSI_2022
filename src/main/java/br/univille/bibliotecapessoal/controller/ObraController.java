package br.univille.bibliotecapessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.bibliotecapessoal.dto.ObraDto;
// import br.univille.bibliotecapessoal.entity.Obra;
import br.univille.bibliotecapessoal.service.ObraService;

@Controller
@RequestMapping("/obra")
public class ObraController {

    @Autowired
    private ObraService service;

    @GetMapping
    public ModelAndView index(){
        List<ObraDto> listaObras = service.getAll();
        return new 
            ModelAndView("obra/index" ,
            "listaObras", listaObras);
    }
    
    @GetMapping("/novo")
    public ModelAndView novo(){
        ObraDto obra = new ObraDto();
        return new ModelAndView("obra/form", "obra", obra);
    }

    @PostMapping(params="form")
    public ModelAndView save(ObraDto obra){
        service.save(obra);
        
        return new ModelAndView("redirect:/obra");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable long id){
        ObraDto obra = service.findById(id);

        return new ModelAndView("obra/form", "obra", obra);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        service.delete(id);
        return new ModelAndView("redirect:/obra");
    }

}
