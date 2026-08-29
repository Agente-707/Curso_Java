package c10_Extras;

import java.util.Scanner;

public class ExtrasExercises {

    static String message = "Inicio del curso :)";
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


    }
}
