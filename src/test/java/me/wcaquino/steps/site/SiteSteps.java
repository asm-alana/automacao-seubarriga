package me.wcaquino.steps.site;

import io.cucumber.java.pt.Dado;
import me.wcaquino.page.site.SiteNavegacao;

public class SiteSteps {

    SiteNavegacao siteNavegacao = new SiteNavegacao();

    @Dado("que o usuario esta no site Seu Barriga")
    public void queOUsuarioEstaNoSiteSeuBarriga() {
        siteNavegacao.acessarSite("massa_site", "site_seuBarriga");
    }
}
