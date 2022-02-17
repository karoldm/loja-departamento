package controller;

import factory.FactoryProduto;
import java.util.ArrayList;
import java.util.Calendar;
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
            if(f.getNome() == nome) return f;
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
}
