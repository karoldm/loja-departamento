package controller;

import factory.FactoryProduto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import model.Alimentacao;
import model.Eletrodomestico;
import model.Eletronico;
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

    public ArrayList<Fornecedor> getFornecedores() {
        return LojaDepartamento.getFornecedores();
    }

    public Fornecedor getFornecedorByNome(String nome) {
        for (Fornecedor f : LojaDepartamento.getFornecedores()) {
            if (f.getNome().equals(nome)) {
                return f;
            }
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
            boolean disponivel) {

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

    public int getTamanhoProdutos() {
        return LojaDepartamento.getTamanhoProdutos();
    }

    public int getTamanhoFornecedores() {
        return LojaDepartamento.getTamanhoFornecedores();
    }

    public Produto getProdutoByCodigo(int codigo) {
        for (Produto p : LojaDepartamento.getProdutos()) {
            if (p.getCodigoProduto() == codigo) {
                return p;
            }
        }
        return null;
    }

    public Object[][] relatorioProdutosCadastrados() {
        ArrayList<Produto> produtos = LojaDepartamento.getProdutos();

        Object[][] produtosDados = new Object[produtos.size()][7];

        Iterator<Produto> iterator = produtos.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            produtosDados[i][0] = p.getCodigoProduto();
            produtosDados[i][1] = p.getNome();
            produtosDados[i][2] = p.getDescricao();
            produtosDados[i][3] = p.getDataFabricacao().getTime();
            produtosDados[i][4] = p.getValor();
            produtosDados[i][5] = p.getFornecedor().getNome();
            produtosDados[i][6] = p.isDisponivel();
            i++;
        }

        return produtosDados;
    }

    public Object[][] relatorioProdutosAlimenticios() {
        ArrayList<Alimentacao> produtos = LojaDepartamento.getProdutosAlimenticios();

        Object[][] produtosDados = new Object[produtos.size()][7];

        Iterator<Alimentacao> iterator = produtos.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            
            produtosDados[i][0] = p.getCodigoProduto();
            produtosDados[i][1] = p.getNome();
            produtosDados[i][2] = p.getDescricao();
            produtosDados[i][3] = p.getDataFabricacao().getTime();
            produtosDados[i][4] = p.getValor();
            produtosDados[i][5] = p.getFornecedor().getNome();
            produtosDados[i][6] = p.isDisponivel();
            i++;
        }

        return produtosDados;
    }
    
    public Object[][] relatorioProdutosEletrodomesticos() {
        ArrayList<Eletrodomestico> produtos = LojaDepartamento.getProdutosEletrodomesticos();

        Object[][] produtosDados = new Object[produtos.size()][7];

        Iterator<Eletrodomestico> iterator = produtos.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            
            produtosDados[i][0] = p.getCodigoProduto();
            produtosDados[i][1] = p.getNome();
            produtosDados[i][2] = p.getDescricao();
            produtosDados[i][3] = p.getDataFabricacao().getTime();
            produtosDados[i][4] = p.getValor();
            produtosDados[i][5] = p.getFornecedor().getNome();
            produtosDados[i][6] = p.isDisponivel();
            i++;
        }

        return produtosDados;
    }
    
    public Object[][] relatorioProdutosEletronicos() {
        ArrayList<Eletronico> produtos = LojaDepartamento.getProdutosEletronicos();

        Object[][] produtosDados = new Object[produtos.size()][7];

        Iterator<Eletronico> iterator = produtos.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            
            produtosDados[i][0] = p.getCodigoProduto();
            produtosDados[i][1] = p.getNome();
            produtosDados[i][2] = p.getDescricao();
            produtosDados[i][3] = p.getDataFabricacao().getTime();
            produtosDados[i][4] = p.getValor();
            produtosDados[i][5] = p.getFornecedor().getNome();
            produtosDados[i][6] = p.isDisponivel();
            i++;
        }

        return produtosDados;
    }
}
