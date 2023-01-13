/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionario8;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoContatos {
    static ArrayList<Contato> contatos = new ArrayList();
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome,apelido,email,aniversario;
        int num = 0,subtipo;
        
        
        while (num != 8) {
            num = entrada.nextInt();
            switch(num) {
                case 1:
                    subtipo = entrada.nextInt();
                    switch(subtipo) {
                        case 1:
                            nome = entrada.next();
                            apelido = entrada.next();
                            email = entrada.next();
                            aniversario = entrada.next();
                            int grau = entrada.nextInt();

                            Amigos amigo = new Amigos(nome,apelido,email,aniversario,grau);
                            contatos.add(amigo);
                            break;
                        case 2:
                            nome = entrada.next();
                            apelido = entrada.next();
                            email = entrada.next();
                            aniversario = entrada.next();
                            String parentesco = entrada.next();

                            Familia familia = new Familia(nome,apelido,email,aniversario,parentesco);
                            contatos.add(familia);
                            break;
                        case 3:
                            nome = entrada.next();
                            apelido = entrada.next();
                            email = entrada.next();
                            aniversario = entrada.next();
                            String tipo = entrada.next();

                            ColegasDeTrabalho colega = new ColegasDeTrabalho(nome,apelido,email,aniversario,tipo);
                            contatos.add(colega);
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0;i < contatos.size(); i++) {
                        contatos.get(i).imprimirContato();
                    }
                    break;
                case 3:
                    for (int i = 0;i < contatos.size();i++) {
                        if (contatos.get(i) instanceof Familia) {
                            contatos.get(i).imprimirContato();
                        }       
                    }
                    break;
                case 4:
                    for (int i = 0;i < contatos.size();i++) {
                        if (contatos.get(i) instanceof Amigos) {
                            contatos.get(i).imprimirContato();
                        }       
                    }
                    break;
                case 5:
                    for (int i = 0;i < contatos.size();i++) {
                        if (contatos.get(i) instanceof ColegasDeTrabalho) {
                            contatos.get(i).imprimirContato();
                        }       
                    }
                    break;
                case 6:
                    for (int i = 0;i < contatos.size();i++) {
                        Contato contato = contatos.get(i);
                        if (contato instanceof Familia familia) {
                            if (familia.getParentesco().equals("irmão")) {
                                contato.imprimirContato();
                            }
                        } else if (contato instanceof Amigos amigo) {
                            if (amigo.getGrau() == 1) {
                                contato.imprimirContato();
                            }
                        } else if (contato instanceof ColegasDeTrabalho colega) {
                            if (colega.getTipo().equals("colega")) {
                                contato.imprimirContato();
                            }
                        }
                    }
                    break;
                case 7:
                    int indice = entrada.nextInt();
                    contatos.get(indice).imprimirContato();
                    break;
            }
        }
    }
}
