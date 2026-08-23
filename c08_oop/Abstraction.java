package c08_oop;

public class Abstraction {
    public static void main(String[] args){

        // Abstracción

        // - Clase abstracta

        
        // var animal = new Animal(); => Error: La clase Animal es abstracta, no se puede instanciar
        // animal.sleep();

        /*
        Nota:
        Solo podemos llamar a las subclases
        que heredan de la clase abstracta
        */

        var perro = new Dog();
        perro.sleep();
        perro.sound();

        var gato = new Cat();
        gato.sleep();
        gato.sound();



        

        
    }

    // - Clase abstracta

    public static abstract class Animal{

        // Definimos el método abstracto sound()
        public abstract void sound();

        /*
        Nota:
        El método abstracto sound() no tiene
        una estructura definida al cual 
        podamos sobrescribir desde una subclase,
        pero obligatoriamente debemos definirla
        desde todas las subclases de Animal
        */

        // Definimos el método sleep()
        public void sleep(){
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void sleep(){
            System.out.println("El perro está durmiendo");
        }

        @Override
        public void sound(){
            System.out.println("Woof");
        }
        
    }

    public static class Cat extends Animal{
        @Override
        public void sound(){
            System.out.println("Meow");
        }
    }

    // - Interface

    public interface Flying {
        void fly(); // Método fly() en la interface
    }

    /*
    Nota:
    Si nosotros queremos implementar el
    método fly() solo para las subclases
    Bird y Bad (ya que estos son animales
    voladores a diferencia de Dog y Cat),
    debemos utilizar 'interface' e implementarlo
    a las subclases Bird y Bad.
    */

    public static class Bird extends Animal implements Flying{ // Implementamos la interface Flying a Bird

        @Override
        public void sound(){
            System.out.println("Pio pio");
        }

        @Override
        public void fly(){
            System.out.println("El pajaro vuela");
        }

        
    }

    public static class Bat extends Animal implements Flying{ // Implementamos la interface Flying a Bat
        @Override
        public void sound(){
            System.out.println("Soy batman!");
        }

        @Override
        public void fly(){
            System.out.println("El muerciélago vuela");
        }
    }
}


