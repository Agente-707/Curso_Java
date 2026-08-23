package c07_Functions;

import java.util.Arrays;
import java.util.ArrayList;

public class Functions {
    public static void main(String[] args){

        // Funciones

        // Forma tradicional
        
        System.out.println("Se envía el email");
        

        // Usando funciones
        
        sendEmail(); // Llamamos a la función
        

        // Llamamos a una función con parametros

        sendEmailToUser("luis@gmail.com"); 

        sendEmailToUser("luis@gmail.com", "Luis");

        /*
        Nota: 
        Las dos funciones tienen el mismo
        nombre pero se diferencian en la 
        cantidad de parametros con las que
        operan.
        Si quisieramos crear dos funciones
        con el mismo nombre y la misma 
        cantidad de parametros nos daría error.
        */

        var users = new ArrayList<>(Arrays.asList("Luis", "pareja", "Agente-707")); // Definimos el ArrayList
        sendEmailToUser(users);

        var state = sendEmailWithState("luis@gmail.com"); 
        /*
        Nota:
        Como nuestra función senEmailWithState()
        nos retorna 'true' o 'false' lo podemos 
        asignar a una variable
        */
        System.out.println(state); // => true

    }

    /*
    Nota:
    Las funciones se establecen
    fuera de la función main
    */


    // Estructura de la función (sin parametros):
    public static void sendEmail(){ // Función estatica vacía (No le pasamos parametros y no retorna nada)
        System.out.println("Se envía el email");
    }

    // Estructura de la función (con parametros):
    public static void sendEmailToUser(String email){ // parametro: String email
        System.out.println("Se envía el email a " + email);
    }

    // Función con el mismo nombre pero con dos parametros
    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envía el email a " + name + " (" + email + ")");
    }

    // Función con un ArrayList como parametro
    public static void sendEmailToUser(ArrayList<String> emails){ // Recibe un ArrayList de Strings como parametro
        for (String email: emails){
            System.out.println("Se envía el email a " + email);
        }
    }

    // Función con retorno
    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()){ // Si el email no existe, la función nos retorna falso
            return false;
            // La función acaba cuando nos retorna algo
            // Si la condición se cumple la función nos retornara false y omitira lo que le sigue
        }


        // si la condición no se cumple, se ejecutara lo siguiente
        System.out.println("Se envía el email a " + email);
        return true; 
        
    }
}
