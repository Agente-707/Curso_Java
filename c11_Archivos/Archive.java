package c11_Archivos;

// Librerias para escritura de archivos
import java.io.FileWriter;
import java.io.PrintWriter;

// Librerias para lectura de archivos
import java.io.BufferedReader;
import java.io.FileReader;

// Libreria para el manejo de excepciones
import java.io.IOException;

public class Archive {
    public static void main(String[] args){
        // --- Creacion de un archivo de texto ---
        try (PrintWriter out = new PrintWriter(new FileWriter("my_archive.txt"))){ // => Se crea el archivo my_archive.txt
            out.println("Hola a todos :)"); // => Primera linea del texto en el archivo
            out.println("Bienvenidos a la clase de POO"); // => Segunda linea del texto en el archivo
            System.out.println("Archivo creado con exito"); // => Mensaje de exito

        } catch (IOException e){ // Si el archivo no se puede crear, se captura la excepcion
            System.out.println("Error al crear el archivo: " + e.getMessage()); // => Mensaje de error
        }

        // --- Lectura de un archivo de texto ---
        try (BufferedReader in = new BufferedReader(new FileReader("my_archive.txt"))){ // => Se abre el archivo my_archive.txt
            String line; // => Variable para almacenar cada linea del archivo
            while ((line = in.readLine()) != null){ // => Mientras haya lineas en el archivo
                System.out.println(line); // => Se imprime la linea leida
            }
        } catch (IOException e){ // Si el archivo no se puede leer, se captura la excepcion
            System.out.println("Error al leer el archivo: " + e.getMessage()); // => Mensaje de error
        }
    }
}
