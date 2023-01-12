/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario2;

import java.util.Scanner;

class Temperatura {
    private double temperatura, celsius, fahrenheit;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
        this.conversaoCF();
        this.conversaoFC();
    }
    @Override
    public String toString() {
        return "temperatura: " + fahrenheit + " graus fahrenheit\n" + "temperatura: " + celsius + " graus celsius";
    }
    public void conversaoCF() {
        fahrenheit = temperatura * 9.0d / 5.0d + 32;
    }
    public void conversaoFC() {
        celsius = (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temp;
        temp = entrada.nextDouble();
        Temperatura temperatura = new Temperatura(temp);
        System.out.println(temperatura);
    }
}