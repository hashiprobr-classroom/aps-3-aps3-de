package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PassageiroTest {
Passageiro passageiro;
Corrida corrida;

@BeforeEach
    void setUp() {
    passageiro = new Passageiro("54929469864", "Enrico Vagetti Berto");
    corrida = new Corrida(passageiro);
}

@Test
    void controi(){
        assertEquals("54929469864", passageiro.getCPF());
        assertEquals("Enrico Vagetti Berto", passageiro.getNome());
    }
@Test
    void mudaNome(){
    passageiro.setNome("Danilo Correa Ramos");
    assertEquals("Danilo Correa Ramos", passageiro.getNome());
}

@Test
    void avalia(){
        corrida.avaliaMotorista(3);
        assertEquals(3, corrida.notaMotorista);
    }
@Test
    void avaliaBaixo(){
        corrida.avaliaMotorista(0);
        assertEquals(1, corrida.notaMotorista);

    }
@Test
    void avaliaAlto(){
        corrida.avaliaMotorista(6);
        assertEquals(5, corrida.notaMotorista);
    }

}
