/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionario2;

import java.util.Scanner;

class Conta {
    private int numeroConta, senha;
    private String nomeCliente;
    private double saldo;

    public Conta(int numeroConta, int senha, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public int getSenha() {
        return senha;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean saque(double valor, int input) {
        if (valor < saldo & valor > 0 & input == senha) {
            saldo = saldo - valor;
            return true;
        } else
            return false;
    }
    public boolean deposito(double valor, int input) {
        if (valor > 0 & input == senha) {
            saldo = saldo + valor;
            return true;
        } else
            return false;
    }
    public boolean transferencia(double valor, int input, Conta conta2) {
        if (valor > 0 & saldo > valor & input == senha) {
            conta2.saldo = conta2.saldo + valor;
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
            
    }
}

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, senha, n;
        String nome;
        double saldo;
        
        numero = entrada.nextInt();
        senha = entrada.nextInt();
        nome = entrada.next();
        saldo = entrada.nextDouble();
        
        Conta conta1 = new Conta(numero,senha,nome,saldo);
        
        numero = entrada.nextInt();
        senha = entrada.nextInt();
        nome = entrada.next();
        saldo = entrada.nextDouble();
        
        Conta conta2 = new Conta(numero,senha,nome,saldo);
        
        boolean fim = false;
        int valor, input;
                
        while (!fim) {
            n = entrada.nextInt();
            switch(n) {
                case 1:
                    input = entrada.nextInt();
                    
                    if (input == conta1.getSenha()) {
                        System.out.printf("%.2f\n",conta1.getSaldo());
                    } else {
                        System.out.println("senha incorreta");
                    }
                    break;
                case 2:
                    valor = entrada.nextInt();
                    input = entrada.nextInt();
                    
                    if (conta1.saque(valor,input)) {
                        System.out.println("saque realizado");
                    } else {
                        System.out.println("saque não realizado");
                    }
                    break;
                case 3:
                    valor = entrada.nextInt();
                    input = entrada.nextInt();
                    
                    if (conta1.deposito(valor,input)) {
                        System.out.println("depósito realizado");
                    } else {
                        System.out.println("depósito não realizado");
                    }
                    break;
                case 4:
                    nome = entrada.next();
                    if (nome.equals(conta2.getNomeCliente())){
                        valor = entrada.nextInt();
                        input = entrada.nextInt();
                        if (conta1.transferencia(valor,input,conta2)) {
                            System.out.println("transferência realizada");
                        } else {
                            System.out.println("transferência não realizada");
                        }
                    } else {
                        System.out.println("nenhum usuário encontrado");
                    } break;
                case 5:
                    fim = true;
                    break;
            }
        } 
    }
}