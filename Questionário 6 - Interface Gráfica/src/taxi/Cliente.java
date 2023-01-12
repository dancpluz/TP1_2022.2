/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxi;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome, telefone, RG, CPF;
    private ArrayList<Chamado> chamados;

    public Cliente() {
        this.chamados = new ArrayList();
    }

    public Cliente(int id, String nome, String telefone, String RG, String CPF) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.RG = RG;
        this.CPF = CPF;
        this.chamados = new ArrayList();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ArrayList<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(ArrayList<Chamado> chamados) {
        this.chamados = chamados;
    }
    
    public void criarChamado(Chamado cha) {
        this.chamados.add(cha);
    }

}