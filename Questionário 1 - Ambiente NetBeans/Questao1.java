/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionario1;
import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        float altura, peso_ideal;
        char sexo;
        
        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextFloat();
        sexo = entrada.next().charAt(0);
        
        if (altura >= 0) {
            switch (sexo){
                case 'm':
                    peso_ideal = (72.7f * altura) - 58f;
                    System.out.printf("%.1f kg",peso_ideal);
                    break;
                case 'f':
                    peso_ideal =(62.1f * altura) - 44.7f;
                    System.out.printf("%.1f kg",peso_ideal);
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        }
        else{
                System.out.println("Entrada inválida!");
                }
    }
}
