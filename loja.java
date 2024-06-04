package Desafio;

import java.util.Arrays;

public class loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private endereco endereco;
    private data dataDeFundacao;
    private produto[] estoqueProdutos;
    private String tipo;
    private double valorSeguro;

    public loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, endereco endereco, data dataDeFundacao, int quantMaxProduto) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new produto[quantMaxProduto];
    }

    public loja(String nome2, Desafio.endereco endereco2) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco (endereco endereco) {
        this.endereco = endereco;
    }

    public data getDatadeFundacao () {
        return dataDeFundacao;
    }

    public void setDatadeFundacao (data datadefundacao) {
        this.dataDeFundacao = datadefundacao;
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos (produto[] estoqueProdutos) {
        if (estoqueProdutos.length <= this.estoqueProdutos.length) {
            this.estoqueProdutos = estoqueProdutos;
        } else {
            System.out.println("Erro: o tamanho do array fornecido excede a capacidade do estoque!.");
        }
    }

    public boolean adicionarProduto(produto produto, int posicao) {
        if (posicao >= 0 && posicao < estoqueProdutos.length) {
            if (estoqueProdutos[posicao] == null) {
                estoqueProdutos[posicao] = produto;
                return true;
            } else {
                System.out.println("Erro: A posição já está ocupada.");
            }
        } else {
            System.out.println("Erro: Posição inválida");
        }
        return false;
    }

    public void imprimeProdutos() {
        System.out.println("Produtos na loja:");
        for (produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    public boolean insereProduto(produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nome)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getvalorSeguro() {
        return valorSeguro;
    }

    public void setvalorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }



    public static void main(String[] args) {
        loja minhaLoja = new loja(null, 0, 0, null, null, 0);
        produto produto1 = new produto(null, 0, null);
        produto produto2 = new produto(null, 0, null);

        minhaLoja.insereProduto(produto1);
        minhaLoja.insereProduto(produto2);

        minhaLoja.imprimeProdutos();

        minhaLoja.removeProduto("Produto A");
        minhaLoja.imprimeProdutos();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nQuantidade de Funcionários: " + quantidadeFuncionarios + "\nEndereço: " + endereco + "\nData de Fundação: " + dataDeFundacao + "Estoque de Produtos: " + Arrays.toString(estoqueProdutos) + "Tipo: " + tipo + "Valor do Seguro: " + valorSeguro;
    }
}
