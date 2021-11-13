package me.wcaquino.core.utils.massaDados;

import me.wcaquino.core.utils.leitorJson.LeitorMassaDados;

public class Acessos {
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Acessos(String json_file, String id_massa) {
        this.email = LeitorMassaDados.PesquisaDados(json_file, id_massa, "email" );
        this.senha = LeitorMassaDados.PesquisaDados(json_file, id_massa, "senha");
    }

}
