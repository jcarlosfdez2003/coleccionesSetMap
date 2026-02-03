package parteA;

public class Ingles {
private String palabra;

    public Ingles(String palabra){
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Palabra : " + palabra;
    }
}
