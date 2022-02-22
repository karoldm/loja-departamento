package model;

/**
 *
 * @author karol
 */
public class CartaoCredito extends Pagamento {

    private String nome;
    private String bandeira;
    private String numero;

    public CartaoCredito() {
        super("Cartão de Crédito");
    }

    public CartaoCredito(String nome, String bandeira, String numero) {
        super("Cartão de Crédito");
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return ("Tipo de Pagamento: " + super.getTipoPagamento());
    }
}
