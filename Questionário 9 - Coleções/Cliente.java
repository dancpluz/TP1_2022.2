/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario9;

/**
 *
 * @author Daniel
 */
public class Cliente implements Classificavel {
    public String cpf, nome, endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        Cliente compara = (Cliente) obj;
        
        return this.nome.compareTo(compara.nome) < 0;
    }

    @Override
    public String toString() {
        return cpf + " " + nome + " " + endereco;
    }
    
    
}
