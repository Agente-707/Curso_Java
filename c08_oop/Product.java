package c08_oop;

public class Product{
    double precio;

    public Product(double precio){
        this.precio = precio;
    }

    public void descuento(){
        double desc = precio - 10.0;
        System.out.println("Precio: " + precio);
        System.out.println("Aplicando descuento: " + desc);
    }
  
}
