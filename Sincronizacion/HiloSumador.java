package Sincronizacion;

public class HiloSumador extends Thread{
    private Contador contador;

    public HiloSumador(String n, Contador c){
        setName(n);
        contador = c;
    }

    public void run(){
        synchronized (contador) {
            for (int i = 0; i < 300; i++) {
                contador.incrementar();
            }
        }
        System.out.println(this.getName() + "tiene un valor de" + contador.getValor());
    }
}
