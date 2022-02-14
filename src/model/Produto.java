
package model;

import java.util.Calendar;

/**
 *
 * @author karol
 */
public abstract class Produto {
    protected int codigoProduto;
    protected String nome;
    protected String descricao;
    protected Calendar dataFabricacao;
    protected float valor;
    protected Fornecedor fornecedor;
    protected boolean disponivel;

    public Produto(
            int codigoProduto, 
            String nome, 
            String descricao, 
            Calendar dataFabricacao, 
            float valor, 
            Fornecedor fornecedor, 
            boolean disponivel) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataFabricacao = dataFabricacao;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.disponivel = disponivel;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Calendar dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public boolean estaDisponivel(){
        return disponivel;
    }
    
    @Override
    public String toString(){
        return(
            "\nCódigo: " + codigoProduto +
            "\nNome: " + nome +
            "\nDescrição: " + descricao +
            "\nData de Fabricação: " + dataFabricacao +
            "\nValor: " + valor +
            "\nFornecedor: " + fornecedor +
            "\nDisponível: " + (disponivel ? "Sim" : "Não")
        );
    }
    
    public abstract float calcularValor();
}
