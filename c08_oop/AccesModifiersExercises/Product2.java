package c08_oop.AccesModifiersExercises;

// Ejercicio 2: Solución
public class Product2 {
    private double price;

    public Product2(double price){
        this.setPrice(price);
    }

    public void setPrice(double price){
        if(price>0){
            this.price = price;
            System.out.println("El valor del producto es: " + price);
        }else{
            System.out.println("Error: El producto no puede tener precio negativo.");
        }
    }


}
