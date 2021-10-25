package br.com.DHTEST;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    Calculadora calculadora; //instanciando a calculadora GLOBALMENTE

    @Before //com essa annotation podemos realizar um operação antes de cada teste
    public void setUp() {
        calculadora = new Calculadora();  //com isso criamos o objeto calculadora pra cada teste
    }

    @Test//(expected = RuntimeException.class)  //neste teste esperamos um erro de runtime pré-definido
    public void deveSomar2Numeros() {

        //cenario
        int numero1 = 10, numero2 = -5;

        //execução
        int resultado = calculadora.somar(numero1, numero2);
        ;

        //verificação

        Assertions.assertThat(resultado).isEqualTo(15);


    }

    @Test
    public void deverSubtrair2Numeros() {
        //cenario
        int num1 = 13, num2 = 13;
        //execução
        int resultado = calculadora.subtrair(num1, num2);
        //verificação
        Assertions.assertThat(resultado).isEqualTo(0);
    }

    @Test
    public void deverMultiplicar2Numeros() {
        //cenario
        int num1 = 10, num2 = 5;
        //execução
        int resultado = calculadora.multiplicar(num1, num2);
        //verificação
        Assertions.assertThat(resultado).isEqualTo(50);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void deverDividir2Numeros() {
        //cenario
        int num1 = 10, num2 = 0;
        //execução
        float resultado = calculadora.dividir(num1, num2);
        //verificação
        Assertions.assertThat(resultado).isEqualTo(5);
    }

}