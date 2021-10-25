package br.com.DHTEST;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)  //annotation que informa que usaremos o mockito)
public class SegundoMock {
    //cenario
    @Mock  //especificando o objeto que será mock /muquiado
            List<String> lista;


    @Test
    public void testeNovoMock() {
        //execução
        Mockito.when(lista.size()).thenReturn(2);
        int size = lista.size();

//teste
        Assertions.assertThat(size).isEqualTo(2);
    }

}
