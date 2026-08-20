package c08_oop.AccesModifiersExercises;

public class AccesModifiersExercises {
    public static void main(String[] args){
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.

        var persona2 = new Person2("Angel",23);

        System.out.println("El nombre del usuario es: " + persona2.getName());
        System.out.println("La edad del usuario es: " + persona2.getAge());

        persona2.setName("Alejandro");
        persona2.setAge(20);

        System.out.println("El nombre del usuario es: " + persona2.getName());
        System.out.println("La edad del usuario es: " + persona2.getAge());
        

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.

        var producto2 = new Product2(-130);
        producto2.setPrice(130);


        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

        var banco = new BankAccount2(200);
        banco.deposit(30);
        banco.withDraw(20);


        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El title debe asigarse solo por el constructor.

        var libro = new Book2("Cien años de soledad");
        System.out.println("El titulo del libro es: " + libro.getTitle());


        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        var temperatura = new Temperature(200);
        temperatura.setCelsius(20);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

        var usuario = new User("Agente-707", "123012301");
        usuario.setUsername("Luis");
        usuario.setPassword("432838453");
        usuario.checkPassword("432838453");


        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        var empleado = new Employee(120);
        empleado.raiseSalary(50);


        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        var rectangulo = new Rectangle2(10, 12);

        rectangulo.calculateArea();

        rectangulo.setHeight(10);
        rectangulo.setWidth(30);

        rectangulo.calculateArea();


        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() true si la nota es mayor o igual a 60.

        var estudiante = new Student2(20);

        if(estudiante.isPassed()){
            System.out.println("El estudiante pasó!");
        }else{
            System.out.println("El estudiante no pasó :(");
        }

        estudiante.setGrade(70);

        if(estudiante.isPassed()){
            System.out.println("El estudiante pasó!");
        }else{
            System.out.println("El estudiante no pasó :(");
        }


        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

        var auto = new Car2(70);
        auto.accelerate(20);
        auto.brake(90);
    }
    
}
