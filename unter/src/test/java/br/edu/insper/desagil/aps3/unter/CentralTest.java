package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CentralTest {
    Central central;
    Passageiro passageiro;
    Passageiro passageiro2;
    Motorista motorista;
    Motorista motorista2;
    Corrida corrida;

    @BeforeEach
    void setUp() {
       central = new Central();
    }

    @Test
    void nenhumaAvaliacaoPassageiro(){
        assertEquals(0, central.mediaPassageiro("123"));
    }

    @Test
    void nenhumaAvaliacaoMotorista(){
        assertEquals(0, central.mediaMotorista("123"));
    }

    @Test
    void avaliacoesPassageiro(){
        passageiro = new Passageiro("123", "Ricardo");
        corrida = new Corrida(passageiro);

        corrida.avaliaPassageiro(0);
        central.corridas.add(corrida);

        corrida.avaliaPassageiro(4);
        central.corridas.add(corrida);

        corrida.avaliaPassageiro(5);
        central.corridas.add(corrida);

        passageiro2 = new Passageiro("321", "odraciR");
        corrida = new Corrida(passageiro2);

        corrida.avaliaPassageiro(3);
        central.corridas.add(corrida);

        assertEquals(4.5, central.mediaPassageiro("123"));
    }

    @Test
    void avaliacoesMotorista(){
        motorista = new Motorista("123", "Ricardo");
        corrida = new Corrida(passageiro);
        corrida.setMotorista(motorista);

        corrida.avaliaMotorista(0);
        central.corridas.add(corrida);

        corrida.avaliaMotorista(2);
        central.corridas.add(corrida);

        corrida.avaliaMotorista(3);
        central.corridas.add(corrida);

        motorista2 = new Motorista("321", "odraciR");
        corrida = new Corrida(passageiro2);
        corrida.setMotorista(motorista2);

        corrida.avaliaMotorista(1);
        central.corridas.add(corrida);

        corrida = new Corrida(passageiro2);
        corrida.avaliaMotorista(1);
        central.corridas.add(corrida);

        assertEquals(2.5, central.mediaMotorista("123"));
    }


}
