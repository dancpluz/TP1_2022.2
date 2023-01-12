/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionario2;

import java.util.Scanner;

class Circulo {
    private int x,y,raio;
    public static final double PI = 3.14159;
    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getRaio(){
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
    public double circunferencia() {
        return 2 * PI * raio;
    }
}

public class Questao5 {
    public static void main(String[] args) {
        
        int x, y, raio;
        Circulo circulo1, circulo2, circulo3;
        Circulo copia1, copia2, copia3;
        
        Scanner entrada = new Scanner(System.in);
        
        x = entrada.nextInt();
        y = entrada.nextInt();
        raio = entrada.nextInt();

        circulo1 = new Circulo(x,y,raio);
        copia1 = new Circulo(x,y,raio);
            
        x = entrada.nextInt();
        y = entrada.nextInt();
        raio = entrada.nextInt();

        circulo2 = new Circulo(x,y,raio);
        copia2 = new Circulo(x,y,raio);
                
        x = entrada.nextInt();
        y = entrada.nextInt();
        raio = entrada.nextInt();

        circulo3 = new Circulo(x,y,raio);
        copia3 = new Circulo(x,y,raio);
                
        Circulo[] vetor1 = {circulo1, circulo2, circulo3};        
        Circulo[] vetor2 = vetor1;
        
        Circulo[] vetor3 = {copia1, copia2, copia3}; 
        
        
        for (int i = 0; i < 3; i++) {
            raio = entrada.nextInt();
            vetor1[i].setRaio(raio);
        }
        
        Circulo[][] vetores = {vetor1, vetor2, vetor3};
        for (int i = 0; i < 3; i++) {
            System.out.printf("vetor%s:\n",i+1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s %s %s\n",vetores[i][j].getX(),vetores[i][j].getY(),vetores[i][j].getRaio());
            }
        }
    }
}