package me.wcaquino.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookBefore {

    @Before
    public void iniciandoProjeto(Scenario cenario){
        String nomeDoCenario = cenario.getName();
        System.out.println("Iniciando o teste do cenario: " + nomeDoCenario);
    }
}
