package br.com.contadorcommonitor;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public synchronized void incrementarValor() {
        this.valor++;
    }

}
