package questionario7;

import java.util.Scanner;

class Veiculo {
    protected String placa;
    protected int numeroPortas;
    protected float preco;

    public Veiculo() {
    }

    public Veiculo(String placa, int numeroPortas, float preco) {
        this.placa = placa;
        this.numeroPortas = numeroPortas;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " Número de portas: " + numeroPortas + " Preço: R$" + preco;
    }
}

class Carro extends Veiculo {
    private String cor;

    public Carro(String placa, int numeroPortas, float preco, String cor) {
        super(placa, numeroPortas, preco);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " Número de portas: " + numeroPortas + " Preço: R$" + preco + " Cor: " + cor;
    }
}

class Moto extends Veiculo{
    private int qtdeCilindradas;

    public Moto() {
    }

    public Moto(String placa, int numeroPortas, float preco, int qtdeCilindradas) {
        super(placa, numeroPortas, preco);
        this.qtdeCilindradas = qtdeCilindradas;
    }

    public int getQtdeCilindradas() {
        return qtdeCilindradas;
    }

    public void setQtdeCilindradas(int qtdeCilindradas) {
        this.qtdeCilindradas = qtdeCilindradas;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " Número de portas: " + numeroPortas + " Preço: R$" + preco + " Quantidade de cilindradas: " + qtdeCilindradas;
    }
}

public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String placa = entrada.next();
        int numPortas = entrada.nextInt();
        float preco = entrada.nextFloat();
        
        Veiculo veiculo = new Veiculo(placa,numPortas,preco);
        System.out.println(veiculo);
        
        placa = entrada.next();
        numPortas = entrada.nextInt();
        preco = entrada.nextFloat();
        String cor = entrada.next();
        
        Carro carro = new Carro(placa,numPortas,preco,cor);
        System.out.println(carro);
        
        placa = entrada.next();
        numPortas = entrada.nextInt();
        preco = entrada.nextFloat();
        int qntCilindradas = entrada.nextInt();
        
        Moto moto = new Moto(placa,numPortas,preco,qntCilindradas);
        System.out.println(moto);
    }
    
}