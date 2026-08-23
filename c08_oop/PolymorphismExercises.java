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

          var imprimir = new Printer();

          imprimir.print(10);
          imprimir.print("Holaa");
          imprimir.print(19, "Hola, Java!");
          

          // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.

          var saludar = new Greeter();

          saludar.greet();
          saludar.greet("Luis");


          // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
          
          ArrayList<Vehicle> transportes = new ArrayList<>();

          transportes.add(new Car());
          transportes.add(new Bike());
          transportes.add(new Truck());

          for (Vehicle transporte:transportes){
               transporte.start();
          }


          // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

          var n = new SMSNotification();
          var m = new EmailNotification();
          sendNotification(n);
          sendNotification(m);

          // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.


          

          
          
     }

     // Ejercicio 1: Solución
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

     // Ejercicio 2: Solución
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

     // Ejercicio 3: Solución
     public static class Printer{
          public void print(String frase){
               System.out.println(frase);
          }

          public void print(int numero){
               System.out.println(numero);
          }

          public void print(int number, String frase){
               System.out.println("Frase: " + frase);
               System.out.println("Número: " + number);
          }
     }

     // Ejercicio 4: Solución
     public static class Greeter{
          public void greet(){
               System.out.println("Hello");
          }

          public void greet(String name){
               System.out.println("Hello, " + name);
          }
     }

     // Ejercicio 5: Solución
     public static class Vehicle{
          public void start(){
               System.out.println("Velocidad: ...");
          }
     }

     public static class Bike extends Vehicle{
          @Override
          public void start(){
               System.out.println("Velocidad: Medio");
          }
     }

     public static class Car extends Vehicle{
          @Override
          public void start(){
               System.out.println("Velocidad: Rapido");
          }
     }

     public static class Truck extends Vehicle{
          @Override
          public void start(){
               System.out.println("Velocidad: Lento");
          }
     }

     // Ejercicio 6: Solución
     public static class Notification{
          public void send(){
               System.out.println("Ha recibido una notificación de ...");
          }
     }

     public static class EmailNotification extends Notification{
          @Override
          public void send(){
               System.out.println("Ha recibido una notificación de Email");
          }
     }

     public static class SMSNotification extends Notification{
          @Override
          public void send(){
               System.out.println("Ha recibido una notificación de SMS");
          }
     }

     public static void sendNotification(Notification n){
          n.send();
     }


    
}
