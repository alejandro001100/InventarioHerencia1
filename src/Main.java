import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Producto p1 = new Producto("Producto genérico 1",0,"C001",0,"Sin marca");

        List<Producto> listaProductos = new ArrayList<>();
        Alimento alimento=new Alimento("alimento","Leche",1.1,"P0001",250,"vita","27/11/2016","29/11/2017", null);


    Tecnologia tecnologia=new Tecnologia("Tecnologia","Laptop",600, "P0002",100, "HP", "HP", 110);
    Electrodomestico electrodomestico=new Electrodomestico("electro","Lavadora", 500, "P0003", 50, "Samsung", "China", 110, "1 año");

listaProductos.add(alimento);
listaProductos.add(tecnologia);
listaProductos.add(electrodomestico);

    Alimento alimento2 = (Alimento)listaProductos.get(0);
    for (Producto producto: listaProductos) {
        if (producto.tipo.equals("alimento")) {

        }
    }
}
}
