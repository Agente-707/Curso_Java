package c08_oop;

public class Composition{
      public static void main(String[] args){

            // Composición ("tiene un")

            /*
            A diferencia de la herencia, la composición
            se basa en que una clase se construya conteniendo
            instancias de otras clases
            */

            var car = new Car();
            car.on(); // Podemos acceder al motor desde el la clase Car

      }

      // Clase motor
      public static class Engine{
            public void on(){
                  System.out.println("Motor encendido");
            }
      }

      /*
      Si nosotros queremos que nuestro
      auto tenga un motor, podemos instanciar
      la clase Engine dentro de la clase Car
      */ 

      public static class Car{
            private Engine engine = new Engine(); // Intanciamos la clase del motor como un atributo privado
            public void on(){
                  engine.on(); // LLamamos al método on() que pertenece a la clase Engine
            }
      }
}
