package c08_oop;

public class Classes {
    public static void main(String[] args) {
        
        var person = new Person(); // Instanciamos la clase 'Person'

        // Ahora podemos acceder a las propiedades de nuestro objeto

        person.name = "Luis";
        person.age = 19;

        person.sayHello();
    }
}


