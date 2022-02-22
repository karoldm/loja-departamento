
package controller;

import java.util.ArrayList;
import java.util.Calendar;
import model.Cliente;
import model.ItemVenda;
import model.LojaDepartamento;
import model.Pagamento;
import model.Venda;
import model.Vendedor;

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
    
}
