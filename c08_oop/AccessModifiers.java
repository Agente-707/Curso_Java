package c08_oop;

public class AccessModifiers {
    
    public static void main(String[] args){

        /* 
        Encapsulamiento (modificadores de acceso)


        Los modificadores de acceso sirven para
        controlar la visibilidad y el nivel de 
        encapsulamiento de los atributos, métodos
        y constructtores en una clase.


        - public: 
        Usamos 'public' para identificar un 
        elemento que es accesible desde cualquier 
        otra clase.

        - private:
        Un elemento que es privado solo es accesible
        desde la misma clase donde fue definido.

        - protected:
        El elemento protegido es accesible por cualquier
        otra clase dentro del mismo paquete y tambien por
        clases hijas, incluso si se encuentra en paquetes diferentes

        - (default)
        */

        var otherPerson = new OtherPerson("Luis", 19, "123456789A");

        otherPerson.sayHello();

        otherPerson.name = "Luis Pareja"; // Podemos modificar el atributo protegido 'name' 
        System.out.println(otherPerson.name);


        /*
        - getters:
        Son métodos los cuales retornan 
        el valor de un elemento privado.
        
        - setters:
        Es un método que recibe un parametro
        y asigna un nuevo valor a un elemento privado.
        */

        
    }
}
