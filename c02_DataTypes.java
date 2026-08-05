public class c02_DataTypes {
    public static void main(String[] args) {

        // Tipos de datos primitivos
        int myInt = 10;
        System.out.println(myInt);

        double myDouble = 21.3;
        System.out.println(myDouble);

        char myChar = 'A';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java"; // Nota: String no es un tipo de dato primitivo, es una clase.
        System.out.println(myString);

        System.out.println(myString.getClass().getSimpleName()); // imprime el tipo de dato de "myString" 
        // => String
        
        // Nota: Esto solo funciona para clases.

        Boolean myBoolean2 = false; // Clase tipo "Boolean"
        System.out.println(myBoolean2);

        Double myDouble2 = 5.12; // Clase tipo "Double"
        System.out.println(myDouble2); 

        System.out.println(myBoolean2.getClass().getSimpleName());
        // => Boolean

        System.out.println(myDouble2.getClass().getSimpleName());
        // => Double

    }
}
