package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import model.Cliente;
import model.LojaDepartamento;
import model.Usuario;
import model.Venda;
import model.Vendedor;
import model.VendedorMes;

/**
 *
 * @author karol
 */
public class ControladorUsuario {

    public ControladorUsuario() {
    }

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
                Integer.parseInt(mes)-1,
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
                Integer.parseInt(mesN)-1,
                Integer.parseInt(diaN));

        Calendar dataA = Calendar.getInstance();
        dataA.set(Integer.parseInt(anoA),
                Integer.parseInt(mesA)-1,
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

    public int getTamanhoUsuarios() {
        return LojaDepartamento.getTamanhoUsuarios();
    }

    public Usuario getUsuarioByCodigo(int codigo) {
        for (Usuario u : LojaDepartamento.getUsuarios()) {
            if (u.getCodigoUsuario() == codigo) {
                return u;
            }
        }
        return null;
    }

    public Object[][] relatorioVendedoresCadastrados() {
        ArrayList<Vendedor> vendedores = LojaDepartamento.getVendedores();

        Object[][] vendedoresDados = new Object[vendedores.size()][11];

        Iterator<Vendedor> iterator = vendedores.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Vendedor v = iterator.next();
            
            Calendar dataNascimento = v.getDataNascimento();
            Calendar dataAdmissao = v.getDataAdmissao();

            vendedoresDados[i][0] = v.getCodigoUsuario();
            vendedoresDados[i][1] = v.getNome();
            vendedoresDados[i][2] = v.getCpf();
            vendedoresDados[i][3] = v.getRg();
            vendedoresDados[i][4] = (dataNascimento.get(Calendar.DATE)+
                    "/"+(dataNascimento.get(Calendar.MONTH)+1)+
                    "/"+dataNascimento.get(Calendar.YEAR));
            vendedoresDados[i][5] = v.getEndereco();
            vendedoresDados[i][6] = v.getCep();
            vendedoresDados[i][7] = v.getEmail();
            vendedoresDados[i][8] = String.format("%.2f", v.getSalario());
            vendedoresDados[i][9] = v.getPis();
            vendedoresDados[i][10] = (dataAdmissao.get(Calendar.DATE)+
                    "/"+(dataAdmissao.get(Calendar.MONTH)+1)+ 
                    "/"+dataAdmissao.get(Calendar.YEAR));
            i++;
        }

        return vendedoresDados;
    }

    public Object[][] relatorioClientesCadastrados() {
        ArrayList<Cliente> clientes = LojaDepartamento.getClientes();

        Object[][] clientesDados = new Object[clientes.size()][9];

        Iterator<Cliente> iterator = clientes.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Cliente c = iterator.next();

            Calendar dataNascimento = c.getDataNascimento();
            
            clientesDados[i][0] = c.getCodigoUsuario();
            clientesDados[i][1] = c.getNome();
            clientesDados[i][2] = c.getCpf();
            clientesDados[i][3] = c.getRg();
            clientesDados[i][4] = (dataNascimento.get(Calendar.DATE)+
                    "/"+(dataNascimento.get(Calendar.MONTH)+1)+
                    "/"+dataNascimento.get(Calendar.YEAR));
            clientesDados[i][5] = c.getEndereco();
            clientesDados[i][6] = c.getCep();
            clientesDados[i][7] = c.getEmail();
            clientesDados[i][8] = c.isClienteOuro();
            i++;
        }

        return clientesDados;
    }

    public Object[][] relatorioClientesOuro() {
        ArrayList<Cliente> clientes = LojaDepartamento.getClientesOuro();

        Object[][] clientesDados = new Object[clientes.size()][9];

        Iterator<Cliente> iterator = clientes.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Cliente c = iterator.next();
            
            Calendar dataNascimento = c.getDataNascimento();

            clientesDados[i][0] = c.getCodigoUsuario();
            clientesDados[i][1] = c.getNome();
            clientesDados[i][2] = c.getCpf();
            clientesDados[i][3] = c.getRg();
            clientesDados[i][4] = (dataNascimento.get(Calendar.DATE)+
                    "/"+(dataNascimento.get(Calendar.MONTH)+1)+
                    "/"+dataNascimento.get(Calendar.YEAR));
            clientesDados[i][5] = c.getEndereco();
            clientesDados[i][6] = c.getCep();
            clientesDados[i][7] = c.getEmail();
            clientesDados[i][8] = c.isClienteOuro();
            i++;
        }

        return clientesDados;
    }

    public Vendedor getVendedorByCodigo(int codigo) {
        ArrayList<Vendedor> vendedores = LojaDepartamento.getVendedores();

        Iterator<Vendedor> iterator = vendedores.iterator();

        while (iterator.hasNext()) {
            Vendedor vendedor = iterator.next();
            if (vendedor.getCodigoUsuario() == codigo) {
                return vendedor;
            }
        }

        return null;
    }

    public Object[][] relatorioVendedorMes(int mes) {
        int[] vendasPorVendedor = new int[LojaDepartamento.getTamanhoUsuarios()];
        ArrayList<Venda> vendas = LojaDepartamento.getVendas();

        Iterator<Venda> iteratorVendas = vendas.iterator();

        while (iteratorVendas.hasNext()) {
            Venda venda = iteratorVendas.next();
            
            if ((venda.getDataVenda().get(Calendar.MONTH)+1) == mes) {
                vendasPorVendedor[venda.getVendedor().getCodigoUsuario()] += 1;
            }
        }

        int maioresVendas = vendasPorVendedor[0];

        for (int i = 1; i < vendasPorVendedor.length; i++) {
            if (vendasPorVendedor[i] > maioresVendas) {
                maioresVendas = vendasPorVendedor[i];
            }
        }

        ArrayList<VendedorMes> vendedoresMes = new ArrayList<>();

        if (maioresVendas > 0) {
            for (int i = 1; i < vendasPorVendedor.length; i++) {
                if (vendasPorVendedor[i] == maioresVendas) {
                    Vendedor vendedor = getVendedorByCodigo(i);
                    VendedorMes vendedorMes = new VendedorMes(vendedor, maioresVendas);
                    if (vendedor != null) {
                        vendedoresMes.add(vendedorMes);
                    }
                }
            }
        }

        Object[][] vendedoresMesDados = new Object[vendedoresMes.size()][12];
        Iterator<VendedorMes> iteratorVendedoresMes = vendedoresMes.iterator();

        int i = 0;
        while (iteratorVendedoresMes.hasNext()) {
            VendedorMes vendedotMesNext = iteratorVendedoresMes.next();
            Vendedor v = vendedotMesNext.getVendedor();
            
            Calendar dataNascimento = v.getDataNascimento();
            Calendar dataAdmissao = v.getDataAdmissao();

            vendedoresMesDados[i][0] = v.getCodigoUsuario();
            vendedoresMesDados[i][1] = v.getNome();
            vendedoresMesDados[i][2] = v.getCpf();
            vendedoresMesDados[i][3] = v.getRg();
            vendedoresMesDados[i][4] = (dataNascimento.get(Calendar.DATE)+
                    "/"+(dataNascimento.get(Calendar.MONTH)+1)+
                    "/"+dataNascimento.get(Calendar.YEAR));
            vendedoresMesDados[i][5] = v.getEndereco();
            vendedoresMesDados[i][6] = v.getCep();
            vendedoresMesDados[i][7] = v.getEmail();
            vendedoresMesDados[i][8] = String.format("%.2f", v.getSalario());
            vendedoresMesDados[i][9] = v.getPis();
            vendedoresMesDados[i][10] = (dataAdmissao.get(Calendar.DATE)+
                    "/"+(dataAdmissao.get(Calendar.MONTH)+1)+
                    "/"+dataAdmissao.get(Calendar.YEAR));
            vendedoresMesDados[i][11] = vendedotMesNext.getQuantidadeVendas();
            i++;
        }

        return vendedoresMesDados;
    }
}
