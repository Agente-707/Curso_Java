package c07_Functions;

public class FunctionsExercises{
  public static void main (String[] args){

    /*
    Algunos ejercicios simples 
    con funciones
    */

    // 1. Crea una función que imprima ¡Te doy la bienvenida al curso de Java desde cero!

    bienvenida();


    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

    String name;
    name = "Agente-707";
    saludo(name);


    // 3. Establezca una función que reciba dos números enteros y devuelva su resta.
    
    int a, b;
    a = 12;
    b = 55;
    restaPositiva(a,b);


    // 4. Crea una función que calcule el cuadrado de un número (n x n).

    int n;
    n = 5;
    cuadrado(n);


    // 5. Escribe una función que reciba un número y diga si es par o impar.

    int x;
    x = 4;
    parImpar(x);


    // 6. Crea una función que reciba una edad y retorne 'true' si es mayor de edad y 'false' en el caso contrario.

    // 7. Implementa una función que reciba una cadena y retorne su longitud.

    // 8. Crea una función que reciba un Array de enteros, calcula su media y lo retorna.

    // 9. Escriba una función que reciaba un número y retorna su factorial.

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    
  }

  // 1. Solución:
  public static void bienvenida(){
    System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
  }

  // 2. Solución:
  public static void saludo(String name){
    System.out.println("Hola, mucho gusto en conocerte " + name);
  }

  // 3. Solución:
  public static void restaPositiva(int a, int b){
    if(a - b < 0){
      System.out.println(b - a);
    }else{
      System.out.println(a - b);
    }
  }

  // 4. Solución:
  public static void cuadrado(int n){
    System.out.println(n * n);
  }

  // 5. Solución:
  public static void parImpar(int x){
    if(x % 2 == 0){
      System.out.println(String.format("El número %d es par.", x));
    } else{
      System.out.println(String.format("El número %d es impar.", x));
    }
  }


}
