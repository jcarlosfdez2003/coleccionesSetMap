package parteA;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Traductor {
    private static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    boolean salir = false;
    int decisionMenu = 0;
    SortedMap<String, Espaniol> traductor = new TreeMap<>();
    
    do {
        try {
            System.out.println("""
                1.- Añadir traduccion.
                2.- Ver traducciones.
                3.- Traducir palabra.
                4.- Eliminar traduccion.
                5.- Modificar traduccion.
                6.- Obtener palabras españolas.
                7.- Obtener palabras inglesas.
                0.- Salir
                """);
            decisionMenu = sc.nextInt();
            if (decisionMenu < 0 || decisionMenu > 7) {
                System.out.println("Debe seleccionar una opcion valida");
                System.out.println("-------------------------------------------");
                salir = false;
            }else if (decisionMenu == 0) {
                salir = true;
                System.out.println("Saliendo...");
            }

            switch (decisionMenu) {
                case 1:
                    System.out.println("Añadimos traducción.");
                    break;
                case 2:
                    System.out.println("Vemos traducciones.");
                    break;
                case 3:
                    System.out.println("Traducimos palabra.");
                    break;
                case 4:
                    System.out.println("Eliminamos traducción");
                    break;
                case 5:
                    System.out.println("Modificamos traducción");
                    break;
                case 6:
                    System.out.println("Obtenemos lista de palabras en español.");
                    break;
                case 7:
                    System.out.println("Obtenemos lista de palabras en ingles.");
                    break;
            
                default:
                    break;
            }
            
        } catch (InputMismatchException ime) {
            System.out.println("No introduzca letras.");
            System.out.println("--------------------------------------");
            sc.nextLine();
        }
        
    } while (!salir);

}



}
