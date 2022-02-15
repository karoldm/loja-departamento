
package model;

import java.util.ArrayList;
import loja.Configuracao;
import model.Fornecedor;
import model.Produto;
import model.Usuario;

import model.Venda;
import serializacao.Serializacao;

/**
 *
 * @author karol
 */
public class LojaDepartamento {
    private static String nomeLoja = "Loja Departamento";
    private static ArrayList<Venda> vendas = new ArrayList<>();
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Configuracao configuracao = new Configuracao();


    public static String getNomeLoja() {
        return nomeLoja;
    }

    public static ArrayList<Venda> getVendas() {
        return vendas;
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public static ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static Configuracao getConfiguracao() {
        return configuracao;
    }
    
    public static void addUsuario(Usuario usuario){
        usuarios = Serializacao.read(configuracao.getArquivoUsuarios());
        usuarios.add(usuario);
        Serializacao.write(usuarios, configuracao.getArquivoUsuarios());
    }
    
    public static int getTamanhoUsuarios(){
        return Serializacao.read(configuracao.getArquivoUsuarios()).size();
    }
}
