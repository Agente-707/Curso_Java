package c07_Functions;

import java.util.Arrays;
import java.util.ArrayList;

public class FunctionsExercises{
  public static void main (String[] args){

    /*
    Algunos ejercicios simples 
    con funciones
    */

    // 1. Crea una función que imprima ¡Te doy la bienvenida al curso de Java desde cero!

    bienvenida();


    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

    String name = "Agente-707";
    saludo(name);


    // 3. Establezca una función que reciba dos números enteros y devuelva su resta.
    
    int a, b;
    a = 12;
    b = 55;
    restaPositiva(a,b);


    // 4. Crea una función que calcule el cuadrado de un número (n x n).

    int n = 5;
    cuadrado(n);


    // 5. Escribe una función que reciba un número y diga si es par o impar.

    int x = 4;
    parImpar(x);


    // 6. Crea una función que reciba una edad y retorne 'true' si es mayor de edad y 'false' en el caso contrario.

    boolean esMayorDeEdad = mayorDeEdad(19);
    System.out.println(esMayorDeEdad);


    // 7. Implementa una función que reciba una cadena y retorne su longitud.

    String frase = "Ya no somos los de antes, somos lo de ahora en adelante";
    int lon = longitud(frase);
    System.out.println(lon);


    // 8. Crea una función que reciba un Array de enteros, calcula su media y lo retorna.

    int[] numbers = {12, 34, 10, 23, 54, 29, 40, 29};
    double y = media(numbers);
    System.out.println(y);


    // 9. Escriba una función que reciba un número y retorna su factorial.

    int number = 5;
    int fact = factorial(number);
    System.out.println(fact);


    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    var empresas = new ArrayList<>(Arrays.asList("Apple", "Samsung", "Microsoft", "Amazon", "Alicorp"));
    arraylist(empresas);

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

  // 6. Solución:
  public static boolean mayorDeEdad(int edad){
    if(edad>=18){
      System.out.println("El usuario es mayor de edad.");
      return true;
    }

    System.out.println("El usuario es menor de edad.");
    return false;
    
  }

  // 7. Solución:
  public static int longitud(String frase){
    return frase.length();
  }

  // 8. Solución:
  public static double media(int[] numbers){
    double media;
    int suma=0;

    for(int i=0;i<numbers.length;i++){
      suma = suma + numbers[i];
    }

    media = suma / numbers.length;

    return media;
  }

  // 9. Solución:
  public static int factorial(int number){
    int fact = 1;

    for(int i=1;i<=number;i++){
      fact = fact * i;
    }

    return fact;
  }

  // 10. Solución:
  public static void arraylist(ArrayList<String> numeros){ 
    for (String num: numeros){
      System.out.println(num);
    }
  } 

}
