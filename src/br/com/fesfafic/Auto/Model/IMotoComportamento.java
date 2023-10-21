package br.com.fesfafic.Auto.Model;

public interface IMotoComportamento {
    void ligarMotor();
    void desligarMotor();
    void fazerManobra(String tipoManobra);
    void acelerarComEmocao();
}

