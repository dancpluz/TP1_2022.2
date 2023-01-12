
package questionario3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int quant = entrada.nextInt();
        String[] palavras = new String[quant];
        
        for (int i = 0;i < quant;i++) {
            palavras[i] = entrada.next();
        }
        
        String input = entrada.next();
        boolean fim = false;
        
        for (String palavra : palavras) {
            if (palavra.equals(input)) {
                System.out.println("palavra correta");
                fim = true;
                break;
            }
        }
        if (!fim) System.out.println("palavra incorreta");
        
        for (int i = 0; i < input.length()-1; i++) {
            StringBuilder sbb = new StringBuilder(input);
            sbb.setCharAt(i,input.charAt(i+1));
            sbb.setCharAt(i+1,input.charAt(i));

            for (String palavra : palavras) {
                if (palavra.equals(sbb.toString())) {
                    System.out.println(sbb.toString() + "?");
                    fim = true;
                    break;
                }
            }
        }
        
        if (!fim) System.out.println("nenhuma sugestão");
    }
}