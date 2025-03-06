package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    Central central;
    Passageiro passageiro;
    Passageiro passageiro2;
    Motorista motorista;
    Motorista motorista2;
    Corrida corrida0;
    Corrida corrida1;
    Corrida corrida2;
    Corrida corrida3;
    Corrida corrida4;
    Corrida corrida5;

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
        passageiro2 = new Passageiro("321", "odraciR");

        corrida0 = new Corrida(passageiro);
        corrida1 = new Corrida(passageiro);
        corrida2 = new Corrida(passageiro);
        corrida3 = new Corrida(passageiro2);

        corrida1.avaliaPassageiro(4);
        central.corridas.add(corrida1);

        corrida2.avaliaPassageiro(5);
        central.corridas.add(corrida2);

        corrida3.avaliaPassageiro(3);
        central.corridas.add(corrida3);

        assertEquals(4.5, central.mediaPassageiro("123"));
    }

    @Test
    void avaliacoesMotorista(){
        motorista = new Motorista("123", "Ricardo");
        motorista2 = new Motorista("321", "odraciR");

        corrida0 = new Corrida(passageiro);
        corrida1 = new Corrida(passageiro);
        corrida2 = new Corrida(passageiro2);
        corrida3 = new Corrida(passageiro2);
        corrida4 = new Corrida(passageiro2);

        corrida0.setMotorista(motorista);
        corrida1.setMotorista(motorista);
        corrida2.setMotorista(motorista2);
        corrida3.setMotorista(motorista2);

        corrida0.avaliaMotorista(2);
        central.corridas.add(corrida0);

        corrida1.avaliaMotorista(3);
        central.corridas.add(corrida1);

        corrida2.avaliaMotorista(1);
        central.corridas.add(corrida2);

        corrida3.avaliaMotorista(1);
        central.corridas.add(corrida3);

        corrida4.avaliaMotorista(1);

        assertEquals(2.5, central.mediaMotorista("123"));
    }


}
