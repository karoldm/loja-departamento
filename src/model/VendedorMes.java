
package model;

/**
 *
 * @author karol
 */
public class VendedorMes {
   private Vendedor vendedor; 
   private int quantidadeVendas;

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
    
    public VendedorMes(Vendedor vendedor, int quantidadeVendas){
        this.vendedor = vendedor;
        this.quantidadeVendas = quantidadeVendas;
    }
}
