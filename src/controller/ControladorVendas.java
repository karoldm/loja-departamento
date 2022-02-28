
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.LojaDepartamento;
import model.Venda;

/**
 *
 * @author karol
 */
public class ControladorVendas {
 
    public int getTamanhoVendas(){
        return LojaDepartamento.getTamanhoVendas();
    }
    
    public void addVenda(Venda venda){        
        LojaDepartamento.addVenda(venda);
    }
    
    public ArrayList<Venda> getVendas(){
        return LojaDepartamento.getVendas();
    }
    
    public Object[][] relatorioVendasCliente(int codigo){
        ArrayList<Venda> vendas = LojaDepartamento.vendasCliente(codigo);
        
        Object[][] vendasDados = new Object[vendas.size()][8];

        Iterator<Venda> iterator = vendas.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Venda v = iterator.next();

            vendasDados[i][0] = v.getCodigoVenda();
            vendasDados[i][1] = v.getCliente().getNome();
            vendasDados[i][2] = v.getVendedor().getNome();
            vendasDados[i][3] = v.getDataVenda().getTime();
            vendasDados[i][4] = v.getItensVenda();
            vendasDados[i][5] = v.getValorTotal();
            vendasDados[i][6] = v.getValorDesconto();
            vendasDados[i][7] = v.getFormaPagamento().getTipoPagamento();
            i++;
        }

        return vendasDados;

    }
    
    public Object[][] relatorioVendasRealizadas(){
        ArrayList<Venda> vendas = LojaDepartamento.getVendas();
        
        Object[][] vendasDados = new Object[vendas.size()][8];

        Iterator<Venda> iterator = vendas.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Venda v = iterator.next();

            vendasDados[i][0] = v.getCodigoVenda();
            vendasDados[i][1] = v.getCliente().getNome();
            vendasDados[i][2] = v.getVendedor().getNome();
            vendasDados[i][3] = v.getDataVenda().getTime();
            vendasDados[i][4] = v.getItensVenda();
            vendasDados[i][5] = v.getValorTotal();
            vendasDados[i][6] = v.getValorDesconto();
            vendasDados[i][7] = v.getFormaPagamento().getTipoPagamento();
            i++;
        }

        return vendasDados;

    }
    
    public Object[][] relatorioVendasDinheiro(){
        ArrayList<Venda> vendas = LojaDepartamento.getVendasByTipoPagamento("Dinheiro");
        
        Object[][] vendasDados = new Object[vendas.size()][8];

        Iterator<Venda> iterator = vendas.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Venda v = iterator.next();

            vendasDados[i][0] = v.getCodigoVenda();
            vendasDados[i][1] = v.getCliente().getNome();
            vendasDados[i][2] = v.getVendedor().getNome();
            vendasDados[i][3] = v.getDataVenda().getTime();
            vendasDados[i][4] = v.getItensVenda();
            vendasDados[i][5] = v.getValorTotal();
            vendasDados[i][6] = v.getValorDesconto();
            vendasDados[i][7] = v.getFormaPagamento().getTipoPagamento();
            i++;
        }

        return vendasDados;

    }
    public Object[][] relatorioVendasPIX(){
        ArrayList<Venda> vendas = LojaDepartamento.getVendasByTipoPagamento("PIX");
        
        Object[][] vendasDados = new Object[vendas.size()][8];

        Iterator<Venda> iterator = vendas.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Venda v = iterator.next();

            vendasDados[i][0] = v.getCodigoVenda();
            vendasDados[i][1] = v.getCliente().getNome();
            vendasDados[i][2] = v.getVendedor().getNome();
            vendasDados[i][3] = v.getDataVenda().getTime();
            vendasDados[i][4] = v.getItensVenda();
            vendasDados[i][5] = v.getValorTotal();
            vendasDados[i][6] = v.getValorDesconto();
            vendasDados[i][7] = v.getFormaPagamento().getTipoPagamento();
            i++;
        }

        return vendasDados;
    }
    
    
}
