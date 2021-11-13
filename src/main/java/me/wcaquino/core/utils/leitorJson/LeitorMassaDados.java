package me.wcaquino.core.utils.leitorJson;

import me.wcaquino.core.setup.VariavelGlobal;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorMassaDados {

    //criando método que recebe o nome do arquivo json e o nome do grupo de dados desejados
    public static String PesquisaDados(String json_file, String id_massa, String identificador) {
        VariavelGlobal.massaDados = json_file;
        VariavelGlobal.identificadorMassa = id_massa;

    //criando um parses para utilizar no momento da leitura do arquivo json
        JSONParser Jparser = new JSONParser();
    //criando um objeto json que vai receber os dados do arquivo json
        JSONObject JObj = new JSONObject();

        try {
            String diretorio = System.getProperty("user.dir");
        //inserindo o arquivo json em um objeto
            JObj = (JSONObject) Jparser.parse(
                    new FileReader(diretorio + "/src/main/resources/json_file/" + VariavelGlobal.massaDados + ".json"));
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //convertendo o objeto com o arquivo json para o formato de objeto json
        JSONObject jObject = (JSONObject) JObj.get(id_massa);
        String retornoDados = (String) jObject.get(identificador);
        //retornando o objeto json , filtrando pelo grupo de dados desejado
        return retornoDados;
    }
}
