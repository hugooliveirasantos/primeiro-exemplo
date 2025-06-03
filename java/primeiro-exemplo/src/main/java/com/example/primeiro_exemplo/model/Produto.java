package com.example.primeiro_exemplo.model;

public class Produto {

    private Integer id;

    private String produto;

    private String quantidade;

    private String valor;

    private String observacao;

    public Integer getId() {
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
