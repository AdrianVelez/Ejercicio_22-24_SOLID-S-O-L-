
public class CocheElectrico extends Coche{
    private static int CONTADOR = 0;
    int idElectrico = 0;

    public CocheElectrico(String marca, String modelo, int puertas, int ruedas, String tipo, String suministra) {
        super(marca, modelo, puertas, ruedas, tipo, suministra);
        idElectrico = ++CocheElectrico.CONTADOR;
    }

    @Override
    public void avanza() {
        System.out.println("El coche Electrico esta avanzando");

    }
    @Override
    public void frena() {
        System.out.println("El coche Electrico ha frenado");

    }

    @Override
    public void suministro() {
        System.out.println("El coche esta almacenando energia electrica en bateria. ");
    }
}
