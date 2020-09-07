package br.com.exhale.projetoexhale;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class CamisaPollo extends Camisa {

    private Integer botoes;

    //-----------

    public CamisaPollo(String modelo, String colecao, String tamanho, String tecido, Double preco, Double desconto, Integer botoes) {
        super(modelo, colecao, tamanho, tecido, preco, desconto);
        this.botoes = botoes;
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

    //----------

    public Integer getBotoes() {
        return botoes;
    }
}
