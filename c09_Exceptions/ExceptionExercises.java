package c09_Exceptions;

public class ExceptionExercises{
     public static void main(String[] args){

          /*
          Alguno ejercicios sobre excepciones
          en Java
          */

          // 1. Divide dos números almacenados en dos variables. Maneja la division por cero con try-catch.
          // Solución:

          int a = 21, b = 0;

          try{
               var resultado = a/b;
               System.out.println(resultado);
          }catch(ArithmeticException e){
               System.out.println("Error: " + e);
          }

          System.out.println("La ejecución continúa");


          // 2. Crea un array con tres elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
          // Solución:

          String[] ciudades = {"Madrid", "Tokio", "Arequipa"};

          try{
               System.out.println(ciudades[5]);
          }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Error: " + e);
          }


          // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
          // Solución:

          String frase = null;

          try{
               System.out.println(frase.length());
          }catch(NullPointerException e){
               System.out.println("Error: " + e);
          }

          System.out.println("La ejecución continúa");


          // 4. Escribe una función que transforme texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
          
          System.out.println(transformar("12"));
          System.out.println(transformar("hola"));

          System.out.println("La ejecución continúa");


          // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
          // Solución:

          try{
               var resultado = a/b;
               System.out.println(resultado);
          }catch(ArithmeticException e){
               System.out.println("Error: " + e);
          }finally{
               System.out.println("La ejecución continúa");
          }
          

       
     }

     // Ejercicio 4: Solución:
     public static Integer transformar(String mensaje){

          try{
               return Integer.parseInt(mensaje);
          }catch(NumberFormatException e){
               System.out.println("Error: " + e);
               return null;
          }
     }
}
