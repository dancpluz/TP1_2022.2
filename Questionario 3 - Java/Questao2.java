/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionario2;

import java.util.Scanner;

class Retangulo {
    private int comprimento = 1, largura = 1;    
    
    public void setComprimento(int comprimento) {
        if (comprimento < 20 & comprimento > 0) {
            this.comprimento = comprimento;
        }
    }
    public void setLargura(int largura) {
        if (largura < 20 & largura > 0) {
            this.largura = largura;
        }
    }
    public int getComprimento() {
        return comprimento;
    }
    public int getLargura() {
        return largura;
    }
    public int perimetro() {
        int result;
        result = 2 * (comprimento + largura);
        return result;
    }
    public int area() {
        int result;
        result = comprimento * largura;
        return result;
    }
}

public class Questao2 {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        
        retangulo1.setComprimento(entrada.nextInt());
        retangulo1.setLargura(entrada.nextInt());
        retangulo2.setComprimento(entrada.nextInt());
        retangulo2.setLargura(entrada.nextInt());
        
        System.out.printf("%s %s %s %s\n",retangulo1.getComprimento(), retangulo1.getLargura(), retangulo1.perimetro(), retangulo1.area());
        System.out.printf("%s %s %s %s",retangulo2.getComprimento(), retangulo2.getLargura(), retangulo2.perimetro(), retangulo2.area());
    }
 }