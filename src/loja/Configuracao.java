
package loja;

/**
 *
 * @author karol
 */
public class Configuracao {
    private String arquivoVendas = "src/serializacao/arquivos/vendas.dat";
    private String arquivoProdutos = "src/serializacao/arquivos/produtos.dat";
    private String arquivoFornecedores = "src/serializacao/arquivos/fornecedores.dat";
    private String arquivoUsuarios = "src/serializacao/arquivos/usuarios.dat";

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public String getArquivoProdutos() {
        return arquivoProdutos;
    }

    public String getArquivoFornecedores() {
        return arquivoFornecedores;
    }

    public String getArquivoUsuarios() {
        return arquivoUsuarios;
    }
}
