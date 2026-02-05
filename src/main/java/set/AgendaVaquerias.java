package set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaVaquerias {
    private Map<String, Vaqueria> vaquerias = new HashMap<>();
    private int contadorId = 0;

    public AgendaVaquerias() {
        this.vaquerias = new HashMap<>();
    }


    public String guardarVaqueria(Vaqueria vaqueria) {
        String id = "Vaqueria_" + (++contadorId);
        vaquerias.put(id, vaqueria);
        return id;
    }


    public void guardarVaqueria(String id, Vaqueria vaqueria) {
        vaquerias.put(id, vaqueria);
    }
    public Vaqueria obtenerVaqueria(String id) {
        return vaquerias.get(id);
    }
    public Collection<Vaqueria> obtenerTodasLasVaquerias() {
        return vaquerias.values();
    }
    public Collection<String> obtenerTodosLosIdentificadores() {
        return vaquerias.keySet();
    }
    public Vaqueria eliminarVaqueria(String id) {
        return vaquerias.remove(id);
    }
    public int obtenerNumeroDeVaquerias() {
        return vaquerias.size();
    }
    public boolean existeVaqueria(String id) {
        return vaquerias.containsKey(id);
    }
    public void imprimir() {
        if (vaquerias.isEmpty()) {
            System.out.println("No hay vaquerías registradas.");
            return;
        }
        
        for (Map.Entry<String, Vaqueria> entrada : vaquerias.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + " -> Vaquería: " + entrada.getValue());
        }
    }
    public void limpiar() {
        vaquerias.clear();
    }
}
