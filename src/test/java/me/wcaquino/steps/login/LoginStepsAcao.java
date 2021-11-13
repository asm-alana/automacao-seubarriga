package me.wcaquino.steps.login;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import me.wcaquino.page.login.BarrigaLoginAtividade;

public class LoginStepsAcao {

    BarrigaLoginAtividade barrigaLoginAtividade = new BarrigaLoginAtividade();

    @Quando("preenche o campo email com {string}")
    public void preencheOCampoEmailCom(String email) {
        barrigaLoginAtividade.preencheOCampoEmailCom("massa_acessos", email);
    }

    @E("preenche o campo senha com {string}")
    public void preencheOCampoSenhaCom(String senha) {
        barrigaLoginAtividade.preencheOCampoSenhaCom("massa_acessos", senha);
    }

    @Quando("preenche o campo email com {string} invalido")
    public void preencheOCampoEmailComInvalido(String email) {
        barrigaLoginAtividade.preencheOCampoEmailComInvalido(email);

    }

    @E("preenche o campo senha com {string} invalida")
    public void preencheOCampoSenhaComInvalida(String senha) {
        barrigaLoginAtividade.preencheOCampoSenhaComInvalida(senha);
    }

    @Quando("acessa os campos email com {string}, senha com {string}")
    public void acessaOsCamposEmailComSenhaCom(String email, String senha) {
        barrigaLoginAtividade.acessaOsCamposEmailComSenhaCom(email, senha);
    }
}
