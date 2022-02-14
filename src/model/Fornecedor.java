
package model;

/**
 *
 * @author karol
 */
public class Fornecedor {
    private int codigoFornecedor;
    private String cnpj;
    private String nome;
    private String descricao;
    private String email;
    private String telefone;
    private String endereco;

    public Fornecedor(
            int codigoFornecedor, 
            String cnpj, 
            String nome, 
            String descricao, 
            String email, 
            String telefone, 
            String endereco) {
        this.codigoFornecedor = codigoFornecedor;
        this.cnpj = cnpj;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return(
           "\nCódigo: " + codigoFornecedor +
           "\nCNPJ: " + cnpj +
           "\nNome: " + nome +
           "\nDescrição: " + descricao +
           "\nEmail: " + email +
           "\nTelefone: " + telefone +
           "\nEndereço: " + endereco
        );
    }
}
