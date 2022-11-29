package br.univille.bibliotecapessoal.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.univille.bibliotecapessoal.dto.AutorDto;
import br.univille.bibliotecapessoal.service.AutorService;

@RestController
@RequestMapping("/api/v1/autor")
public class AutorControllerApi {
    @Autowired
    private AutorService service;
    @GetMapping
    public ResponseEntity<List<AutorDto>> getAll(){
        var listaAutor = service.getAll();
        return new ResponseEntity<>(listaAutor,HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<AutorDto> save(@RequestBody AutorDto autor){
        if(autor.getIdAutor() == 0){
            autor = service.save(autor);
            return new ResponseEntity<AutorDto>(autor,HttpStatus.CREATED);

        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/{idAutor}")
    public ResponseEntity<AutorDto> findById(@PathVariable("idAutor") long id){
        var umAutor = service.findById(id);


        if(umAutor.getIdAutor() == 0){
            return ResponseEntity.notFound().build();
        }


        return new ResponseEntity<AutorDto>(umAutor,HttpStatus.OK);

    }


    @PutMapping("/{idAutor}")
    public ResponseEntity<AutorDto> update(@PathVariable("idAutor") long id, 
        @RequestBody AutorDto autor){

        var autorAntigo = service.findById(id);
        if(autorAntigo.getIdAutor() == 0){
            return ResponseEntity.notFound().build();
        }
        //deve ser criado um para cada coluna que é possivel alterar
        autorAntigo.setNomeAutor(autor.getNomeAutor());
        autorAntigo.setPaisOrigem(autor.getPaisOrigem());
        autorAntigo.setAnoNascAutor(autor.getAnoNascAutor());
        autorAntigo.setAnoFacelimentocAutor(autor.getAnoFacelimentocAutor());

        service.save(autorAntigo);

        return new ResponseEntity<AutorDto>(autorAntigo,HttpStatus.OK);

    }

    @DeleteMapping("/{idAutor}")
    public ResponseEntity<AutorDto> delete(@PathVariable("idAutor") long id){
        
        var autorAntigo = service.findById(id);
        if(autorAntigo.getIdAutor() == 0){
            return ResponseEntity.notFound().build();
        }

        service.delete(id);
        return new ResponseEntity<AutorDto>(autorAntigo,HttpStatus.OK);
    }

    
}
