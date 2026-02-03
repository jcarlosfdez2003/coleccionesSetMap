package parteA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        int decisionMenu = 0;
        Traductor2 t1 = new Traductor2();
        t1.guardarTraduccion("Dog", "Perro");
        t1.guardarTraduccion("Cat", "Gato");
        do {
            try {
                System.out.println();
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
                } else if (decisionMenu == 0) {
                    salir = true;
                    System.out.println("Saliendo...");
                }

                switch (decisionMenu) {
                    case 1:
                        System.out.println("Añadimos traducción.");
                        System.out.println("Palabra en ingles:");
                        String p1 = sc.nextLine();
                        System.out.println("Palabra en español:");
                        String p2 = sc.nextLine();
                        t1.guardarTraduccion(p1, p2);
                        break;
                    case 2:
                        System.out.println("Vemos traducciones.");
                        t1.imprimir();
                        break;
                    case 3:
                        System.out.println("Traducimos palabra.");
                        break;
                    case 4:
                        System.out.println("Eliminamos traducción");
                        System.out.println("Desea borrar: ");
                        p1 = sc.nextLine();
                        t1.borrarTraduccion(p1);
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
