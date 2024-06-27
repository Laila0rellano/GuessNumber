package guessnumber;

import java.util.Scanner;

public class Main { //abro la clase main
	static Scanner scanner = new Scanner(System.in); //objeto scanner
    public static void main(String[] args) {
    	Numero input = new Numero(); //creo el objeto input para almacenar aquello que el usuario ingresa 
        int opcion; //opcion es un int obligarotiamente
        do {//abro do while para que mi programa se repita hasta que el usuario ordene lo contrario 
            System.out.println("---MENÚ---");
            System.out.println("1. Jugar!");
            System.out.println("2. Salir");
            opcion = input.getInt("Elige una opción: "); //creo el menú de opciones y abro scanner para que elijan
            switch (opcion) {
                case 1:
                	generarRenglonG(); //iniciar una nueva partida
                    Configuracion config = new Configuracion(5); //fijo los 5 intentos para poder modificarlos directamente si así lo quisiera
                    Partida partida = new Partida(config);
                    partida.start(); //funcion start que abre la partida
                    break;
                    
                case 2: //cerrar programa
                	generarRenglonG(); 
                	System.out.println("Saliendo del juego. ¡Nos vemos!");
                	break;
                	
                default: 
                	System.out.println("Opción no válida. Por favor, elige 1 o 2.");
            }
        } while (opcion != 2); 
		scanner.close(); //cierro scanner
  
    } 
    
    public static void generarRenglonG() { //detalle de renglon
		System.out.println("-----------------------------");
		System.out.println(); }
}
