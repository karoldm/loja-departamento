
package model;

/**
 *
 * @author karol
 */
public class Pix extends Pagamento {
    private String codigoPix;

    public Pix() {
        super("PIX");
        gerarCodigoPix();
    }
    
    private void gerarCodigoPix(){
        codigoPix = Utilidades.randomKey(12);
    }

    public String getCodigoPix() {
        return codigoPix;
    }

    public void setCodigoPix(String codigoPix) {
        this.codigoPix = codigoPix;
    }
    
    @Override
    public String toString(){
        return("Tipo de Pagamento: " + super.getTipoPagamento());
    }
}
