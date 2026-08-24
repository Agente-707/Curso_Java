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
}
