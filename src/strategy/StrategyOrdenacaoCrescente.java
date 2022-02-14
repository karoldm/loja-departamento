
package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Produto;

/**
 *
 * @author karol
 */
public class StrategyOrdenacaoCrescente extends OrdenacaoStrategy {
    
    @Override
    public ArrayList<Produto> ordenar(ArrayList<Produto> produtos){
        ArrayList<Produto> produtosOrdenados = produtos;
        Collections.sort(produtosOrdenados, Comparator.comparing(Produto::getValor));
        return produtosOrdenados;
    }
}
