package set;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vaqueria {
    public static void main(String[] args) {

        Set<Vaca> conjuntoDeVacas = new HashSet<>();
        int numeroDeVacas = 0;

        if (tieneVacas(conjuntoDeVacas) == true) {
            System.out.println("El numero de vacas actual es: "+ numVac(conjuntoDeVacas));
        }else{
            System.out.println("Actualmente no hay vacas en la vaqueria.");
        }
        System.out.println("==================");

        conjuntoDeVacas.add(new Vaca(1, LocalDate.of(2000, 1, 1), "Hola soy una vaca"));
        conjuntoDeVacas.add(new Vaca(2, LocalDate.of(2000, 1, 1), "Hola soy una vaca"));

        añadirAnimal(conjuntoDeVacas, 5, LocalDate.of(2005,5,5), "Hola soy una vaquilla");
        añadirAnimal(conjuntoDeVacas, 4, LocalDate.of(2020,5,6), "Esta es la VACA");
        for (Vaca v : conjuntoDeVacas) {
            System.out.println(v);
        }
        System.out.println("===================");
        if (tieneVacas(conjuntoDeVacas)) {
            System.out.println("El numero de vacas actual es: "+ numVac(conjuntoDeVacas));
        }else{
            System.out.println("Actualmente no hay vacas en la vaqueria.");
        }

        numeroDeVacas = numVac(conjuntoDeVacas);
        System.out.println("Actualmente hay " + numeroDeVacas + " vacas.");

        if (saberSiEstaLaVaca(conjuntoDeVacas, 1)== true) {
            System.out.println("La vaca que busca se encuentra en la vaqueria.");
        }else{
            System.out.println("La vaca que busca no se encuentra en la vaqueria");
        }

    }

    

    public static int numVac(Set<Vaca> conjuntoDeVacas) {
        return conjuntoDeVacas.size();
    }

    public static void añadirAnimal(Set<Vaca> conjuntoDeVacas, int id, LocalDate fechaNacimiento, String descripcion){
        conjuntoDeVacas.add(new Vaca(id, fechaNacimiento, descripcion));
    }

    public static boolean tieneVacas(Set<Vaca> conjuntoDeVacas){
        if (conjuntoDeVacas.size()>0) {
            return true;
        }else{
            return false;
        }
    }

    public static ArrayList<Vaca> pasarLista(Set<Vaca> conjuntoDeVacas){
        ArrayList<Vaca> lista = new ArrayList<>(conjuntoDeVacas);
        return lista;
    }

    public static boolean saberSiEstaLaVaca(Set<Vaca> conjuntoDeVacas, int ID){
        //for (Vaca v : conjuntoDeVacas) {
        //    if (v.getId() == ID) {
        //        return true;
        //    }
        //}
        return conjuntoDeVacas.contains(ID);    
        //return false;
    }

}
