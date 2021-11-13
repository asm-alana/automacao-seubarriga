package me.wcaquino.page.site;

import me.wcaquino.core.setup.DriverFactory;
import me.wcaquino.core.utils.massaDados.SiteDados;

public class SiteNavegacao {

    public void acessarSite(String json_file, String id_massa){
        SiteDados siteDados = new SiteDados(json_file, id_massa);
        DriverFactory.getDriver().get(siteDados.getSite());
    }
}
