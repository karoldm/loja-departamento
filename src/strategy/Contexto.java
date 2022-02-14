
package strategy;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author karol
 */
public class Contexto {
    private OrdenacaoStrategy strategy;
    

    public OrdenacaoStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(OrdenacaoStrategy strategy) {
        this.strategy = strategy;
    }
    
    public ArrayList<Produto> executeEstrategy(ArrayList<Produto> produtos){
        return strategy.ordenar(produtos);
    }
}
