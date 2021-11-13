package me.wcaquino.steps.login;

import io.cucumber.java.pt.Entao;
import me.wcaquino.page.login.BarrigaLoginAcao;
import me.wcaquino.page.login.BarrigaLoginVerificar;

public class LoginStepsVerificar {

    BarrigaLoginVerificar barrigaLoginVerificar = new BarrigaLoginVerificar();

    @Entao("sera redirecionado para a pagina com a mensagem {string} na tela")
    public void seraRedirecionadoParaAPaginaComAMensagemNaTela(String msgSucesso) {
        barrigaLoginVerificar.seraRedirecionadoParaAPaginaComAMensagemNaTela(msgSucesso);
    }

    @Entao("visualizara a mensagem {string} na tela")
    public void visualizaraAMensagemNaTela(String msgErro) {
        barrigaLoginVerificar.visualizaraAMensagemNaTela(msgErro);
    }

    @Entao("visualizara a mensagem de erro {string}")
    public void visualizaraAMensagemDeErro(String msgErroPreenchimento) {
        barrigaLoginVerificar.visualizaraAMensagemDeErro(msgErroPreenchimento);
    }
}
