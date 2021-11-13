package me.wcaquino.hooks;

import io.cucumber.java.Scenario;
import me.wcaquino.core.setup.DriverFactory;
import me.wcaquino.core.utils.utilidades.EvidenciasTela;
import org.junit.After;

public class HookAfter {

    @After
    public void finalizar (Scenario cenario){
        String nomeDoCenario = cenario.getName();
        if(cenario.isFailed()){
            EvidenciasTela.tirarScreenshotWeb(nomeDoCenario, "nomeDoStep");
        }
        DriverFactory.killDriver();
    }
}
