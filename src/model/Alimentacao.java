
package model;

import java.util.Calendar;

/**
 *
 * @author karol
 */
public class Alimentacao extends Produto {

    public Alimentacao(
            int codigoProduto, 
            String nome, 
            String descricao, 
            Calendar dataFabricacao, 
            float valor, 
            Fornecedor fornecedor, 
            boolean disponivel) {
        super(codigoProduto, nome, descricao, dataFabricacao, valor, fornecedor, disponivel);
    }
    
    @Override
    public float calcularValor(){
        return (valor + (valor*(5/100)));
    }
    
}
