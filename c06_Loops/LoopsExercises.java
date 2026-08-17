package c06_Loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises{
  public static void main(String[] args){
    /*
    Algunos ejercicios simples
    de bucles
    */

    // 1. Imprime los números del 1 al 10 usando while.
    // Solución:

    int index = 1;

    while(index <= 10){
      System.out.println(index);
      index++;
    }


    // 2. Usa do-while para mostrar todos los valores de un ArrayList.
    // Solución:

    int i=0;
    ArrayList<String> names = new ArrayList<>();
    names.add("Luis");
    names.add("Pareja");
    names.add("Agente-707");

    do{

      System.out.println(names.get(i));
      i++;

    }while(i<names.size());


    // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
    // Solución:

    for(index = 1; index<=50; index++){
      if(index % 5 == 0){
        System.out.println(index);
      }
    }


    // 4. Recorre un Array de 5 números e imprime la suma total.
    // Solución:

    int[] numbers = {4,5,1,23,1,6,43}; 
    int suma=0;

    for(index=0; index<numbers.length; index++){
      suma += numbers[index]; 
    }

    System.out.println(suma);


    // 5. Usa un for para recorrer un Array y mostrar sus valores.
    // Solución:

    for(index=0; index<numbers.length; index++){
      System.out.println(numbers[index]); 
    }

    
    // 6. Usa un for-each para recorrer un HashSet y un HashMap.
    // Solución:

    HashSet<String> juegos = new HashSet<>();
    HashMap<String, Integer> frutas = new HashMap<>(); 

    juegos.add("God of War");
    juegos.add("Hollow Knight");
    juegos.add("Roblox");
    juegos.add("Stardew Valley");

    frutas.put("uvas", 45);
    frutas.put("manzanas", 12);
    frutas.put("peras", 23);
    frutas.put("platanos", 11);

    for(String juego: juegos){
      System.out.println(juego);
    }

    for(Map.Entry<String, Integer> fruta: frutas.entrySet()){
      System.out.println(fruta.getKey());
      System.out.println(fruta.getValue());
    }


    // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
    // Solución:

    for(index=10; index>=1; index--){
      System.out.println(index);
    }


    // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
    // Solución:

    for(index = 1; index <= 20; index++){
      if(index % 3 != 0){
        System.out.println(index);
      }
    }


    // 9. Usa break para un bucle cuando encuentres un número negativo en un Array.
    // Solución:

    int[] Numbers = {3, 1, 4, -5, 2, 8};

    for(index = 0; index < Numbers.length; index++){
      if(Numbers[index] < 0){
        break;
      }

      System.out.println(Numbers[index]);
    }


    // 10. Crea un programa que calcule el factorial de un número dado.
    // Solución:

    int x = 5;
    int fact = 1;

    for(index = 1; index <= x; index++){
      fact *= index;
    }

    System.out.println(String.format("El factorial de %d es: %d", x, fact));
    
  }
}
