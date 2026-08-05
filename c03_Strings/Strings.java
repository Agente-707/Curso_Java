package c03_Strings;

public class Strings {
    public static void main(String[] args){
        // Cadenas de texto

        String user_name = "Agente-707";
        var name = new String("Luis"); // Sintaxis redundante

        // Concatenacion
        System.out.println(user_name + " " + name);
        System.out.println("Mi nombre de usuario es: " + user_name + " y mi nombre real es " + name);

        // Length
        System.out.println(name.length()); // => 4
        System.out.println(user_name.length()); // => 10
        // Devuelve la cantidad de caracteres del string

        // charAt
        // Devuelve el caracter en la posicion que le mandes
        // la primera posicion de los strings en java es el 0
        System.out.println(name.charAt(0)); // => L
        System.out.println(name.charAt(1)); // => u
        System.out.println(name.charAt(2)); // => i
        System.out.println(name.charAt(3)); // => s
        //System.out.println(name.charAt(4)); => Error el indice 4 no se encuentra dentro de nustro string
        
        

    }
}
