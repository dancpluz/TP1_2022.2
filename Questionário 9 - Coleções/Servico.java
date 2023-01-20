/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario9;

/**
 *
 * @author Daniel
 */
public class Servico implements Classificavel {
    private String tipoServico, data;
    private double preco;

    public Servico(String tipoServico, String data, double preco) {
        this.tipoServico = tipoServico;
        this.data = data;
        this.preco = preco;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        Servico compara = (Servico) obj;
        
        return this.preco < compara.preco;
    }

    @Override
    public String toString() {
        return tipoServico + " " + preco + " " + data;
    }
}
