
public class CocheCombustible extends Coche{
    private static int CONTADOR = 0;
    int idCombustible = 0;


    public CocheCombustible(String marca, String modelo, int puertas, int ruedas, String tipo, String suministra) {
        super(marca, modelo, puertas, ruedas, tipo, suministra);
        idCombustible = ++CocheCombustible.CONTADOR;
    }

    @Override
    public void avanza() {
        System.out.println("El coche de Combustible esta avanzando");

    }
    @Override
    public void frena() {
        System.out.println("El coche de Combustible ha frenado");

    }
    @Override
    public void suministro() {
        System.out.println("El coche esta almacenando combustible en el deposito. ");
    }
}
