package questionario3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.nextLine();
        Map<String, String> siglas = new HashMap<>();
        
        
        for (int i = 0;i < n;i++) {
            String[] s = entrada.nextLine().split(" ");
            siglas.put(s[0],s[1]);
        }
        
        String[] input = entrada.nextLine().split(" ");
        String result = new String();
        
        for (int i = 0; i < input.length; i++) {
            if (siglas.get(input[i].toLowerCase()) != null) {
                result = result + siglas.get(input[i].toLowerCase()) + " ";
            } else {
                result = result + input[i] + " ";
            }
        }
        System.out.println(result);
    }    
}
    
