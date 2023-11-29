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

    for (Producto producto: listaProductos) {
        if (producto.tipo.equals("alimento")) {
            Alimento alimento3= (Alimento)producto;
            System.out.println("El alimento es: "+alimento.nombre+"se expira el: "+alimento.fechaVencimiento);
        } else if (producto.tipo.equals("tecnologia")) {
            Tecnologia tecnologia2 = (Tecnologia)producto;
            System.out.println("El electrodomestico es: "+tecnologia.nombre+"se expira el: "+tecnologia.marca);

        } else if (producto.tipo.equals("electro")) {
            Electrodomestico electrodomestico2 = (Electrodomestico)producto;
            System.out.println("El electrodomestico es: "+electrodomestico.nombre+"se expira el: "+electrodomestico.garantia);

        }
}
    System.out.println("----------------------------------------------------");
    
    for (Producto producto: listaProductos) {
        if (producto instanceof Alimento) {
            Alimento alimento3= (Alimento)producto;
            System.out.println("El alimento es: "+alimento.nombre+"se expira el: "+alimento.fechaVencimiento);
        } else if (producto instanceof Tecnologia) {
            Tecnologia tecnologia2 = (Tecnologia)producto;
            System.out.println("El electrodomestico es: "+tecnologia.nombre+"se expira el: "+tecnologia.marca);

        } else if (producto instanceof Electrodomestico) {
            Electrodomestico electrodomestico2 = (Electrodomestico)producto;
            System.out.println("El electrodomestico es: "+electrodomestico.nombre+"se expira el: "+electrodomestico.garantia);

        }


    }
    }
}
