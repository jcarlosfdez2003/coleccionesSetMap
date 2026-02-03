package parteA;

public class Espaniol {
    private String palabra;

    public Espaniol(String palabra){
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
