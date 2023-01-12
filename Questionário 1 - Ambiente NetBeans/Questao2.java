package questionario1;

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        int tipo, area;
        float iptu;
        
        Scanner entrada = new Scanner(System.in);
        tipo = entrada.nextInt();
        area = entrada.nextInt();
        
        if (area <= 0){
            System.out.println("Entrada inválida!");
        }
        else if (tipo == 1){
            if (area < 200){
                iptu = area * 1.0f;
            }
            else {
                iptu = area * 1.2f;
            }
            System.out.printf("%.2f",iptu);
        }
        else if (tipo == 2){
            if (area < 200){
                iptu = area * 1.1f;
            }
            else {
                iptu = area * 1.3f;
            }
            System.out.printf("%.2f",iptu);
        }
        else{
            System.out.println("Entrada inválida!");
        }
    }
}
