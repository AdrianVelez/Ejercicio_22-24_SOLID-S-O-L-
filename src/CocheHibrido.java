

public class CocheHibrido extends Coche{
    private static int CONTADOR = 0;
    int idHibrido = 0;

    public CocheHibrido(String marca, String modelo, int puertas, int ruedas, String tipo, String suministra) {
        super(marca, modelo, puertas, ruedas, tipo, suministra);
        idHibrido = ++CocheHibrido.CONTADOR;
    }

    @Override
    public void avanza() {
        System.out.println("El coche Hibirido esta avanzando");

    }
    @Override
    public void frena() {
        System.out.println("El coche Hibrido ha frenado");

    }
    @Override
    public void suministro() {
        System.out.println("El suministro es Hibrido");
    }
}