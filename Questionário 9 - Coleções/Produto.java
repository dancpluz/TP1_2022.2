/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario9;

/**
 *
 * @author Daniel
 */
public class Produto implements Classificavel {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public boolean menorElemento(Classificavel obj) {
        Produto compara = (Produto) obj;
        
        return this.codigo < compara.codigo;
    }

    @Override
    public String toString() {
        return codigo + " " + nome + " " + preco;
    }
    
    
}
