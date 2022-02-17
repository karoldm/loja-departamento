
package controller;

import java.util.Calendar;
import model.LojaDepartamento;


import model.Cliente;
import model.Usuario;
import model.Vendedor;

/**
 *
 * @author karol
 */
public class ControladorUsuario {

    public ControladorUsuario(){}
    
    public void addUsuario(
        boolean clienteOuro,
        int codigo, 
        String nome, 
        String cpf, 
        String rg, 
        String dia, String mes, String ano,
        String endereco, 
        String cep, 
        String email) {
        
        Calendar data = Calendar.getInstance();
        data.set(Integer.parseInt(ano), 
                Integer.parseInt(mes), 
                Integer.parseInt(dia));
        
        Usuario cliente = new Cliente(
                clienteOuro,
                codigo,
                nome,
                cpf,
                rg,
                data,
                endereco,
                cep,
                email
        );
        
        LojaDepartamento.addUsuario(cliente);
    }
    
    public void addUsuario(
        float salario,
        String pis,
        String diaA, String mesA, String anoA,
        int codigo, 
        String nome, 
        String cpf, 
        String rg, 
        String diaN, String mesN, String anoN,
        String endereco, 
        String cep, 
        String email) {
        
        Calendar dataN = Calendar.getInstance();
        dataN.set(Integer.parseInt(anoN), 
                Integer.parseInt(mesN), 
                Integer.parseInt(diaN));
        
        Calendar dataA = Calendar.getInstance();
        dataA.set(Integer.parseInt(anoA), 
                Integer.parseInt(mesA), 
                Integer.parseInt(diaA));
        
        Usuario vendedor = new Vendedor(
                salario,
                pis,
                dataA,
                codigo,
                nome,
                cpf,
                rg,
                dataN,
                endereco,
                cep,
                email
        );
        
        LojaDepartamento.addUsuario(vendedor);
    }
    
    public int getTamanhoUsuarios(){
        return LojaDepartamento.getTamanhoUsuarios();
    }
}
