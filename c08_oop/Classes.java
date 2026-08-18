package c08_oop;

public class Classes {
    public static void main(String[] args) {
        
        var person = new Person("Luis", 19); // Instanciamos la clase 'Person' con sus parametros

        // Ahora podemos acceder a las propiedades de nuestro objeto desde otro archivo

        person.sayHello();

        person.name = "Luis Pareja"; // Podemos modificar el valor de los atributos
        System.out.println(person.name);

        var person2 = new Person("Agente-707", 19); // Declaramos otro objeto de la misma clase 'Person'
        person2.sayHello();
    }
}


