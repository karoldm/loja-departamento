
package controller;

import java.util.Calendar;
import model.LojaDepartamento;
import serializacao.Serializacao;


import model.Cliente;
import model.Usuario;

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
        String dia,
        String mes,
        String ano,
        String endereco, 
        String cep, 
        String email) {
        
        Calendar date = Calendar.getInstance();
        date.set(Integer.parseInt(ano), 
                Integer.parseInt(mes), 
                Integer.parseInt(dia));
        
        Usuario cliente = new Cliente(
                clienteOuro,
                codigo,
                nome,
                cpf,
                rg,
                date,
                endereco,
                cep,
                email
        );
        
        LojaDepartamento.addUsuario(cliente);
    }
}
