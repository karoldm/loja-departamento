
package model;

import java.util.Calendar;

/**
 *
 * @author karol
 */
public class Eletronico extends Produto {

    public Eletronico(
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
        return(float)(valor + (valor*(4.5/100)));
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
