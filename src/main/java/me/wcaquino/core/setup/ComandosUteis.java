package me.wcaquino.core.setup;

public class ComandosUteis {

    public static void pausar(int tempoMs){
        try {
            Thread.sleep(tempoMs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
