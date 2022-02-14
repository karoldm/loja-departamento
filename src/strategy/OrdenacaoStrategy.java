
package strategy;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author karol
 */
public abstract class OrdenacaoStrategy {
    
    public abstract ArrayList<Produto> ordenar(ArrayList<Produto> produtos);
    
}
