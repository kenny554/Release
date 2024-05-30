package Modelo;

public class Celular {
    private String modelo;
    private int numero;

    public Celular(String modelo, int numero) {
        this.modelo = modelo;
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Modelo: " + modelo + ", Numero: " + numero;
    }

}
