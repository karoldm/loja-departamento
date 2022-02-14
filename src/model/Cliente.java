
package model;

import java.util.Calendar;

/**
 *
 * @author karol
 */
public class Cliente extends Usuario{
    private boolean clienteOuro;
    
        public Cliente(
            boolean clienteOuro,
            int codigoUsuario, 
            String nome, 
            String cpf, 
            String rg, 
            Calendar dataNascimento, 
            String endereco, 
            String cep, 
            String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.clienteOuro = clienteOuro;
    }

    public boolean isClienteOuro() {
        return clienteOuro;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
