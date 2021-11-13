package me.wcaquino.page.login;

import org.junit.jupiter.api.Assertions;

import static me.wcaquino.core.setup.DriverFactory.getDriver;

public class BarrigaLoginVerificar {

    BarrigaLoginTela barrigaLoginTela = new BarrigaLoginTela(getDriver());

    public void seraRedirecionadoParaAPaginaComAMensagemNaTela(String msgSucesso) {
        Assertions.assertEquals(msgSucesso, barrigaLoginTela.msgLoginSucesso.getText());
    }

    public void visualizaraAMensagemNaTela(String msgErro) {
        Assertions.assertEquals(msgErro, barrigaLoginTela.msgErroLogin.getText());
    }

    public void visualizaraAMensagemDeErro(String msgErroPreenchimento) {
        Assertions.assertEquals(msgErroPreenchimento, barrigaLoginTela.msgErroLogin.getText());
    }
}
