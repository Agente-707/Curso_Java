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
      
}
