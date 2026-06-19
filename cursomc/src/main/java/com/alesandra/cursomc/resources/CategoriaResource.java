package com.alesandra.cursomc.resources;

import com.alesandra.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

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
}
