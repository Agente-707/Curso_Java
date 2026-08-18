package c08_oop;

// Ejercicio 1: Solución
public class Book {
    String author;
    String title;

    // Constructor
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public void MostrarDatos(){
        System.out.println("La obra titulada " + title + " pertenece al autor " + author);
    }
  
}
