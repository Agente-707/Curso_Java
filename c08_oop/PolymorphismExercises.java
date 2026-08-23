package c08_oop;

import java.util.ArrayList;

public class PolymorphismExercises{
     public static void main(String[] args){
          /*
          Algunos ejercicios sobre 
          polimorfismo en POO.
          */

          // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.

          ArrayList<Animal> animales = new ArrayList<>();

          animales.add(new Dog());
          animales.add(new Cat());
          animales.add(new Cow());

          for(Animal animal:animales){
               animal.makeSound();
          } 


          // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.

          ArrayList<Shape> formas = new ArrayList<>();

          formas.add(new Circle(5));
          formas.add(new Circle(14));
          formas.add(new Rectangle(3,4));
          formas.add(new Rectangle(20, 10));

          for(Shape forma:formas){
               System.out.println(forma.calcularArea());
          }


          // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.

          // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.

          // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
          
     }

     public static class Animal{
          public void makeSound(){
               System.out.println("Algún sonido");
          }
     }

     public static class Dog extends Animal{
          @Override
          public void makeSound(){
               System.out.println("Woof");
          }
     }

     public static class Cat extends Animal{
          @Override
          public void makeSound(){
               System.out.println("Meow");
          }
     }

     public static class Cow extends Animal{
          @Override
          public void makeSound(){
               System.out.println("Muuu");
          }
     }

     public abstract static class Shape{
          public abstract double calcularArea();
     }

     public static class Circle extends Shape{
          double radio;

          public Circle(double radio){
               this.radio = radio;
          }

          @Override
          public double calcularArea(){
               return(radio * radio * Math.PI);
          }
     }

     public static class Rectangle extends Shape{
          double width;
          double height;

          public Rectangle(double width, double height){
               this.width = width;
               this.height = height;
          }

          @Override
          public double calcularArea(){
               return(width*height);
          }
     
     }
    
}
