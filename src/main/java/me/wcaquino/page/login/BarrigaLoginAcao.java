package me.wcaquino.page.login;

import me.wcaquino.core.setup.ComandosUteis;
import me.wcaquino.core.utils.massaDados.Acessos;
import org.openqa.selenium.Keys;

import static me.wcaquino.core.setup.DriverFactory.getDriver;

public class BarrigaLoginAcao {

    BarrigaLoginTela barrigaLoginTela = new BarrigaLoginTela(getDriver());

    public void clicarNoCampoEmail(){
        if(barrigaLoginTela.campoEmail.isEnabled()){
            barrigaLoginTela.campoEmail.click();
        }else{
            ComandosUteis.pausar(1500);
            barrigaLoginTela.campoEmail.click();
        }
    }

    public void limparCampoEmail(){
        barrigaLoginTela.campoEmail.clear();
    }

    public void escreverNoCampoEmail(String json_file, String id_massa){
        Acessos acessos = new Acessos(json_file, id_massa);
        barrigaLoginTela.campoEmail.sendKeys(acessos.getEmail());
    }

    public void escreverNoCampoSenha(String json_file, String id_massa){
        Acessos acessos = new Acessos(json_file, id_massa);
        barrigaLoginTela.campoSenha.sendKeys(acessos.getSenha());
        barrigaLoginTela.campoSenha.sendKeys(Keys.ENTER);
    }

    public void escreverEmailInvalido(String email){
        barrigaLoginTela.campoEmail.sendKeys(email);
    }

    public void escreverSenhaInvalida(String senha){
        barrigaLoginTela.campoSenha.sendKeys(senha);
        barrigaLoginTela.campoSenha.sendKeys(Keys.ENTER);
    }

    public void escreverEmailComPreenchimentoInvalido(String email){
        barrigaLoginTela.campoEmail.click();
        barrigaLoginTela.campoEmail.clear();
        barrigaLoginTela.campoEmail.sendKeys(email);
    }

    public void escreverSenhaComPreenchimentoInvalido(String senha){
        barrigaLoginTela.campoSenha.sendKeys(senha);
        barrigaLoginTela.campoSenha.sendKeys(Keys.ENTER);
    }

}
