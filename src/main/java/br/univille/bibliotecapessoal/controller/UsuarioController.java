package br.univille.bibliotecapessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.bibliotecapessoal.dto.UsuarioDto;
// import br.univille.bibliotecapessoal.entity.Usuario;
import br.univille.bibliotecapessoal.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ModelAndView index(){
        List<UsuarioDto> listaUsuarios = service.getAll();
        return new 
            ModelAndView("usuario/index" ,
            "listaUsuarios", listaUsuarios);
    }
    
    @GetMapping("/novo")
    public ModelAndView novo(){
        UsuarioDto usuario = new UsuarioDto();
        return new ModelAndView("usuario/form", "usuario", usuario);
    }

    @PostMapping(params="form")
    public ModelAndView save(UsuarioDto usuario){
        service.save(usuario);
        
        return new ModelAndView("redirect:/usuario");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable long id){
        UsuarioDto usuario = service.findById(id);

        return new ModelAndView("usuario/form", "usuario", usuario);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        service.delete(id);
        return new ModelAndView("redirect:/usuario");
    }

}
