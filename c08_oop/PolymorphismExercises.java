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

          var animal = new Dog();
          var animal2 = new Cat();
          var animal3 = new Horse();

          showAnimalType(animal);
          showAnimalType(animal2);
          showAnimalType(animal3);


          // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.

          var texto = new Converter();

          texto.convert(01101000);
          texto.convert(01101111);
          texto.convert(01101100);
          texto.convert(01100001);
          texto.convert("Hola");
          texto.convert(12345.54321);


          // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.

          ArrayList<Product> productos = new ArrayList<>();

          productos.add(new Book());
          productos.add(new Electronic());

          for(Product producto:productos){
               producto.getPrice();
          }


          // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.

          Character[] personajes = {new Warrior(), new Archer(), new Mage()};
          for(Character personaje:personajes){
               personaje.attack();
          }

     }

     // Ejercicio 1: Solución
     public static class Animal{
          public void makeSound(){
               System.out.println("Algún sonido");
          }

          public void getType(){
               System.out.println("El animal es un ...");
          }
     }

     public static class Dog extends Animal{
          @Override
          public void makeSound(){
               System.out.println("Woof");
          }

          @Override
          public void getType(){
               System.out.println("El animal es un perro");
          }
     }

     public static class Cat extends Animal{
          @Override
          public void makeSound(){
               System.out.println("Meow");
          }

          @Override
          public void getType(){
               System.out.println("El animal es un gato");
          }
     }

     public static class Cow extends Animal{
          @Override
          public void makeSound(){
               System.out.println("Muuu");
          }
     }

     public static class Horse extends Animal{
          @Override
          public void getType(){
               System.out.println("El animal es un caballo");
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

     // Ejercicio 7: Solución
     public static void showAnimalType(Animal animal){
          animal.getType();
     }

     // Ejercicio 8: Solución
     public static class Converter{
          public void convert(int texto){
               System.out.println(texto);
          }
          
          public void convert(double texto){
               System.out.println(texto);
          }

          public void convert(String texto){
               System.out.println(texto);
          }
     }

     // Ejercicio 9: Solución
     public static class Product{
          public void getPrice(){
               System.out.println("Aplicando descuento");
          }

     }

     public static class Book extends Product{
          @Override
          public void getPrice(){
               double price = 40;
               System.out.println("Precio del libro: " + price);
               double desc = price - price*0.3;
               System.out.println("Descuento del 30%: " + desc);
          }
     }

     public static class Electronic extends Product{
          @Override
          public void getPrice(){
               double price = 1200;
               System.out.println("Precio del celular: " + price);
               double desc = price - price*0.2;
               System.out.println("Descuento del 20%: " + desc);
          }
     }

     // Ejercicio 10: Solución
     public static class Character{
          public void attack(){
               System.out.println("Lanza un ataque");
          }
     }

     public static class Warrior extends Character{
          @Override
          public void attack(){
               System.out.println("El guerrero usa su espada, hace +30 de daño");
          }
     }

     public static class Archer extends Character{
          @Override
          public void attack(){
               System.out.println("El arquero dispara una flechas, hace +20 de daño");
          }
     }

     public static class Mage extends Character{
          @Override
          public void attack(){
               System.out.println("El mago le pregunta a chatGPT como vencer al enemigo, hace -1000 de aura"); //xd
          }
     }
}
