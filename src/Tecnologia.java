public class Tecnologia extends Producto{

String fabricante;
Double voltaje;
String garantia;

public Tecnologia(String tipo, String nombre, double precio, String codigo, int cantidad, String marca, String fabricante, Double voltaje, String garantia) {
    super(tipo, nombre, precio, codigo, cantidad, marca);
    this.fabricante = fabricante;
    this.voltaje = voltaje;
    this.garantia = garantia;
    this.tipo = tipo;
}
   public Tecnologia() {
    }
}
