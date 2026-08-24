package c08_oop;

public class AbstractionExercises{
      public static void main(String[] args){
    
            /*
            Algunos ejercicios de Abstraccion
            en POO.
            */

            // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.

            var circulo = new Circle(5);
            var rectangulo = new Rectangle(10,20);

            System.out.println("Área del circulo: " + circulo.calculateArea());
            System.out.println("Área del rectangulo: " + rectangulo.calculateArea());


            // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.

            var guitarra = new Guitar();
            var piano = new Piano();

            guitarra.instrument();
            piano.instrument();

            guitarra.play();
            piano.play();


            // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.

            Animal[] animales = {new Dog(), new Cat()};

            for(Animal animal:animales){
                  animal.makeSound();
            }


            // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
            
            var circulo2 = new Circle2();
            var cuadrado = new Square();
            var triangulo = new Triangle();

            circulo2.draw();
            cuadrado.draw();
            triangulo.draw();


            // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.

            var tiempoExtra = new FullTimeEmployee(5);
            var tiempoBasico = new PartTimeEmployee(4);

            System.out.println(tiempoExtra.calculateSalary());
            System.out.println(tiempoBasico.calculateSalary());

            
            // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.

            var robot = new Robot();
            var car = new Car();

            car.move();
            robot.move();


            // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

            var lavadora = new WashingMachine();
            var tv = new TV();

            lavadora.turnOn();
            lavadora.turnOff();

            tv.turnOn();
            tv.turnOff();

            
            // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.

            var pato = new Duck();

            pato.fly();
            pato.swim();


            // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.

            var documento1 = new PDFDocument();
            var documento2 = new WordDocument();

            documento1.print();
            documento2.print();

            
      }

      // Ejercicio 1: Solución
      public static abstract class Shape{
            public abstract double calculateArea();
      }

      public static class Circle extends Shape{
            double radio;
            public Circle(double radio){
                  this.radio=radio;
            }

            @Override
            public double calculateArea(){
                  return radio*radio*Math.PI;
            }
      }

      public static class Rectangle extends Shape{
            double width;
            double height;

            public Rectangle(double width, double height){
                  this.width=width;
                  this.height=height;
            }

            @Override
            public double calculateArea(){
                  return width*height;
            }
      }

      // Ejercicio 2: Solución
      public interface Playable{
            void play();
      }

      public static class Instrument{
            public void instrument(){
                  System.out.println("El instrumento es ...");
            }
      }

      public static class Guitar extends Instrument implements Playable{

            @Override
            public void instrument(){
                  System.out.println("Este instrumento es una guitarra");
            }

            @Override
            public void play(){
                  System.out.println("Es un instrumento de cuerdas");
            }
      }

      public static class Piano extends Instrument implements Playable{

            @Override
            public void instrument(){
                  System.out.println("Este instrumento es un piano");
            }

            @Override
            public void play(){
                  System.out.println("Es un instrumento de teclas");
            }
      }

      // Ejercicio 3: Solución
      public static abstract class Animal{
            public abstract void makeSound();
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

      // Ejercicio 4: Solución
      public interface Drawable{
            void draw();
      }

      public static class Circle2 implements Drawable{
            @Override
            public void draw(){
                  System.out.println("  --- ");
                  System.out.println(" /   \\");
                  System.out.println("|     |");
                  System.out.println(" \\   /");
                  System.out.println("  ---  ");
            }
      }

      public static class Square implements Drawable{
            @Override
            public void draw(){
                  System.out.println("-----");
                  System.out.println("|   |");
                  System.out.println("|   |");
                  System.out.println("-----");
            }
      }

      public static class Triangle implements Drawable{
            @Override
            public void draw(){
                  System.out.println("   /\\   ");
                  System.out.println("  /  \\  ");
                  System.out.println(" /    \\ ");
                  System.out.println(" ----- ");
            }
      }

      // Ejercicio 5: Solución
      public static abstract class Employee{
            public abstract double calculateSalary();
      }

      public static class FullTimeEmployee extends Employee{
            double extraTime;
            public FullTimeEmployee(double extraTime){
                  this.extraTime = extraTime;
            }

            @Override
            public double calculateSalary(){
                  return 100 + (extraTime*20);
            }
      }

      public static class PartTimeEmployee extends Employee{
            double basicTime;
            public PartTimeEmployee(double basicTime){
                  this.basicTime=basicTime;
            }

            @Override
            public double calculateSalary(){
                  return 100 - (basicTime*5);
            }
      }
      
      // Ejercicio 6: Solución
      public interface Movable{
            void move();
      }

      public static class Car implements Movable{
            @Override
            public void move(){
                  System.out.println("El auto se mueve con sus cuatro llantas");
            }
      }

      public static class Robot implements Movable{
            @Override
            public void move(){
                  System.out.println("El robot se mueve con sus articulaciones");
            }
      }

      // Ejercicio 7: Solución
      public static abstract class Appliance{
            public abstract void turnOn();
            public abstract void turnOff();
      }

      public static class TV extends Appliance{
            public void turnOn(){
                  System.out.println("La TV se enciende");
            }

            public void turnOff(){
                  System.out.println("La TV se apaga");
            }
      }

      public static class WashingMachine extends Appliance{
            public void turnOn(){
                  System.out.println("La lavadora se enciende");
            }

            public void turnOff(){
                  System.out.println("La lavadora se apaga");
            }
      }

      // Ejercicio 8: Solución
      public interface Flyable{
            void fly();
      }

      public interface Swimmable{
            void swim();
      }

      public static class Duck implements Flyable, Swimmable{
            public void fly(){
                  System.out.println("El pato vuela con sus alas");
            }

            public void swim(){
                  System.out.println("El pato nada con sus patas palmeadas");
            }
      }

      // Ejercicio 9: Solución
      public static abstract class Document{
            public abstract void print();
      }

      public static class PDFDocument extends Document{
            @Override
            public void print(){
                  System.out.println("Imprimiendo documento en formato PDF");
            }
      }

      public static class WordDocument extends Document{
            @Override
            public void print(){
                  System.out.println("Imprimiendo documento de Word");
            }
      }
      


      




}
