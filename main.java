package Desafio;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    criarLoja(scanner);
                    break;
                case 2:
                    criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        scanner.close();
    }

    private static void criarLoja(Scanner scanner) {
        System.out.print("Digite o nome da loja: ");
        String nome = scanner.next();
        System.out.print("Digite a quantidade de funcionários da loja: ");
        int quantidadeFuncionarios = scanner.nextInt();
        System.out.print("Digite o salário base dos funcionários (ou -1 se não tiver): ");
        double salarioBaseFuncionario = scanner.nextDouble();
        endereco endereco = criarEndereco(scanner);
        data dataDeFundacao = criarData(scanner);
        loja loja = new loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeFuncionarios);
        System.out.println("Loja criada com sucesso:\n" + loja);
    }

    private static void criarProduto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        data dataDeValidade = criarData(scanner);
        produto produto = new produto(nome, preco, dataDeValidade);
        System.out.println("Produto criado com sucesso:\n" + produto);
        data dataDeVerificacao = new data(20, 10, 2023);
        if (produto.estaVencido(dataDeVerificacao)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
    }

    private static endereco criarEndereco(Scanner scanner) {
        System.out.print("Digite o nome da rua: ");
        String nomeDaRua = scanner.next();
        System.out.print("Digite a cidade: ");
        String cidade = scanner.next();
        System.out.print("Digite o estado: ");
        String estado = scanner.next();
        System.out.print("Digite o país: ");
        String pais = scanner.next();
        System.out.print("Digite o CEP: ");
        String cep = scanner.next();
        System.out.print("Digite o número: ");
        String numero = scanner.next();
        System.out.print("Digite o complemento: ");
        String complemento = scanner.next();
        return new endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
    }

    private static data criarData(Scanner scanner) {
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        return new data(dia, mes, ano);
    }

    
}
