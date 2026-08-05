package c03_Strings;

public class Strings {
    public static void main(String[] args){
        // Cadenas de texto

        String user_name = "Agente-707";
        var name = new String("Luis"); // Sintaxis redundante

        // Concatenacion
        // Combina varios strings en uno solo
        System.out.println(user_name + " " + name);
        System.out.println("Mi nombre de usuario es: " + user_name + " y mi nombre real es " + name);

        // length
        // Devuelve la cantidad de caracteres del string
        System.out.println(name.length()); // => 4
        System.out.println(user_name.length()); // => 10
        

        // charAt
        // Devuelve el caracter en la posicion que le mandes
        // la primera posicion de los strings en java es el 0
        System.out.println(name.charAt(0)); // => L
        System.out.println(name.charAt(1)); // => u
        System.out.println(name.charAt(2)); // => i
        System.out.println(name.charAt(3)); // => s
        //System.out.println(name.charAt(4)); => Error el indice 4 no se encuentra dentro de nustro string
        
        // Subcadena
        System.out.println(name.substring(2)); // => "is" - Devuelve una subcadena desde la posicion '2' hasta la ultima
        System.out.println(name.substring(1)); // => "uis"
        System.out.println(user_name.substring(1, 5)); // => "gent" - Excluye el caracter de la ultima posicion '5'
        System.out.println(user_name.substring(0, 6)); // => "Agente"
        System.out.println(user_name.substring(7)); // => "707"

        // toUpperCase y toLowerCase
        System.out.println(name.toUpperCase()); // Todo a mayusculas
        System.out.println(name.toLowerCase()); // Todo a minusculas

        // contains
        // Devuelve true o false si el string string en el parentesis se encuentra dentro de nuestro string "Hola a todos"
        System.out.println(user_name.contains("Agente")); // => true
        System.out.println(user_name.contains("Holaa")); // => false
        System.out.println(user_name.contains("AGENTE")); // => false - identifica las mayusculas

        // equals
        // Compara dos strings
        System.out.println(name.equals("Luis")); // => true
        System.out.println(name.equals("LUIS")); // => false
        System.out.println(name.equalsIgnoreCase("LUIS")); // => true - ignora las mayusculas y minusculas

        // == vs. equals
        var a = "hola";
        var b = "hola";
        var c = new String("hola"); // a, b y c son strings iguales que dicen "hola"

        System.out.println(a == b); // => true - a y b son el mismo objeto
        System.out.println(a == c); // => false - c es un nuevo objeto
        // el '==' compara los objetos
        // 'a' y 'b' son strings donde tanto el valor como el objeto coinciden
        // pero 'c' es un nuevo objeto "new String" mientras que 'a' sigue siendo una cadena del sistema 'String'
        // por eso nos devuelve falso

        System.out.println(a.equals(c)); // => true
        // el 'equals' compara el contenido
        // recomendado para comparar strings :)

        // trim
        // Elimina los espacios en blanco al inicio y al final del string
        System.out.println("        Hola a todos        ".trim()); // => "Hola a todos"
        System.out.println("Recuerdas cuando                             ".trim()); // => "Recuerdas cuando"
        System.out.println("y la vez que                                   ".trim()); // => "y la vez que"

        // replace
        // toma un caracter viejo (target:) y lo remplaza por un nuevo caracter (replacement:) dentro del string
        System.out.println("      Hola a todos      ".replace(" ","")); // => "Holaatodos"
        System.out.println("Hola, me llamo Luis".replace("Luis","Agente-707")); // reemplaza "Luis" por "Agente-707"

        // format
        // formateo para strings '%s'
        // formateo para enteros '%d'
        // formateo para decimales (floats) '%f'
        var age = 19;
        String.out.println(String.format("Hola, me llamo %s y tengo %d.", name, age));
        

        

        
    }
}
