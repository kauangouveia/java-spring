package com.api_visitor_crud.visitor_crud;

import com.api_visitor_crud.visitor_crud.database.RepositorioVisitor;
import com.api_visitor_crud.visitor_crud.entidade.Visitors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:4000")
@RequestMapping("/visitors")
public class VisitorREST {
    @Autowired
    private RepositorioVisitor repositorio;

    @GetMapping
    public List<Visitors>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Visitors visitors){
        repositorio.save(visitors);
    }
    @PutMapping
    public void alterar(@RequestBody Visitors visitors){
        if (visitors.getId() > 0)
            repositorio.save(visitors);
    }
    @DeleteMapping
    public void excluir(@RequestBody Visitors visitors){
        repositorio.delete(visitors);
    }
}