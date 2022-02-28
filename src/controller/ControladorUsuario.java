
package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;


import model.Cliente;
import model.Fornecedor;
import model.LojaDepartamento;
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
    
    public Usuario getUsuarioByCodigo(int codigo){
        for(Usuario u: LojaDepartamento.getUsuarios()){
            if(u.getCodigoUsuario() == codigo) return u;
        }
        return null;
    }
    
    public Object[][] relatorioVendedoresCadastrados(){
        ArrayList<Vendedor> vendedores = LojaDepartamento.getVendedores();

        Object[][] vendedoresDados = new Object[vendedores.size()][11];

        Iterator<Vendedor> iterator = vendedores.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Vendedor v = iterator.next();

            vendedoresDados[i][0] = v.getCodigoUsuario();
            vendedoresDados[i][1] = v.getNome();
            vendedoresDados[i][2] = v.getCpf();
            vendedoresDados[i][3] = v.getRg();
            vendedoresDados[i][4] = v.getDataNascimento().getTime();
            vendedoresDados[i][5] = v.getEndereco();
            vendedoresDados[i][6] = v.getCep();
            vendedoresDados[i][7] = v.getEmail();
            vendedoresDados[i][8] = v.getSalario();
            vendedoresDados[i][9] = v.getPis();
            vendedoresDados[i][10] = v.getDataAdmissao().getTime();
            i++;
        }

        return vendedoresDados;
    }
    
    public Object[][] relatorioClientesCadastrados(){
        ArrayList<Cliente> clientes = LojaDepartamento.getClientes();

        Object[][] clientesDados = new Object[clientes.size()][9];

        Iterator<Cliente> iterator = clientes.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Cliente c = iterator.next();

            clientesDados[i][0] = c.getCodigoUsuario();
            clientesDados[i][1] = c.getNome();
            clientesDados[i][2] = c.getCpf();
            clientesDados[i][3] = c.getRg();
            clientesDados[i][4] = c.getDataNascimento().getTime();
            clientesDados[i][5] = c.getEndereco();
            clientesDados[i][6] = c.getCep();
            clientesDados[i][7] = c.getEmail();
            clientesDados[i][8] = c.isClienteOuro();
            i++;
        }

        return clientesDados;
    }
}
