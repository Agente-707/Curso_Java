package c08_oop;

public class Inheritance{
     public static void main(String[] args){

          // Herencia

          var animal = new Animal("Mi animal");
          //animal.name = "Mi animal";
          animal.eat();

          var perro = new Dog("Apolo");
          //perro.name = "Apolo";
          perro.eat();

          var gato = new Cat("Chetos");
          //gato.name = "Chetos";
          gato.eat();

          /*
          Nota:
          Como Dog y Cat heredan de Animal,
          estos cuentan con los atributos
          y métodos que hay en la clase 
          Animal, ya no hace falta definirlos
          en cada clase
          */

          var bird = new Bird("Fenix");
          //bird.name = "Fenix";
          bird.eat();
          bird.fly();
     }

     // Clase Animal
     public static class Animal{
          String name;

          // Constructor de la clase Animal
          public Animal(String name){
               this.name = name;
          }

          public void eat(){
               System.out.println("El animal con nombre " + name + " está comiendo");
          }
     }

     // Dog hereda de Animal
     public static class Dog extends Animal {

          // Constructor de la clase Dog
          public Dog(String name) {
               super(name);
          }

          public void eat() {
              super.eat(); // 'super' hace referencia a la clase madre 'Animal'
          }
     }

     // Cat hereda de Animal
     public static class Cat extends Animal {

          // Constructor de la clase Cat
          public Cat(String name) {
               super(name);
          }

     }

     // bird hereda de Animal
     public static class Bird extends Animal {

          // Constructor de la clase Bird
          public Bird(String name) {
               super(name);
          }

          public void fly(){
               System.out.println();
          }
          // Este método es único de la clase Bird
          // Ninguna otra clase puede usar este método
     }

}
