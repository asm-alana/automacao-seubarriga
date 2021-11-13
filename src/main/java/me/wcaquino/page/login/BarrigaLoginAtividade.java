package me.wcaquino.page.login;

public class BarrigaLoginAtividade {

    BarrigaLoginAcao barrigaLoginAcao = new BarrigaLoginAcao();

    public void preencheOCampoEmailCom(String json_file, String id_massa) {
        barrigaLoginAcao.clicarNoCampoEmail();
        barrigaLoginAcao.limparCampoEmail();
        barrigaLoginAcao.escreverNoCampoEmail(json_file, id_massa);
    }

    public void preencheOCampoSenhaCom(String json_file, String id_massa) {
        barrigaLoginAcao.escreverNoCampoSenha(json_file, id_massa);
    }

    public void preencheOCampoEmailComInvalido(String email) {
        barrigaLoginAcao.clicarNoCampoEmail();
        barrigaLoginAcao.limparCampoEmail();
        barrigaLoginAcao.escreverEmailInvalido(email);
    }

    public void preencheOCampoSenhaComInvalida(String senha) {
        barrigaLoginAcao.escreverSenhaInvalida(senha);
    }

    public void acessaOsCamposEmailComSenhaCom(String email, String senha) {
        barrigaLoginAcao.escreverEmailComPreenchimentoInvalido(email);
        barrigaLoginAcao.escreverSenhaComPreenchimentoInvalido(senha);
    }
}
