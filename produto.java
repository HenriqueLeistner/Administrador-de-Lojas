package Desafio;

public class produto {
    private String nome;
    private double preco;
    private data dataDeValidade;

    public produto(String nome, double preco, data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public data getdataDeValidade() {
        return dataDeValidade;
    }

    public void setDatadeValidade(data data) {
        this.dataDeValidade = data;
    }

    public boolean estaVencido(data dataAtual) {
        return dataDeValidade == (dataAtual);
    }

    

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPreço: " + preco + "\nData de Validade: " + dataDeValidade;
    }
}
