package com.example;

public class ContaBancaria 
{
    private Pessoa titular;
    private double saldo;

    public ContaBancaria(String nome, String sobrenome, String cpf) 
    {
        this.titular = new Pessoa(nome, sobrenome, cpf);
        this.saldo = 0.0;
    }

    public void consultarSaldo() 
    {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void depositar(double valor) 
    {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) 
    {
        if (valor <= saldo) 
        {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
        } 
        else 
        {
            System.out.println("Saldo insuficiente.");
        }
    }

}
