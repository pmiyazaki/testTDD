package br.com.DHTEST;

import br.com.DHTEST.entities.Especial;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ContaEspecialTestes {
    //cenario
    Especial ce1;

    @Before
    public void setUp(){
        ce1 = new Especial(1, 1000.00);
    }

    @Test
    public void naoAceitaNegativo(){
        double resultado = 0.00;
        //execução
        ce1.depositar(100.00);
        resultado = ce1.sacar(-1.00);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(100.00);
    }

    @Test
    public void valorAcimaDoTeto(){
        double resultado = 0.00;
        //double testeLimite=0.00;
        //execução
        ce1.depositar(100.00);
        resultado = ce1.sacar(1200.00);
        //testeLimite = ce1.getLimite();

        //verificação
        Assertions.assertThat(resultado).isEqualTo(100.00);
        //Assertions.assertThat(testeLimite).isEqualTo(1000.00);
    }

    @Test
    public void usandoLimite(){
        double resultado = 0.00;
        double testeLimite=0.00;
        //execução
        ce1.depositar(100.00);
        resultado = ce1.sacar(1100.00);
        testeLimite = ce1.getLimite();
        //resultado = ce1.sacar(10.00);

        //verificação
        //Assertions.assertThat(resultado).isEqualTo(0.00);
        Assertions.assertThat(testeLimite).isEqualTo(0.00);
    }






}
