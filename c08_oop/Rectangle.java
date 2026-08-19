package c08_oop;

// Ejercicio 7: Solución
public class Rectangle{
    int base, altura;

    public Rectangle(int base, int altura){
        this.altura = altura;
        this.base = base;
    }

    public void área(){
        int x = altura*base;
        System.out.println(String.format("El área del rectangulo es: %d", x));
    }

    public void perímetro(){
        int y = (altura*2) + (base*2);
        System.out.println(String.format("El perímetro del rectangulo es: %d", y));
    }

}
