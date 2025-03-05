package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class MotoristaTest {
    Motorista motorista;
    Corrida corrida;

    @BeforeEach
    void setUp() {
        motorista = new Motorista("47374423802", "Danilo Correa Ramos");
        corrida = new Corrida(mock(Passageiro.class));
    }

    @Test
    void controi(){
        assertEquals("47374423802", motorista.getCPF());
        assertEquals("Danilo Correa Ramos", motorista.getNome());
    }
    @Test
    void mudaNome(){
        motorista.setNome("Enrico Vagetti Berto");
        assertEquals("Enrico Vagetti Berto", motorista.getNome());
    }

    @Test
    void avalia(){
        corrida.avaliaPassageiro(3);
        assertEquals(3, corrida.notaPassageiro);
    }
    @Test
    void avaliaBaixo(){
        corrida.avaliaPassageiro(0);
        assertEquals(1, corrida.notaPassageiro);
    }
    @Test
    void avaliaAlto(){
        corrida.avaliaPassageiro(6);
        assertEquals(5, corrida.notaPassageiro);
    }

}
