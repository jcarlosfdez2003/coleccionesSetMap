package parteB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean salir = false; 
        int decisionMenu = 0 ; 

        TuLotero tl1 = new TuLotero();
        tl1.generarBoletosPremiados();

        do {
            try {
                System.out.println();
                System.out.println("""
                        1.- Ver números premiados.
                        2.- Ver numeros premiados y premios.
                        3.- Comprobar número.
                        4.- Volver a generar los boletos.
                        0.- Salir
                        """);
                decisionMenu = sc.nextInt();
                if (decisionMenu < 0 || decisionMenu > 4) {
                    System.out.println("Debe seleccionar una opcion valida");
                    System.out.println("-------------------------------------------");
                    salir = false;
                } else if (decisionMenu == 0) {
                    salir = true;
                    System.out.println("Saliendo...");
                }

                switch (decisionMenu) {
                    case 1:
                    System.out.println("Vamos a ver los números premiados");
                    System.out.println(tl1.obtenerConjuntoKeys());
                        break;
                    case 2:
                    System.out.println("Ver números con sus premios");
                    tl1.imprimir();
                        break;
                    case 3:
                    System.out.println("Comprobar número.");
                    System.out.print("Introduce el número a comprobar: ");
                    String numeroComprobar = sc.next();
                    comprobarNumero(tl1, numeroComprobar);
                        break;
                    case 4:
                    System.out.println("Volvemos a generar los boletos.");
                    tl1 = new TuLotero();
                    tl1.generarBoletosPremiados();
                    System.out.println("Boletos regenerados correctamente.");
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

    public static void comprobarNumero(TuLotero tl, String numero) {
        if (tl.obtenerConjuntoKeys().contains(numero)) {
            System.out.println("¡El número " + numero + " está premiado!");
            System.out.println("¡Has ganado: " + tl.obtenerPremio(numero) + "euros");
        } else {
            System.out.println("Lo siento, el número " + numero + " no está premiado.");
        }
        System.out.println("-------------------------------------------");
    }

}
