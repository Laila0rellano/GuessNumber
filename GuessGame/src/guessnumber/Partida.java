package guessnumber;

public class Partida {

    private final int numero; 
    private final int intentos;
    private int intentosRest;

    public Partida (Configuracion config) {
        this.numero = config.generarNumeroRandom();
        this.intentos = config.getIntentos();
        this.intentosRest = intentos;
    }
    public void start() {
        Numero input = new Numero(); 
        System.out.println("¡BIENVENIDO AL JUEGO ADIVINA EL NÚMERO!");
        System.out.println("Tienes " + intentos + " intentos para adivinar el número correcto del 1 al 100. ¡Buena suerte!");

      
        while (intentosRest > 0) {
            int intento = input.getInt("Introduce tu intento: ");
            intentosRest--;

            //sección de verificaciones de datos
            if (intento == numero) { //adivinar
                System.out.println("¡Felicidades! ¡Has adivinado el número correcto!");
                System.out.println();
                return;
                
            } else if (intento > numero) { //numero bajo
                System.out.println("Tu intento es demasiado alto.");
                System.out.println();
            } else { //numero alto
                System.out.println("Tu intento es demasiado bajo.");
                System.out.println();
            }

            if (intentosRest > 0) { //para mostrar en consola cuantos intentos van quedando
                System.out.println("Te quedan " + intentosRest + " intentos.");
            }
        }

        System.out.println("Lo siento, has agotado tus intentos. El número correcto era " + numero + ".");
        System.out.println("___________________________________________________________________________");
        System.out.println();
    }
}