package c03_Strings;

public class StrigsExercises {
    public static void main(String[] args){
        //1. Concatena dos cadenas de texto.
        String my_string = "Esta casa ";
        String my_other_string = " 4 pisos";
        System.out.println(my_string + "tiene" + my_other_string);

        //2. Muestra la longitud de una cadena de texto.
        String name = "Luis";
        System.out.println(name.length());

        String user_name = "Agente-707";
        System.out.println(name.length());

        //3. Muestra el primer y último carácter de un string.
        System.out.println(name.charAt(0)); //Primer caracter
        System.out.println(name.charAt(name.length()-1)); //Ultimo caracter

        //4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toUpperCase()); // LUIS
        System.out.println(name.toLowerCase()); // luis

        //5. Comprueba si una cadena de texto contiene una palabra
        String my_string2 = "Hola a todos";
        System.out.println(my_string2.contains("hola"));

        //6. Formatea un string con un entero
        int my_int = 10;
        System.out.println(String.format("Esta caja pesa %d kilos",my_int));

        //7. Elimina los espacios en blanco al principio y al final de un string
        System.out.println("                                                                                                                                   :)                                                                                                           ".trim());

        //8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Agente 707".replace(" ", "-"));
                
        //9. Comprueba si dos strings son iguales.
        String a = "Holaa";
        var b = new String("Holaa");
        System.out.println(a==b); // false
        System.out.println(a.equals(b));

        //10. Comprueba si dos strings tienen la misma longitud.
        String c = "Holaa";
        System.out.println(a.length() == c.length());
        System.out.println(name.length() == user_name.length());
            
    }
}
