package com.lojagames.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojagames.game.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
