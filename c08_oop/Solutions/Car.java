package c08_oop.Solutions;

// Ejercicio 4: Solución
public class Car{
    String brand;
    String model;

    public Car(String model, String brand){
        this.model = model;
        this.brand = brand;
    }

    public void showData(){
        System.out.println("Información sobre el auto:");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
    }
  
}
