package questionario3;

import java.util.Scanner;

class Criptografia {
    private String frase;

    public Criptografia(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    public String criptografarFrase() {
        char check[] = {'A','E','I','O','U','Á','É','Í','Ó','Ú','Â','Ê','Ô','Ã','Õ','a','e','i','o','u','á','é','í','ó','ú','â','ê','ô','ã','õ'} ;
        
        for (int i = 0; i < check.length; i++) {
            frase = frase.replace(check[i], '*');
        }
        return frase;
    }
}

public class Questao2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Criptografia frase1 = new Criptografia(entrada.nextLine());
        Criptografia frase2 = new Criptografia(entrada.nextLine());
        
        frase1.setFrase(entrada.nextLine());
        
        System.out.println(frase2.getFrase());
        System.out.println(frase1.criptografarFrase());
        
    }
}
        