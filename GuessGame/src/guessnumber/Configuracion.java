package guessnumber;

import java.util.Random;

public class Configuracion {

    private int rango=100;
    private int intentos;

    public Configuracion(int intentos) {
        this.intentos = intentos;
    }

    public int generarNumeroRandom() { //generamos un número random pero no lo mostramos
        Random rand = new Random();
        return rand.nextInt(rango) + 1; // Genera un número aleatorio entre 1 y `rango` que es 100
    }

    public int getIntentos() {
        return intentos;
    }

}