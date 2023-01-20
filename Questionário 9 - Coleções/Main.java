/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionario9;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int numProduto = ent.nextInt();
        int numCliente = ent.nextInt();
        int numServico = ent.nextInt();        
        
        Produto produtos[] = new Produto[numProduto];
        Cliente clientes[] = new Cliente[numCliente];
        Servico servicos[] = new Servico[numServico];
        
        for (int i = 0; i < numProduto; i++) {
            int codigo = ent.nextInt();
            String nome = ent.next();
            double preco = Double.parseDouble(ent.next());
            
            Produto produto = new Produto(codigo,nome,preco);
            produtos[i] = produto;
        }
        
        for (int i = 0; i < numCliente; i++) {
            String cpf = ent.next();
            String nome = ent.next();
            String endereco = ent.next();
            
            Cliente cliente = new Cliente(cpf,nome,endereco);
            clientes[i] = cliente;
        }
        
        for (int i = 0; i < numServico; i++) {
            String tipo = ent.next();
            double preco = Double.parseDouble(ent.next());
            String data = ent.next();
            
            Servico servico = new Servico(tipo,data,preco);
            servicos[i] = servico;
        }
        
        Classificador clas = new Classificador();
        clas.ordena(produtos);
        clas.ordena(clientes);
        clas.ordena(servicos);
        
        for (int i = 0; i < numProduto; i++){
            System.out.println(produtos[i]);
        }
        
        for (int i = 0; i < numCliente; i++){
            System.out.println(clientes[i]);
        }
        
        for (int i = 0; i < numServico; i++){
            System.out.println(servicos[i]);
        }
    }
}
