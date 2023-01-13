/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario8;

/**
 *
 * @author Daniel
 */
public class Amigos extends Contato {
    private int grau;
    
    public Amigos(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        System.out.println(imprimirBasico());
        switch (grau) {
            case 1:
                System.out.println("Grau: Amigo");
                break;
            case 2:
                System.out.println("Grau: Melhor amigo");
                break;
            case 3:
                System.out.println("Grau: Conhecido");
                break;
        }
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }  
    
}
