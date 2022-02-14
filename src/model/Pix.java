
package model;

/**
 *
 * @author karol
 */
public class Pix extends Pagamento {
    private String codigoPix;

    public Pix(String codigoPix) {
        super("PIX");
        this.codigoPix = codigoPix;
    }
    
    //public void gerarCodigoPix(){}

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
