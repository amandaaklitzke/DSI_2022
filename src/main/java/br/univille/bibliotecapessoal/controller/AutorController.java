package br.univille.bibliotecapessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.univille.bibliotecapessoal.dto.AutorDto;
import br.univille.bibliotecapessoal.service.AutorService;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping
    public ModelAndView index(){
        List<AutorDto> listaAutor = service.getAll();
        return new 
            ModelAndView("autor/index" ,
            "listaAutor", listaAutor);
    }
    
    @GetMapping("/novo")
    public ModelAndView novo(){
        AutorDto autor = new AutorDto();
        return new ModelAndView("autor/form", "autor", autor);
    }

    @PostMapping(params="form")
    public ModelAndView save(AutorDto autor){
        service.save(autor);
        
        return new ModelAndView("redirect:/autor");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable long id){
        AutorDto autor = service.findById(id);

        return new ModelAndView("autor/form", "autor", autor);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        service.delete(id);
        return new ModelAndView("redirect:/autor");
    }

}
