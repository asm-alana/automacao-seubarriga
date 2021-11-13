package me.wcaquino.core.utils.utilidades;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import me.wcaquino.core.setup.DriverFactory;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EvidenciasTela {

    static String caminhoTeste = System.getProperty("user.dir").concat("./src/test/resources/evidencias/").replace("/",
            File.separator);

    public static void tirarScreenshotWeb(String nomeDoCenario, String nomeDoStep) {

        Date data = new Date();

        new File("./src/test/resources/evidencias/").mkdirs();

        SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatarNomeArquivo = new SimpleDateFormat("yyyy-MM-dd HH-mm");

        String dataFormatada = formatar.format(data);
        String dataFormatadaNomeArquivo = formatarNomeArquivo.format(data);

        File pasta = new File("./src/test/resources/evidencias/" + dataFormatada);

        pasta.mkdir();

        nomeDoCenario = nomeDoCenario.replace("\"", "");
        nomeDoStep = nomeDoStep.replace("\"", "");
        String caminhoFinal = caminhoTeste + dataFormatada + File.separator;
        File caminhoDeCaptura = new File(caminhoFinal);
        caminhoDeCaptura.mkdirs();

        Shutterbug.shootPage(DriverFactory.getDriver(), ScrollStrategy.WHOLE_PAGE, 5000, true)
                .withName(dataFormatadaNomeArquivo + " " +nomeDoCenario).save(caminhoFinal);

    }

    public static void apagarScreenshots() {
        Gerais.excluirTodosArquivos(caminhoTeste);
    }

}
