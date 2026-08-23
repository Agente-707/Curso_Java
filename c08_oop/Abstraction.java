package c08_oop;

public class Abstraction {
    public static void main(String[] args){

        // Abstracción

        // - Clase abstracta

        
        // var animal = new Animal(); => Error: La clase Animal es abstracta, no se puede instanciar
        // animal.sleep();

        var perro = new Dog();
        perro.sleep();

        var gato = new Cat();
        gato.sleep();

        /*
        Nota:
        Solo podemos llamar a las subclases
        que heredan de la clase abstracta
        */

        
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

        
    }

    public static class Cat extends Animal{
        
    }
}
