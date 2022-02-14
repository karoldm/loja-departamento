
package model;

import java.util.Calendar;

/**
 *
 * @author karol
 */
public class Eletrodomestico extends Produto {

    public Eletrodomestico(
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
        return(valor + (valor*(2/100)));
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
