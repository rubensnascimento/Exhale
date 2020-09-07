package br.com.exhale.projetoexhale;

public abstract class Camisa {

    //------------

    private String modelo;
    private String colecao;
    private String tamanho;
    private String tecido;
    private Double preco;
    private Double desconto;

    //------------

    public Camisa(String modelo, String colecao, String tamanho, String tecido, Double preco, Double desconto) {
        this.modelo = modelo;
        this.colecao = colecao;
        this.tamanho = tamanho;
        this.tecido = tecido;
        this.preco = preco;
        this.desconto = desconto;
    }


    //-----------

    public abstract void vizualizarEtiqueta();
    public abstract double calcDesconto();

    //------------

    public String getColecao() {
        return colecao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTecido() {
        return tecido;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public String getModelo() {
        return modelo;
    }
}
