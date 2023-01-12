/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario1;

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        float consumo, custo, total;
        float taxa = 5;
        
        Scanner entrada = new Scanner(System.in);
        consumo = entrada.nextFloat();
        
        if (consumo <= 500) {
            custo = consumo * 0.02f;
        }
        else{
            if (consumo <= 1000) {
                custo = (consumo - 500) * 0.05f + 50f;
            }
            else{
                custo = (consumo - 1000) * 0.1f + 350f;
            }
        }
        total = custo + taxa;
        System.out.printf("%.2f %.2f %.2f",custo,taxa,total);
    }
}
