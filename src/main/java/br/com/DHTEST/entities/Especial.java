package br.com.DHTEST.entities;

public class Especial extends Conta{
    private double limite;

    //construtor

    public Especial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }


    //encapsulamento


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double sacar(double valor){
        //valor negativo nao
        //valor zerado nao
        //valor acima do saldo mais menor que saldo + limite tem regra
        //valor menor que saldo vai direto
        double disponivel = saldo + limite;
        double diferenca = 0.00;
        if(valor<=0){
            System.out.println("Impossível realizar");
        } else if(valor > (disponivel)) {
            System.out.println("Saldo insuficiente, limite indisponível");
        } else if(valor > saldo && valor <= (saldo+limite)){
            diferenca = valor - saldo;
            limite -= diferenca;
            super.depositar(diferenca);
            saldo -= valor;
        } else {
            saldo -= valor;
        }
        return saldo;
    }
}
