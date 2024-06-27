package guessnumber;
import java.util.Scanner;
public class Numero {

    private Scanner scanner;
    
//creamos el objeto que vamos a estar usando en el programa
    public Numero() {
        this.scanner = new Scanner(System.in);
    }

    //verificación de no ingresar letras
    public int getInt(String letra) {
        System.out.print(letra);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, introduce una opción válida: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
