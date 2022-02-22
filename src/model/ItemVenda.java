
package model;

import java.io.Serializable;

/**
 *
 * @author karol
 */
public class ItemVenda implements Serializable{
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float calcularTotal(){
        return(produto.getValor() * quantidade);
    }
    
    @Override
    public String toString(){
        return quantidade + "x - " + produto;
    }
}
