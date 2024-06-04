package Desafio;

import java.util.Arrays;

public class shopping {
    private String nome;
    private endereco endereco;
    private loja[] lojas;

    public shopping(String nome, endereco endereco, int quantMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new loja[quantMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco){
        this.endereco = endereco;
    }

    public loja[] getLojas() {
        return lojas;
    }

    public void setLojas(loja[] lojas) {
        if (lojas.length <= this.lojas.length) {
            this.lojas = lojas;
        } else {
            System.out.println ("Erro: O tamanho do array fornecido excede a capacidade do shopping.");
        }
    }

    public boolean insereLoja(loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }



    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && nomeLoja != null && nomeLoja.equals(lojas[i].getNome())) {
                lojas[i] = null;
                return true;
            }
        }
        return false;  // Retorna falso se a loja não for encontrada
    }

    public int quantLojasPorTipo(String tipo) {
        int count = 0;
        for (loja loja : lojas) {
            if (loja != null && tipo != null && tipo.equals(loja.getTipo())) {
                count++;
            }
        }
        return count > 0 ? count : -1;  // Retorna -1 se não houver lojas do tipo especificado
    }

    public informatica lojaSeguroMaisCaro() {
        informatica lojaMaisCaro = null;
        double maiorValorSeguro = 0;
        for (loja loja : lojas) {
            if (loja instanceof informatica) {
                informatica lojaInformatica = (informatica) loja;
                if (lojaInformatica.getseguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = lojaInformatica.getseguroEletronicos();
                    lojaMaisCaro = lojaInformatica;
                }
            }
        }
        return lojaMaisCaro;
    }

    public loja lojaseguroMaisCaro() {
        loja lojaMaisCaro = null;
        double maiorValorSeguro = 0;
        for (loja loja : lojas) {
            if (loja != null && "Informática".equals(loja.getTipo())) {
                if (loja.getvalorSeguro() > maiorValorSeguro) {
                    maiorValorSeguro = loja.getvalorSeguro();
                    lojaMaisCaro = loja;
                }
            }
        }
        return lojaMaisCaro;
    }

    @Override
    public String toString() {
        return "Shopping{" + "nome='" + nome + '\'' + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + '}';
    }


    public static void main(String[] args) {
        endereco enderecoShopping = new endereco(null, null, null, null, null, null, null);
        shopping meuShopping = new shopping("Shopping Exemplo", enderecoShopping, 5);

        loja loja1 = new loja(null, 0, 0, enderecoShopping, null, 0);
        loja1.setNome("Loja A");
        loja1.setTipo("Cosmético");

        loja loja2 = new loja(null, 0, 0, enderecoShopping, null, 0);
        loja2.setNome("Loja B");
        loja2.setTipo("Informática");
        loja2.setvalorSeguro(5000.0);

        loja loja3 = new loja(null, 0, 0, enderecoShopping, null, 0);
        loja3.setNome("Loja C");
        loja3.setTipo("Informática");
        loja3.setvalorSeguro(8000.0);

        meuShopping.insereLoja(loja1);
        meuShopping.insereLoja(loja2);
        meuShopping.insereLoja(loja3);

        System.out.println(meuShopping);

        meuShopping.removeLoja("Loja A");
        System.out.println("Após remover Loja A:");
        System.out.println(meuShopping);

        int quantidadeInformatica = meuShopping.quantLojasPorTipo("Informática");
        System.out.println("Quantidade de lojas de Informática: " + quantidadeInformatica);

        loja lojaMaisCaro = meuShopping.lojaSeguroMaisCaro();
        System.out.println("Loja de Informática com o seguro mais caro: " + lojaMaisCaro);
    }




}
