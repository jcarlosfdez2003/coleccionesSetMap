package parteB;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class TuLotero {
    private Map<String, String> boletosPremiados = new HashMap<>();

    public TuLotero() {
        boletosPremiados = new HashMap<>();
    }

    public void añadirBoletosPremiados(String boleto, String premio) {
        boletosPremiados.put(boleto, premio);
    }

    public void imprimir() {
        for (Map.Entry<String, String> entrada : boletosPremiados.entrySet()) {
            String key = entrada.getKey();
            String value = entrada.getValue();
            System.out.println("Boleto: " + key + ", premio: " + value);
        }
    }

    public Set<String> obtenerConjuntoKeys() {
        return boletosPremiados.keySet();
    }

    public String obtenerPremio(String boleto) {
        return boletosPremiados.get(boleto);
    }

    public void generarBoletosPremiados() {
        Set<String> boletos = new HashSet<>();
        Random rnd = new Random();

        while (boletos.size() < 1000) {
            int boletoInt = rnd.nextInt(100000);
            String boletoString = String.format("%05d", boletoInt);
            boletos.add(boletoString);
        }

        for (String ticket : boletos) {
            int precioInt = rnd.nextInt(100001);
            String precioString = String.valueOf(precioInt);
            boletosPremiados.put(ticket, precioString);
        }
    }

    @Override
    public String toString(){
        String aux = "";
        for (Map.Entry<String,String> entrada : boletosPremiados.entrySet()) {
            String key = entrada.getKey();
            String value = entrada.getValue();
            aux += key + "----------------" + value + "\n";
        }
        return aux;
    }

}
