
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author karol
 */
public class Venda {
    private int codigoVenda;
    private Cliente cliente;
    private Vendedor vendedor;
    private Calendar dataVenda;
    private ArrayList<ItemVenda> itensVenda;
    private float valorTotal;
    private float valorDesconto;
    private Pagamento formaPagamento;

    public Venda(
            int codigoVenda, 
            Cliente cliente, 
            Vendedor vendedor, 
            Calendar dataVenda,
            ArrayList<ItemVenda> itensVenda, 
            Pagamento formaPagamento) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.itensVenda = itensVenda;
        this.formaPagamento = formaPagamento;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public float calcularValorTotal(){
        float total = 0;
        Iterator<ItemVenda> iterator = itensVenda.iterator();
        
        while(iterator.hasNext()){
            total += iterator.next().calcularTotal();
        }
        
        if(cliente.isClienteOuro()) return(total - (total*2/100));
        else return total;
    }
    
    public void addItemVenda(ItemVenda item){
        itensVenda.add(item);
    }
    
    @Override
    public String toString(){
        return(
            "\nCódigo: " + codigoVenda +
            "\nCliente: " + cliente +
            "\nVendedor: " + vendedor +
            "\nData da Venda: " + dataVenda +
            "\nItens Vendidos: " + itensVenda +
            "\nValor Total: " + valorTotal +
            "\nValor de Desconto: " + valorDesconto +
            "\nForma de Pagamento: " + formaPagamento
        );
    }
} 