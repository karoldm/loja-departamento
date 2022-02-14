
package model;

import java.util.Calendar;

/**
 *
 * @author karol
 */
public class Vestuario extends Produto {

    public Vestuario(
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
        return((float)(valor + (valor*(1.25/100))));
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
