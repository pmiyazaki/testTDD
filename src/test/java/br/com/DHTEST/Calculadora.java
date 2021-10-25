package br.com.DHTEST;

class Calculadora{

    int somar(int num1, int num2){
        if (num1 < 0 || num2 < 0 ){
            throw new RuntimeException("Não é permitido somar numeros negativos.");
        }
        return num1+num2;
    }

    int subtrair (int num1, int num2){
        if ((num1 <=0 || num2 <=0) || (num1<num2)){
            throw new RuntimeException("Não foi possível realizar essa operação");
        }
        return num1-num2;
    }

    int multiplicar(int num1, int num2){
        return num1*num2;
    }

    public float dividir(int num1, int num2){
        if ((num1 <=0 || num2 <=0) || (num1<num2)){
            throw new RuntimeException("Não foi possível realizar essa operação");
        }

        return num1/num2;
    }
}


