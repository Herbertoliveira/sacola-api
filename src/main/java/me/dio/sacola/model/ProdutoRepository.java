package me.dio.sacola.model;

import java.util.Optional;

public interface ProdutoRepository {

    Optional<Sacola> findById(Long produtoId);
    
}
