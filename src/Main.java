public class Main {
    public static void main(String[] args){

        Coche coche1 = new CocheCombustible("Toyota","avanza",4,4,"Camioneta","gasolina");
        Coche coche2 = new CocheElectrico("Toyota","avanza",4,4,"Camioneta","Electricidad");
        Coche coche3 = new CocheHibrido("Toyota","avanza",4,4,"Camioneta","Hibrido");

        CochesBD cochesBD= new CochesBD();
        cochesBD.agregarCoche(coche1);
        cochesBD.agregarCoche(coche2);
        cochesBD.agregarCoche(coche3);

        cochesBD.ListarCoches();

        cochesBD.ListarElectricos();
        cochesBD.ListarCombustibles();
        cochesBD.ListarHibridos();


        coche1.avanza();
        coche2.avanza();
        coche3.avanza();



    }
}