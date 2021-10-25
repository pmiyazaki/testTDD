package br.com.DHTEST.entities;

public abstract class Conta {
    private int numero;
    protected int saldo;

    //construtor
    public Conta(int numero){
        this.numero = numero;
    }

    //encapsulamento


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double sacar(double valor){
        saldo -= valor;
        return saldo;
    }

    public double depositar(double valor){
        saldo +=valor;
        return saldo;
    }
}
