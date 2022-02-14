
package factory;

import java.util.Calendar;
import model.Alimentacao;
import model.Eletrodomestico;
import model.Eletronico;
import model.Fornecedor;
import model.Produto;

/**
 *
 * @author karol
 */
public class FactoryProduto {
    
    public static Produto factoryMethod(
            String produto, 
            int codigoProduto, 
            String nome, 
            String descricao, 
            Calendar dataFabricacao, 
            float valor, 
            Fornecedor fornecedor, 
            boolean disponivel
    ){
        String produtoLower = produto.toLowerCase();
        
        switch(produtoLower){
            case "alimentação": return new Alimentacao(
                    codigoProduto,
                    nome,
                    descricao,
                    dataFabricacao,
                    valor,
                    fornecedor,
                    disponivel);
            case "eletrodoméstico": return new Eletrodomestico(
                    codigoProduto,
                    nome,
                    descricao,
                    dataFabricacao,
                    valor,
                    fornecedor,
                    disponivel);
            case "eletrônico": return new Eletronico(
                    codigoProduto,
                    nome,
                    descricao,
                    dataFabricacao,
                    valor,
                    fornecedor,
                    disponivel);
            case "vestuario": return new Alimentacao(
                    codigoProduto,
                    nome,
                    descricao,
                    dataFabricacao,
                    valor,
                    fornecedor,
                    disponivel);
            default: return null;
        }
    }
}
