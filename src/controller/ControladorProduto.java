package controller;

import factory.FactoryProduto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import model.Alimentacao;
import model.Eletrodomestico;
import model.Eletronico;
import model.Fornecedor;
import model.ItemVenda;
import model.LojaDepartamento;
import model.Produto;
import model.Venda;
import model.Vestuario;

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

    public Object[][] relatorioProdutosVestuario() {
        ArrayList<Vestuario> produtos = LojaDepartamento.getProdutosVestuario();

        Object[][] produtosDados = new Object[produtos.size()][7];

        Iterator<Vestuario> iterator = produtos.iterator();

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

    public Object[][] getDezProdutosMaisVendidos() {
        int quantidadeProdutos = LojaDepartamento.getTamanhoProdutos();

        ArrayList<Venda> vendas = LojaDepartamento.getVendas();

        Object[][] dados = new Object[10][7];

        /*
        cada posição do array representa o código de um produto, então na posição
        zero temos a quantidade de vezes que o produto com código zero foi vendido
         */
        int[] quantidadeVendasPorProduto = new int[quantidadeProdutos];

        Iterator<Venda> iteratorVendas = vendas.iterator();

        while (iteratorVendas.hasNext()) {
            Venda v = iteratorVendas.next();

            Iterator<ItemVenda> iteratorItensDaVenda = v.getItensVenda().iterator();

            /*
            para cada item vendido incrementamos quantidadeVendasPorProduto na
            posição que representa o produto segundo a quantidade daquele item
            que foi vendido
             */
            while (iteratorItensDaVenda.hasNext()) {
                ItemVenda item = iteratorItensDaVenda.next();
                Produto p = item.getProduto();
                quantidadeVendasPorProduto[p.getCodigoProduto()] += item.getQuantidade();
            }
        }

        /*
        Ao final do loop temos o array quantidadeVendasPorProduto armazenado a 
        quantidade de vendas realizadas para cada produto, portanto basta achar 
        as posições (que representam o código do produto) dos dez maiores valores 
        do array.
         */
        int maior, indiceMaior;

        for (int i = 0; i < 10; i++) {
            
            maior = quantidadeVendasPorProduto[0];
            indiceMaior = 0;
            
            /*
            procurando o maior valor do array, ou seja, a posição que possui
            o maior número de vendas
            */
            for (int j = 1; j < quantidadeProdutos; j++) {
                if (quantidadeVendasPorProduto[j] > maior) {
                    maior = quantidadeVendasPorProduto[j];
                    indiceMaior = j;
                }
            }

            //"removendo" produto encontrado da lista
            quantidadeVendasPorProduto[indiceMaior] = 0;
            
            Produto p = getProdutoByCodigo(indiceMaior);

            dados[i][0] = p.getCodigoProduto();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getDescricao();
            dados[i][3] = p.getDataFabricacao().getTime();
            dados[i][4] = p.getValor();
            dados[i][5] = p.getFornecedor().getNome();
            dados[i][6] = p.isDisponivel();
            
        }

        return dados;

    }
    
    public Object[][] relatorioFornecedoresCadastrados(){
        ArrayList<Fornecedor> fornecedores = LojaDepartamento.getFornecedores();

        Object[][] fornecedoresDados = new Object[fornecedores.size()][7];

        Iterator<Fornecedor> iterator = fornecedores.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Fornecedor f = iterator.next();

            fornecedoresDados[i][0] = f.getCodigoFornecedor();
            fornecedoresDados[i][1] = f.getCnpj();
            fornecedoresDados[i][2] = f.getNome();
            fornecedoresDados[i][3] = f.getDescricao();
            fornecedoresDados[i][4] = f.getEmail();
            fornecedoresDados[i][5] = f.getTelefone();
            fornecedoresDados[i][6] = f.getEndereco();
            i++;
        }

        return fornecedoresDados;
    }
}
