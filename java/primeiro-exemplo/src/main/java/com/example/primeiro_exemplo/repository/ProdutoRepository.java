package com.example.primeiro_exemplo.repository;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.example.primeiro_exemplo.model.Produto;

@Repository
public class ProdutoRepository {
    
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Método para retornar uma lista de produtos
     * @return Lista de produtos
     */
    public List<Produto> obterTodos(){
        return produtos;
    }

    /**
     * Método que retorna produto encontrado pelo ID
     * @param id do produto que será localizado
     * @return Retorna um produto caso encontre.
     */
    public Optional<Produto> obterPorId (Integer id){
        return produtos.stream()
                       .filter(produto -> produto.getId() == id)
                       .findFirst();
    }

    /**
     * Método que adiciona um novo produto
     * @param produto a ser adicionado
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto){

        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);

        return produto;
    }
    
    /**
     * Método para deletar produto por id.
     * @param id do produto a ser deletado.
     */
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Método responsavel por atualizar um produto.
     * @param produto a ser atualizado.
     * @return produto atualizado.
     */
    public Produto atualizar(Produto produto){
        // Encontrar produto
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if (produtoEncontrado.isEmpty()){
            throw new InputMismatchException("Produto nao encontrado.");
        }

        // Remover produto antigo da lista
        deletar(produto.getId());        

        // Adicionar novo produto
        produtos.add(produto);

        return produto;

    }

}
