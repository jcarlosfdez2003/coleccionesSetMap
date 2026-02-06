package parteA;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Traductor2 {

    private Map<String, String> palabras = new TreeMap<>();

    public Traductor2() {
        palabras = new TreeMap<>();
    }

    public void guardarTraduccion(String palabra1, String palabra2) {
        palabras.put(palabra1, palabra2);
    }

    public void borrarTraduccion(String key) {
        palabras.remove(key);
    }

    public void imprimir() {
        for (Map.Entry<String, String> entrada : palabras.entrySet()) {
            String key = entrada.getKey();
            String value = entrada.getValue();
            System.out.println("Key: " + key + " traducción: " + value);
        }
    }

    public void imprimir2() {
        System.out.println(palabras);
    }

    public void imprimir3() {
        for (String key : palabras.keySet()) {
            System.out.println(key + ".........." + palabras.get(key));
        }
    }

    public Set<String> obtenerConjuntoKeys() {
        return palabras.keySet();
    }

    public List<String> obtenerListaValores() {
        return new ArrayList<>(palabras.values());
    }

    public ArrayList<String> obtenerListaPalabrasExtranjeras(){
        return new ArrayList<>(palabras.keySet());
    }

    public void obtenerTraduccion(String palabraIngles){
        System.out.println("La palabra: " + palabraIngles + " es " + palabras.get(palabraIngles));
    }


}
