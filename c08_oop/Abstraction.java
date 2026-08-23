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

        
    }

    // - Clase abstracta

    public static abstract class Animal{

        public void sleep(){
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal{
        
    }

    public static class Cat extends Animal{
        
    }
}
