package me.wcaquino.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import me.wcaquino.core.setup.DriverFactory;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {""},
        tags = "@login-sucesso",
        plugin = {"json:src/test/resources/evidencias/relatorio/json/report.json","html:src/test/resources/evidencias/relatorio/html/report.html"},
        monochrome = true,
        dryRun = false
)

public class CucumberRunner {

    @AfterClass
    public static void finalizarRunner(){
        DriverFactory.killDriver();
    }
}
