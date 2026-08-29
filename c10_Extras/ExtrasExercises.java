package c10_Extras;

import java.util.Scanner;
import java.util.Random;

public class ExtrasExercises {

    static String message = "Inicio del curso :)";
    static String saludo = "Hola, mundo!";
    static String username = "Agente-707";
    public static void main(String[] args){

        /*
        Algunos ejercicios simples 
        de extras en Java.
        */

        // 1. Crea una variable tipo String como null y verifíca que no esté vacía antes de usarla.
        // Solución:

        String palabra = null;

        try{
            System.out.println(palabra.toUpperCase());
        }catch(NullPointerException e){
            System.out.println("Error: " + e);
        }


        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        // Solución:

        var scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        var name = scanner.next();

        System.out.println("Ingrese su edad:");
        var age = scanner.nextInt();

        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age); 


        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        // Solución:

        final int MAX_SCORE = 100;
        System.out.println("Puntaje más alto es: " + MAX_SCORE);


        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        // Solución:

        String message = "Fin del curso :,)";

        System.out.println(ExtrasExercises.message);
        System.out.println(message);


        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        // Solución:

        System.out.println("Digite un número:");
        var number = scanner.nextInt();

        if(number>=0){
            System.out.println("El número " + number + " es positivo");
        }else{
            System.out.println("El número " + number + " es negativo");
        }


        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        
        saludar();


        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        // Solución:

        Random random = new Random();

        System.out.println(random.nextInt(10) + 1);


        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        
        var operacion = new Operaciones(10, 5); // Instanciamos el objeto

        // Llamamos a los métodos 
        operacion.suma();
        operacion.resta();
        operacion.multiplicar();
        operacion.division();


        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.

        var usuario = new User();
        usuario.informacion();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.


    }

    
    // Ejercicio 6: Solución
    public static void saludar(){
        System.out.println(saludo);
    }

    // Ejercicio 8: Solución
    public static class Operaciones{

        // Atributos de la clase
        int a;
        int b;
        
        // Constructor
        public Operaciones(int a, int b){
            // Valor de los atributos igual al de los parametros del constructor
            this.a=a;
            this.b=b;
        }

        // método suma
        public void suma(){
            System.out.println(a + b); // => Imprime la suma
        }

        // método resta
        public void resta(){
            System.out.println(a - b); // => Imprime la resta
        }

        // método multiplicar
        public void multiplicar(){
            System.out.println(a * b); // => Imprime la multiplicación 
        }

        // método división
        public void division(){
            System.out.println(a / b); // => Imprime la división
        }

    }

    // Ejercicio 9: Solución
    public static class User{
        public static final String APP_NAME = "Whatsapp";

        public void informacion(){
            System.out.println("Aplicación: " + APP_NAME);
            System.out.println("Usuario: " + username);
        }
        
    }
}
