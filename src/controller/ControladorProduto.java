package controller;

import model.Fornecedor;
import model.LojaDepartamento;

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
}
