package controller;

import factory.FactoryProduto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import model.Fornecedor;
import model.LojaDepartamento;
import model.Produto;

/**
 *
 * @author karol
 */
public class ControladorProduto {

    public ControladorProduto() {
    }

    public void addFornecedor(
            int codigo,
            String cnpj,
            String nome,
            String descricao,
            String email,
            String telefone,
            String endereco) {

        Fornecedor fornecedor = new Fornecedor(
                codigo,
                cnpj,
                nome,
                descricao,
                email,
                telefone,
                endereco);
        
        LojaDepartamento.addFornecedor(fornecedor);
    }
    
    public ArrayList<Fornecedor> getFornecedores(){
        return LojaDepartamento.getFornecedores();
    }
    
    public Fornecedor getFornecedorByNome(String nome){
        for(Fornecedor f: LojaDepartamento.getFornecedores()){
            if(f.getNome().equals(nome)) return f;
        }
        return null;
    }
    
    public void addProduto(
                int codigo,
                String nome,
                String descricao,
                String dia,
                String mes,
                String ano,
                float valor,
                String nomeFornecedor,
                String tipoProduto,
                boolean disponivel){
        
        Fornecedor fornecedor = getFornecedorByNome(nomeFornecedor);
        Calendar dataFabricacao = Calendar.getInstance();
        dataFabricacao.set(
                Integer.parseInt(ano),
                Integer.parseInt(mes), 
                Integer.parseInt(dia));
        
        Produto produto = FactoryProduto.factoryMethod(
                tipoProduto, 
                codigo, 
                nome, 
                descricao, 
                dataFabricacao, 
                valor, 
                fornecedor, 
                disponivel);
        
        LojaDepartamento.addProduto(produto);
        
    }
    
    public int getTamanhoProdutos(){
        return LojaDepartamento.getTamanhoProdutos();
    }
    
    public int getTamanhoFornecedores(){
        return LojaDepartamento.getTamanhoFornecedores();
    }
    
    public Produto getProdutoByCodigo(int codigo){
        for(Produto p: LojaDepartamento.getProdutos()){
            if(p.getCodigoProduto() == codigo) return p;
        }
        return null;
    }
    
    public Object[][] relatorioProdutosCadastrados(){
        ArrayList<Produto> produtos = LojaDepartamento.getProdutos();
        
        Object[][] produtosDados = new Object[7][produtos.size()];
        
        Iterator<Produto> iterator = produtos.iterator();
        
        int i = 0;
        while(iterator.hasNext()){
            Produto p = iterator.next();
            produtosDados[0][i] = p.getCodigoProduto();
            produtosDados[1][i] = p.getNome();
            produtosDados[2][i] = p.getDescricao();
            produtosDados[3][i] = p.getDataFabricacao();
            produtosDados[4][i] = p.getValor();
            produtosDados[5][i] = p.getFornecedor().getNome();
            produtosDados[6][i] = p.isDisponivel();
            i++;
        }
        
        return produtosDados;
    }
}
