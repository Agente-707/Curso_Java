package c08_oop;

import c08_oop.InheritanceExercises;

import java.util.ArrayList;
import java.util.List;

public class InheritanceExercises {
    public static void main(String[] args){

        /*
        Algunos ejercicios de Herencia
        en POO.
        */

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().

        var auto = new Car();

        auto.move();
        auto.honk();


        // 2. Define una clase Person con los atributos name y age. Luego crea clase Student que agregue el atributo grade y un método study().

        var estudiante = new Student();

        estudiante.name = "Pedro";
        estudiante.age = 19;  
        estudiante.grade = 20.00;

        estudiante.study();


        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Woof" y Cat diga "Meow" sobrescribiendo ese método.

        var gato = new Cat();
        var perro = new Dog();

        perro.makeSound();
        gato.makeSound();


        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

        var empleado = new Manager();

        empleado.name = "Hector";
        empleado.salary = 120;
        empleado.department = "302";

        empleado.información();


        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.

        var circulo = new Circle(10);
        var rectangulo = new Rectangle(5, 4);

        var areaCirculo = circulo.calculateArea();
        var areaRectangulo = rectangulo.calculateArea();

        System.out.println(areaCirculo);
        System.out.println(areaRectangulo);

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobre escriba fly() pero también llame al método original con super.fly().

        var ave = new Bird();
        var aguila = new Eagle();

        ave.fly();
        aguila.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.

        var telefono = new Phone();

        
        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().

        var cuenta = new SavingsAccount();
        cuenta.balance = 120;
        cuenta.interestRate = 50;
        cuenta.deposit(20);
        cuenta.withDraw(30);

        cuenta.addInterest();


        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.

        var carro = new Car2();
        var bici = new Bike();
        var camion = new Truck();

        carro.describe();
        bici.describe();
        camion.describe();


        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
         // Ejercicio 10: Solución

        List<Animal> animales = new ArrayList<>();
        animales.add(new Dog());
        animales.add(new Cat());
        animales.add(new Bird2());

        for(Animal animal:animales){
            animal.makeSound();
        }


    }

    // Ejercicio 1: Solución
    public static class Vehicle{
        public void move(){
            System.out.println("El vehículo está en movimiento");
        }

        public void describe(){}
    }

    public static class Car extends Vehicle{
        public void honk(){
            System.out.println("La bocina está sonando");
        }
    }


    // Ejercicio 2: Solución
    public static class Person{
        String name;
        int age;
    }

    public static class Student extends Person{
        Double grade;

        public void study(){
            System.out.println("El alumno " + name + " está estudiando para sacar " + grade + " en el examen.");
        }
    }

    // Ejercicio 3: Solución
    public static class Animal{

        public void makeSound(){
            System.out.println("Este animal hace ...");
        }

    }

    public static class Dog extends Animal{

        @Override
        public void makeSound(){
            System.out.println("Este animal hace Woof");
        }
    }

    public static class Cat extends Animal{

        @Override
        public void makeSound(){
            System.out.println("Este animal hace Meow");
        }

    }

    public static class Bird2 extends Animal{
        @Override
        public void makeSound(){
            System.out.println("Este animal hace Pio Pio");
        }
    }


    // Ejercicio 4: Solución
    public static class Employee{
        String name;
        double salary;
    }

    public static class Manager extends Employee{
        String department;

        public void información(){
            System.out.println("El empleado " + name + " es manager del departamento " + department + " y tiene un salario de $" + salary );
        }
    }

    // Ejercicio 5: Solución
    public abstract static class Shape{
        public abstract double calculateArea(); // Método abstrato: El contenido solo se implementa desde las subclases
    }

    public static class Circle extends Shape{

        double radio;

        public Circle(double radio){
            this.radio = radio;
        }

        @Override
        public double calculateArea(){
            return Math.PI * radio * radio;
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
        public double calculateArea(){
            return width * height;
        }
    }

    // Ejercicio 6: Solución
    public static class Bird{
        public void fly(){
            System.out.println("El ave está volando");
        }
    }

    public static class Eagle extends Bird{
        @Override
        public void fly(){
            super.fly();
            System.out.println("Esa ave es un águila");
        }
    }

    // Ejercicio 7: Solución
    public static class Device{
        public Device(){
            System.out.println("Device created");
        }
    }

    public static class Phone extends Device{
        public Phone(){
            System.out.println("Phone ready");
        }
    }

    // Ejercicio 8: Solución
    public static class Account{
        double balance;

        public void deposit(double amount){
            balance = balance + amount;
            System.out.println("Balance = $" + balance);
        }

        public void withDraw(double amount){
            balance = balance - amount;
            System.out.println("Balance = " + balance);
        }
    }

    public static class SavingsAccount extends Account{
        double interestRate;

        public void addInterest(){
            double interest = balance * interestRate;
            balance = balance + interest;
            System.out.println("Interés agregado: $" + interest); 
        }
    }

    // Ejercicio 9: Solución
    public static class Car2 extends Vehicle{

        @Override
        public void describe(){
            System.out.println("El auto es un medio de transporte que funciona con combustible");
        }

    }

    public static class Bike extends Vehicle{
        @Override
        public void describe(){
            System.out.println("La bicicleta es una medio de transporte ligero que funciona con pedales");
        }
    }

    public static class Truck extends Vehicle{
        @Override
        public void describe(){
            System.out.println("El camión es un vehículo de carga bastante pesado");
        }
    }

   



    




}
