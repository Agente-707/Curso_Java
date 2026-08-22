package c08_oop;

public class Polymorphism {
    public static void main(String[] args){

        // Polimorfismo

        /*
        El polimorfismo es la capacidad
        de un método de comportarse de
        diferentes maneras segun el contexto
        en el cual se aplique
        */

        // - Polimorfismo por herencia (sobrescritura)

        var animal = new Animal();
        animal.sound(); // => "Algún sonido"
        var dog = new Dog();
        dog.sound(); // => "Woof"

        // - Polimorfismo por sobrecarga (sobrecarga de métodos)

        var calculator = new Calculator();
        System.out.println(calculator.sum(3,5)); // Le pasamos valores enteros
        System.out.println(calculator.sum(3.4,5.7)); // Le pasamos valores decimales

    }

    // - Polimorfismo por herencia (sobrescritura)

    public static class Animal{
        public void sound(){
            System.out.println("Algún sonido");
        }
    }

    // Dog hereda de Animal
    public static class Dog extends Animal{
        @Override // Redefinimos el funcionamiento de sound()
        public void sound(){
            System.out.println("Woof"); 
        }

        /*
        Nota:
        Con @Override podemos sobrescribir
        el funcionamiento del metodo sound()
        de la clase Animal.

        Ahora para el caso de Dog el método
        Sound() actuara de diferente manera.
        */
    }

    // ----------------------------------------------------------------

    // - Polimorfismo por sobrecarga (sobrecarga de métodos)

    public static class Calculator {
        public int sum(int a, int b){
            return a + b; // Retorna enteros
        }

        public double sum(double a, double b){
            return a + b; // Retorna decimales
        }

        /*
        Nota:
        Ambos métodos llevan el mismo nombre
        pero reciben y retornan variables de
        diferente tipo.

        Al momento de llamar a este método se 
        ejecutara dependiendo de las variable 
        que les pasemos
        */
    }
}
