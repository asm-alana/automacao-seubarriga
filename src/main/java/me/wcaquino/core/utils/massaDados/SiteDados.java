package me.wcaquino.core.utils.massaDados;

import me.wcaquino.core.utils.leitorJson.LeitorMassaDados;

public class SiteDados {

    private String site;

    public String getSite() {
        return site;
    }

    public SiteDados(String json_file, String id_massa) {
        this.site = LeitorMassaDados.PesquisaDados(json_file, id_massa, "site");
    }
}
