/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionario1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        float m_valor = 0, h_valor = 0, total_valor = 0;
        int m_num = 0, h_num = 0;
        char sexo;
              
        Scanner entrada = new Scanner(System.in);
        sexo = entrada.next().charAt(0);
        
        while (sexo != 'q'){
            switch (sexo){
                case 'm':
                    m_num = m_num + 1;
                    m_valor = m_valor + 7.40f;
                    break;
                case 'h':
                    h_num = h_num + 1;
                    h_valor = h_valor + 12.50f;
                    break;
                default:
                    
            }
        sexo = entrada.next().charAt(0);
        }
        total_valor = m_valor + h_valor;
        System.out.printf("%s %s\n",h_num,m_num);
        System.out.printf("%.2f %.2f %.2f",h_valor,m_valor,total_valor);
    }
}
