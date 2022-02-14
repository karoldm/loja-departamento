
package model;

/**
 *
 * @author karol
 */
public class Dinheiro extends Pagamento {

    public Dinheiro() {
        super("Dinheiro");
    }
    
    @Override
    public String toString(){
        return("Tipo de Pagamento: " + super.getTipoPagamento());
    }
}
