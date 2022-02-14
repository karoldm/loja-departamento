
package model;

import java.util.Calendar;

/**
 *
 * @author karol
 */
public class Vendedor extends Usuario {
    protected float salario;
    protected String pis;
    protected Calendar dataAdmissao;

    public Vendedor(
            float salario, 
            String pis, 
            Calendar dataAdmissao, 
            int codigoUsuario, 
            String nome, 
            String cpf, 
            String rg, 
            Calendar dataNascimento, 
            String endereco, 
            String cep, 
            String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }
    
    
    
    @Override
    public String toString(){
        return(
           super.toString() + 
           "\nSalário: " + salario +
           "\nPIS: " + pis +
           "\nData de Admissão: " + dataAdmissao.getTime()
        );
    }
}
