package com.api_visitor_crud.visitor_crud.database;

import com.api_visitor_crud.visitor_crud.entidade.Visitors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioVisitor extends JpaRepository<Visitors, Long> {

}
