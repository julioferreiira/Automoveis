package br.com.fesfafic.Auto.Main;
import br.com.fesfafic.Auto.Model.*;

public class Main {

    public static void main(String[] args) {

        Moto minhaMoto = new Moto("Honda", "Biz", 2023, 55);

        System.out.println("Marca da Moto: " + minhaMoto.getMarca());
        System.out.println("Modelo da Moto: " + minhaMoto.getModelo());
        System.out.println("Ano da Moto: " + minhaMoto.getAno());

        minhaMoto.ligarMotor();
        minhaMoto.acelerar(30);
        System.out.println("Velocidade da Moto após acelerar: " + minhaMoto.getVelocidade());
        minhaMoto.fazerManobra("Cavalo de Pau");
        minhaMoto.freiar();
        System.out.println("Velocidade da Moto após freiar: " + minhaMoto.getVelocidade());
        minhaMoto.desligarMotor();


        Carro meuCarro = new Carro("Fiat", "Pulse", 2023, 34);

        System.out.println("Marca do Carro: " + meuCarro.getMarca());
        System.out.println("Modelo do Carro: " + meuCarro.getModelo());
        System.out.println("Ano do Carro: " + meuCarro.getAno());

        meuCarro.abrirPorta(1);
        meuCarro.abrirPortaMala();
        meuCarro.acelerar(10);
        System.out.println("Velocidade do Carro após acelerar: " + meuCarro.getVelocidade());
        meuCarro.passarMarcha(0);

    }
}


