package Tema7_1.repasoColecciones.arrayDeque;

public class App {
    public static void main(String[] args) {

        Logbuffer lg = new Logbuffer(5);

        for (int i = 1; i <= 8; i++){
            lg.addLog(String.valueOf(i));
        }


        lg.showLogs();



    }
}
