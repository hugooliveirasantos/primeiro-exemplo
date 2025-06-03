package com.example.primeiro_exemplo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.primeiro_exemplo.model.Produto;
import com.example.primeiro_exemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    /**
     * Na classe de services, poderiamos implementar
     * regras caso fosse necessario.
     */

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId (Integer id){
        return produtoRepository.obterPorId(id);
    }

    public Produto adicionar(Produto produto){
        return produtoRepository.adicionar(produto);
    }

    public void deletar(Integer id){
        produtoRepository.deletar(id);
    }

    public Produto atualizar(Integer id, Produto produto){
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }

}
