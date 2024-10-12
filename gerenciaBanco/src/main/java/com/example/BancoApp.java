package com.example;
import java.util.Scanner;


public class BancoApp 
{
    private Scanner scanner = new Scanner(System.in);
    private ContaBancaria conta;

    public void run()
    {
        System.out.println("Bem-vindo ao Gerenciador de Bancario!");
        criarConta();
        exibirMenu();
    }

    private void criarConta()
    {
        System.out.printf("Informe seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.printf("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Informe seu CPF: ");
        String cpf = scanner.nextLine();
        conta = new ContaBancaria(nome, sobrenome, cpf);

    }

    private void exibirMenu() 
    {
        int opcao;
        do 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Saque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Consumir a nova linha
            scanner.nextLine(); 

            switch (opcao)
            {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarSaque();
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Gerenciador de Banco. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void realizarDeposito() 
    {
        System.out.print("Informe o valor do depósito: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
    }

    private void realizarSaque() 
    {
        System.out.print("Informe o valor do saque: ");
        double valor = scanner.nextDouble();
        conta.sacar(valor);
    }
}