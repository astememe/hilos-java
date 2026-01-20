package Sincronizacion;

public class Contador {
    private int c = 0;

    Contador(int c){
        this.c = c;
    }

    public void incrementar(){
        c++;
    }

    public void decrementar(){
        c--;
    }

    public int getValor(){
        return c;
    }
}
