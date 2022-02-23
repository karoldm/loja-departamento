
package model;

import java.util.ArrayList;
import java.util.Iterator;
import loja.Configuracao;
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
        vendas = Serializacao.read(configuracao.getArquivoVendas());
        return vendas;
    }

    public static ArrayList<Produto> getProdutos() {
        produtos = Serializacao.read(configuracao.getArquivoProdutos());
        return produtos;
    }

    public static ArrayList<Fornecedor> getFornecedores() {
        fornecedores = Serializacao.read(configuracao.getArquivoFornecedores());
        return fornecedores;
    }

    public static ArrayList<Usuario> getUsuarios() {
        usuarios = Serializacao.read(configuracao.getArquivoUsuarios());
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
    
    public static void addFornecedor(Fornecedor fornecedor){
        fornecedores = Serializacao.read(configuracao.getArquivoFornecedores());
        fornecedores.add(fornecedor);
        Serializacao.write(fornecedores, configuracao.getArquivoFornecedores());
    }
    
    public static int getTamanhoFornecedores(){
        return Serializacao.read(configuracao.getArquivoFornecedores()).size();
    }
    
    public static void addProduto(Produto produto){
        produtos = Serializacao.read(configuracao.getArquivoProdutos());
        produtos.add(produto);
        Serializacao.write(produtos, configuracao.getArquivoProdutos());
    }
    
    public static int getTamanhoProdutos(){
        return Serializacao.read(configuracao.getArquivoProdutos()).size();
    }
    
    public static void addVenda(Venda venda){
        vendas = Serializacao.read(configuracao.getArquivoVendas());
        vendas.add(venda);
        Serializacao.write(vendas, configuracao.getArquivoVendas());
    }
    
    public static int getTamanhoVendas(){
        return Serializacao.read(configuracao.getArquivoVendas()).size();
    }
    
    public static ArrayList<Alimentacao> getProdutosAlimenticios(){
        ArrayList<Alimentacao> produtosAlimenticios = new ArrayList<>();
        
        produtos = getProdutos();
        
        Iterator<Produto> iterator = produtos.iterator();
        
        while(iterator.hasNext()){
            Produto p = iterator.next();
            
            if(p instanceof Alimentacao){
                produtosAlimenticios.add((Alimentacao)p);
            }
        }
        
        return produtosAlimenticios;
    }
    
     public static ArrayList<Eletrodomestico> getProdutosEletrodomesticos(){
        ArrayList<Eletrodomestico> produtosEletrodomesticos = new ArrayList<>();
        
        produtos = getProdutos();
        
        Iterator<Produto> iterator = produtos.iterator();
        
        while(iterator.hasNext()){
            Produto p = iterator.next();
            
            if(p instanceof Eletrodomestico){
                produtosEletrodomesticos.add((Eletrodomestico)p);
            }
        }
        
        return produtosEletrodomesticos;
    }
     
     public static ArrayList<Eletronico> getProdutosEletronicos(){
        ArrayList<Eletronico> produtosEletronicos = new ArrayList<>();
        
        produtos = getProdutos();
        
        Iterator<Produto> iterator = produtos.iterator();
        
        while(iterator.hasNext()){
            Produto p = iterator.next();
            
            if(p instanceof Eletronico){
                produtosEletronicos.add((Eletronico)p);
            }
        }
        
        return produtosEletronicos;
    }
     
     public static ArrayList<Vestuario> getProdutosVestuario(){
        ArrayList<Vestuario> produtosVestuario = new ArrayList<>();
        
        produtos = getProdutos();
        
        Iterator<Produto> iterator = produtos.iterator();
        
        while(iterator.hasNext()){
            Produto p = iterator.next();
            
            if(p instanceof Vestuario){
                produtosVestuario.add((Vestuario)p);
            }
        }
        
        return produtosVestuario;
    }
}
