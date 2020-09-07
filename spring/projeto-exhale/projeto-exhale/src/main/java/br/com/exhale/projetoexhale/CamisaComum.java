package br.com.exhale.projetoexhale;

public class CamisaComum extends Camisa {

    //-----------

    private String manga;

    public CamisaComum(String modelo, String colecao, String tamanho, String tecido, Double preco, Double desconto, String manga) {
        super(modelo, colecao, tamanho, tecido, preco, desconto);
        this.manga = manga;
    }


    //-----------


    @Override
    public void vizualizarEtiqueta() {
        return;
    }

    @Override
    public double calcDesconto() {
        return getDesconto() * getPreco();
    }

    //-----------


    public String Manga() {
        return manga;
    }
}
