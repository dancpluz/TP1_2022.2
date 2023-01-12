package taxi;

import java.util.Scanner;

class Cliente {
    private int id;
    private String nome, telefone, RG, CPF;

    public Cliente(int id, String nome, String telefone, String RG, String CPF) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.RG = RG;
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Chamado {
    private int id;
    private String data, tipo, origem, destino;
    private float horaPartida, horaRetorno;
    private double kmInicial, kmFinal, valorTotal;
    public Cliente cliente;
    public Motorista motorista;

    public Chamado(int id, String data, String tipo, String origem, String destino, float horaPartida, float horaRetorno, double kmInicial, double kmFinal, double valorTotal, Cliente cliente, Motorista motorista) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.horaRetorno = horaRetorno;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.motorista = motorista;
    }
    
    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public float getHoraPartida() {
        return horaPartida;
    }

    public float getHoraRetorno() {
        return horaRetorno;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHoraPartida(float horaPartida) {
        this.horaPartida = horaPartida;
    }

    public void setHoraRetorno(float horaRetorno) {
        this.horaRetorno = horaRetorno;
    }
}

class Motorista {
    private int id;
    private String nome, telefone, CNH;
    public Veiculo veiculo;

    public Motorista(int id, String nome, String telefone, String CNH, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.CNH = CNH;
        this.veiculo = veiculo;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCNH() {
        return CNH;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Veiculo {
    private String placa, marca, modelo, cor;
    private int ano;

    public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}

public class Taxi {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String placaCarro, marcaCarro, modeloCarro, corCarro;
        int anoCarro;
        
        placaCarro = entrada.next();
        marcaCarro = entrada.next();
        modeloCarro = entrada.next();
        corCarro = entrada.next();
        anoCarro = entrada.nextInt();
        
        int idMotorista;
        String nomeMotorista, telefoneMotorista, CNHMotorista;
        
        idMotorista = entrada.nextInt();
        nomeMotorista = entrada.next();
        telefoneMotorista = entrada.next();
        CNHMotorista = entrada.next();
        
        int idCliente;
        String nomeCliente, telefoneCliente, RGCliente, CPFCliente;
        
        idCliente = entrada.nextInt();
        nomeCliente = entrada.next();
        telefoneCliente = entrada.next();
        RGCliente = entrada.next();
        CPFCliente = entrada.next();
        
        int idChamado;
        String dataChamado, tipoChamado, origemChamado, destinoChamado;
        float horaPartida, horaRetorno;
        double kmInicial, kmFinal, valorTotal;
        
        idChamado = entrada.nextInt();
        dataChamado = entrada.next();
        tipoChamado = entrada.next();
        origemChamado = entrada.next();
        destinoChamado = entrada.next();
        horaPartida = entrada.nextFloat();
        horaRetorno = entrada.nextFloat();
        kmInicial = entrada.nextDouble();
        kmFinal = entrada.nextDouble();
        valorTotal = entrada.nextDouble();
        
        Veiculo carro = new Veiculo(placaCarro, marcaCarro, modeloCarro, corCarro, anoCarro);
        Motorista motorista = new Motorista(idMotorista, nomeMotorista, telefoneMotorista, CNHMotorista, carro);
        Cliente cliente = new Cliente(idCliente, nomeCliente, telefoneCliente, RGCliente, CPFCliente);
        Chamado chamado = new Chamado(idChamado, dataChamado, tipoChamado, origemChamado, destinoChamado, horaPartida, horaRetorno, kmInicial, kmFinal, valorTotal, cliente, motorista);
        
        System.out.println(chamado.getId());
        System.out.println(chamado.getDestino());
        System.out.println(chamado.motorista.veiculo.getPlaca());
        System.out.println(chamado.cliente.getRG());
        System.out.println(chamado.motorista.getNome());
    }
    
}
