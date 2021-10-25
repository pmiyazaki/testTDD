package br.com.DHTEST;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroMock {
    @Test
    public void mockada1(){

        //cenario
        List<String> lista = Mockito.mock(ArrayList.class); //criando uma list mais dessa vez MOCKADA
        //execução
        Mockito.when(lista.size()).thenReturn(20); //com esse comando mesmo com lista vazia estaos dando tamanho 20 pra ela
        int size = lista.size();

        //verificação
        Assertions.assertThat(size).isEqualTo(20); //aqui o teste básico de tamanho


    }

}

