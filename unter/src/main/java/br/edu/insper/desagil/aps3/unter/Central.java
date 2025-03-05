package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    List<Corrida> corridas;

    public Central() {
        corridas = new ArrayList<>();
    }

    public double mediaPassageiro(String CPF){
        int media = 0;
        int n = 0;

        if(corridas.isEmpty()){
            return 0;
        }

        for (Corrida corrida : corridas){
            if(corrida.passageiro.getCPF().equals(CPF)){
                if(corrida.notaPassageiro != 0){
                    media += corrida.notaPassageiro;
                    n += 1;
                }
            }
        }
        return media / (double) n;
    }

    public double mediaMotorista(String CPF){
        int media = 0;
        int n = 0;

        if(corridas.isEmpty()){
            return 0;
        }
        for (Corrida corrida : corridas){
            if(corrida.motorista.getCPF().equals(CPF)){
                if(corrida.notaPassageiro != 0){
                    media += corrida.notaPassageiro;
                    n += 1;
                }
            }
        }
        return media / (double) n;
    }
}
