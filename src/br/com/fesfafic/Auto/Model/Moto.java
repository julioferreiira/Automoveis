package br.com.fesfafic.Auto.Model;

public class Moto implements IVeiculosComportamento, IMotoComportamento {

    public String marca;
    public String modelo;
    public int ano;
    public int velocidade;

    public Moto() {
    }

    public Moto(String marca, String modelo, int ano, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar(int valor) {
        velocidade += valor * 1.2;
    }

    @Override
    public void freiar() {
        velocidade = 0;
    }

    @Override
    public void passarMarcha(int valor) {
        if (velocidade > 70) {
            System.out.println("Passando a quinta marcha");
        } else if (velocidade > 50) {
            System.out.println("Passando a quarta marcha");
        } else if (velocidade > 35) {
            System.out.println("Passando a terceira marcha");
        } else if (velocidade > 15) {
            System.out.println("Passando a segunda marcha");
        }
    }


    @Override
    public void ligarMotor() {
        System.out.println("Ligando o motor da moto.");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Desligando o motor da moto.");
    }

    @Override
    public void fazerManobra(String tipoManobra) {
        System.out.println("Realizando a manobra: " + tipoManobra);
    }

    @Override
    public void acelerarComEmocao() {
        System.out.println("Acelerando a moto com muita emoção!");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
