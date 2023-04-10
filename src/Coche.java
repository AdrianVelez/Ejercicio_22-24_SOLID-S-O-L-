
abstract public class Coche {
    private static int CONTADOR = 0;
    int id = 0;
    private String marca;
    private String modelo;
    private int puertas;
    private int ruedas;
    private String tipo;
    private String suministra;

    public Coche(String marca, String modelo, int puertas, int ruedas, String tipo, String suministra) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.tipo = tipo;
        this.suministra = suministra;
        id = ++Coche.CONTADOR;
    }

    abstract public void avanza();

    abstract public void frena();

    abstract public void suministro();

    public int getId() {
        return this.id;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getPuertas() {
        return puertas;
    }
    public int getRuedas() {
        return ruedas;
    }
    public String getTipo() {
        return tipo;
    }
    public String getSuministra() {
        return suministra;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", ruedas=" + ruedas +
                ", tipo='" + tipo + '\'' +
                ", suministra='" + suministra + '\'' +
                '}';
    }
}

