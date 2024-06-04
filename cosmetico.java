package Desafio;
public class cosmetico extends loja {
    
    private double taxaComercializacao;

    public cosmetico(String nome, int i, int j, endereco endereco, data d1, double taxaComercializacao, int k) {
        super (nome, endereco);
        this.taxaComercializacao = taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public String toString() {
        return super.toString() + ", Taxa de Comercialização: " + taxaComercializacao;
    }

}
