/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario8;

/**
 *
 * @author Daniel
 */
public class ColegasDeTrabalho extends Contato {
    private String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        System.out.println(imprimirBasico());
        System.out.println("Relacionamento de trabalho: " + tipo);  
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
