package PCs_POO_UNI.PC1;

import java.util.Random;

// Ejercicio 1

class EntradaSalida {
    public static void main(String[] args){
        Random ran = new Random();
        int entero;
        float flotante;
        String cadena;
        boolean buleano;
        
        System.out.println("Datos generados aleatoriamente:");
        System.out.println("Entero Flotante Cadena      Buleano");

        int filas = ran.nextInt(6) + 3; 
        int largo;

        for(int j=0;j<filas;j++){
            entero = ran.nextInt(191) + 10;
            flotante = ran.nextFloat(191) + 10;
            largo = ran.nextInt(10) + 1;
            cadena = "";

            for(int i=0;i<largo;i++){
                cadena += (char)(97 + ran.nextInt(25));
            }

            buleano = ran.nextBoolean();

            System.out.printf("%6d%9.3f %-10s %3s\n", entero, flotante, cadena, buleano);
        }
    }
}
