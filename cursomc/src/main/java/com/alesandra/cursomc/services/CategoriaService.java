package com.alesandra.cursomc.services;


import com.alesandra.cursomc.domain.Categoria;
import com.alesandra.cursomc.repositories.CategoriaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() ->
                new RuntimeException("Objeto não encontrado! Id: " + id));
    }

}
