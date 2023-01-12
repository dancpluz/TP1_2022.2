/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionario2;

import java.util.Scanner;

class Impressora {
    public String modelo,cor,tipoPapel;
    public boolean bluetooth = true;
    public boolean wifi = true;
    public boolean colorida = true;
    public boolean ligada;
    public boolean papel = true;
    public boolean digitalizadora = true;
    public boolean copiadora;
    
    public void ligar() {
        if (ligada == false){
            System.out.println("ligando...");
            ligada = true;
        }
    }
    public void desligar() {
        if (ligada){
            System.out.println("desligando...");
            ligada = false;
        }
    }
    public void imprimir() {
        if (ligada & papel) {
            System.out.println("imprimindo...");
        } else {
            if (ligada) {
                System.out.println("sem papel");
            } else {
                System.out.println("impressora desligada");
            }
        }
    }
    public void digitalizar() {
        if (ligada & digitalizadora) {
            System.out.println("digitalização sendo realizada...");
        } else {
            if (ligada) {
                System.out.println("não é possível digitalizar");
            } else {
                System.out.println("impressora desligada");
            }
        }
    }
    public void copiar() {
        if (ligada & copiadora) {
            System.out.println("cópia sendo realizada...");
        } else {
            if (ligada) {
                System.out.println("não é possível copiar");
            } else {
                System.out.println("impressora desligada");
            }
        }
    }
    public void status() {
        if (bluetooth) {
            System.out.println("bluetooth on");
        } else {
            System.out.println("bluetooth off");
        }
        if (wifi) {
            System.out.println("wifi on");
        } else {
            System.out.println("wifi off");
        }
        if (colorida) {
            System.out.println("impressão colorida");
        } else {
            System.out.println("impressão preto e branco");
        }
        if (ligada) {
            System.out.println("impressora on");
        } else {
            System.out.println("impressora off");
        }
        if (papel) {
            System.out.println("tem papel");
        } else {
            System.out.println("não tem papel");
        }
        if (digitalizadora) {
            System.out.println("digitalizadora on");
        } else {
            System.out.println("digitalizadora off");
        }
        if (copiadora) {
            System.out.println("copiadora on");
        } else {
            System.out.println("copiadora off");
        }
    }
}

public class Questao1 {
    public static void main(String[] args) {
        String temp;
        Impressora impressora = new Impressora();
        Scanner entrada = new Scanner(System.in);
        
        temp = entrada.next();
        impressora.modelo = temp;
        System.out.println(temp);
        temp = entrada.next();
        impressora.cor = temp;
        System.out.println(temp);
        temp = entrada.next();
        impressora.tipoPapel = temp;
        System.out.println(temp);
        impressora.status();
        impressora.ligar();
        impressora.digitalizar();
        impressora.copiar();
        impressora.desligar();
        impressora.imprimir();
    }
}
