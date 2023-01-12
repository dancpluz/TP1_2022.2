package questionario3;

import java.util.Scanner;

class Frase {
    private String frase;

    public Frase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    public int contarVogais() {
        String check = "aeiouáéíóúâêôãõ";
        int cont = 0;
        frase = frase.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++) {
            if (check.indexOf(frase.charAt(i)) != -1) {
                cont++;
            }
        }
        return cont;
    }
    public int contarPalavras() {
        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}

public class Questao1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Frase frase1 = new Frase(entrada.nextLine());
        Frase frase2 = new Frase(entrada.nextLine());
        
        System.out.println(frase1.contarPalavras());
        System.out.println(frase2.contarVogais());
    }
}
