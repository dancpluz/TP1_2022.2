package questionario7_2;

import java.util.Scanner;

class Funcionario {
    private String nome, dataNascimento;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

class Chefe extends Funcionario {
    private String departamento;

    public Chefe() {
    }

    public Chefe(String nome, String dataNascimento, float salario, String departamento) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nData de Nascimento: " + getDataNascimento() +
                "\nSalário: R$" + getSalario() + "\nDepartamento: " + getDepartamento() + "\nCargo: chefe";
    }
}

class Vendedor extends Funcionario {
    private float comissaoVenda;
    private int quantidadeVendas;
    
    public Vendedor() {
    }

    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas) {
        super(nome, dataNascimento, salario + comissaoVenda * (float)quantidadeVendas);
        this.comissaoVenda = comissaoVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nData de Nascimento: " + getDataNascimento() +
                "\nSalário: R$" + getSalario() + "\nCargo: vendedor" + "\nComissão por Venda: R$" + getComissaoVenda()
                + "\nNúmero de vendas: " + getQuantidadeVendas();
    }
}

class Operario extends Funcionario {
    private float valorProducao;
    private int quantidadeProduzida;

    public Operario() {
    }

    public Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, valorProducao * (float)quantidadeProduzida);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nData de Nascimento: " + getDataNascimento() +
                "\nSalário: R$" + getSalario() + "\nCargo: Operário" + "\nValor por Produção: R$" + getValorProducao()
                + "\nQuantidade produzida: " + getQuantidadeProduzida();
    }
}

class Horista extends Funcionario {
    private float valorHora;
    private int totalHoras;

    public Horista() {
    }

    public Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
        super(nome, dataNascimento, valorHora * (float)totalHoras);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nData de Nascimento: " + getDataNascimento() +
                "\nSalário: R$" + getSalario() + "\nCargo: horista" + "\nValor por Hora: R$" + getValorHora()
                + "\nTotal de horas: " + getTotalHoras();
    }
}

class FolhaPagamento {
    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario funcionarios[]) {
        System.out.printf("Nome da Empresa: %s\nEndereço: %s\nMês: %s\n\n",nome,cidade,mes);
        
        for (int i = 0; i < 4; i++) {
            System.out.println(funcionarios[i] + "\n");
        }
    }
}

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nomeE = entrada.next();
        String cidade = entrada.next();
        String mes = entrada.next();
        
        Funcionario[] funcionarios = new Funcionario[4];
        
        String nome = entrada.next();
        String data = entrada.next();
        float salario = entrada.nextFloat();
        String departamento = entrada.next();
        
        funcionarios[0] = new Chefe(nome,data,salario,departamento);
        
        nome = entrada.next();
        data = entrada.next();
        salario = entrada.nextFloat();
        float comissaoVenda = entrada.nextFloat();
        int quantidadeVendas = entrada.nextInt();
        
        funcionarios[1] = new Vendedor(nome,data,salario,comissaoVenda,quantidadeVendas);
        
        nome = entrada.next();
        data = entrada.next();
        entrada.next();
        float valorProducao = Float.parseFloat(entrada.next());
        int quantidadeProduzida = entrada.nextInt();
        
        funcionarios[2] = new Operario(nome,data,0,valorProducao,quantidadeProduzida);
        
        nome = entrada.next();
        data = entrada.next();
        entrada.next();
        float valorHora = entrada.nextFloat();
        int totalHoras = entrada.nextInt();
        
        funcionarios[3] = new Horista(nome,data,0,valorHora,totalHoras);
        
        FolhaPagamento folha = new FolhaPagamento();
        folha.mostrarPagamentos(nomeE,cidade,mes,funcionarios);
    }
    
}