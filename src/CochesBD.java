import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CochesBD {

    Coche coche;
    ArrayList<Coche> coches = new ArrayList<>();

    public void agregarCoche(Coche coche){
        coches.add(coche);
    }

    public ArrayList<Coche> ListarCoches(){
        coches.forEach(System.out::println);
        return coches;
    }

    public void ListarElectricos(){
        System.out.println("Lista de coches Electricos: ");
       Stream<Coche> cocheStream=coches.stream().filter(x -> x.getClass().getName().equalsIgnoreCase("CocheElectrico"));
       cocheStream.forEach(System.out::println);
       System.out.println();


    }

    public void ListarCombustibles(){
        System.out.println("Lista de coches de Combustible: ");
        coches.stream().filter(x -> x.getClass().getName().equalsIgnoreCase("CocheCombustible"))
                .forEach(System.out::println);
        System.out.println();

    }

    public void ListarHibridos(){
        System.out.println("Lista de coches de Hibridos: ");
        coches.stream().filter(x -> x.getClass().getName().equalsIgnoreCase("CocheHibrido"))
                .forEach(System.out::println);
        System.out.println();

    }


}
