public class DataTypes {
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

        String myString = "Hola, Java";
        System.out.println(myString);

        // Tipo de dato en tiempo de compilacion

        System.out.println(myString.getClass().getSimpleName());
    }
}
