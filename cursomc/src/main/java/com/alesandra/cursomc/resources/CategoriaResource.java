package com.alesandra.cursomc.resources;

import com.alesandra.cursomc.domain.Categoria;
import com.alesandra.cursomc.repositories.CategoriaRepository;
import com.alesandra.cursomc.services.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;



    @RequestMapping(value="/teste",method = RequestMethod.GET)
    public String Teste(){
        return "Rest esta funcionando";
    }

    @RequestMapping(value="/lst",method = RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1,"Informatica");
        Categoria cat2 = new Categoria(2,"Escritorio");

        List <Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<Categoria> find(@PathVariable Integer id) {
        Categoria obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
