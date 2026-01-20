package Sincronizacion;

public class HiloRestador extends Thread{
    private Contador contador;

    public HiloRestador(String n, Contador c){
        setName(n);
        contador = c;
    }

    public void run(){
        synchronized (contador){
            for (int i = 0; i < 300; i++) {
                contador.decrementar();
            }
        }
        System.out.println(this.getName() + "tiene un valor de" + contador.getValor());
    }
}
