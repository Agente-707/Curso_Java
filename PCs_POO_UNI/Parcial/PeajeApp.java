package PCs_POO_UNI.Parcial;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class PeajeApp {
    static List <Vehiculo> vehiculos = new ArrayList<>();
    static Map<String, Double> tiposMontos = new HashMap<>();
    static ArrayList<Camion> camionesGrandes = new ArrayList<>();

    public static void main(String[] args){
        cargarDatos();
    }

    static void cargarDatos(){
        tiposMontos.put("Auto", 0.0);
        tiposMontos.put("Camion", 0.0);
        tiposMontos.put("Moto", 0.0);
        registrarPaso((Vehiculo) new Auto("A1"));
        registrarPaso((Vehiculo) new Camion("C1", 5));
        registrarPaso((Vehiculo) new Camion("C2", 2));
        registrarPaso((Vehiculo) new Camion("C3", 5));
        registrarPaso((Vehiculo) new Moto("M1"));
    }

    static void registrarPaso(Vehiculo v){
        vehiculos.add(v);
        for(Map.Entry mp: tiposMontos.entrySet()){
            if(mp.getKey().equals(v.getTipo())){
                tiposMontos.put((String)mp.getKey(), (double)mp.getValue() + v.calcularTarifa());
                return;
            }
        }
    }

    static void obtenerCamionesGrandes(int ejesMinimos){
        for(Vehiculo ve : vehiculos){
            if(ve.getTipo().equals("Camion") && ejesMinimos < ((Camion)ve).ejes){
                camionesGrandes.add((Camion)ve);
            }
        }
    }

    static void reporteVehiculos(){
        System.out.println("Peaje diario");
        System.out.println("Lista de vehiculos");
        System.out.println("Placa  tipo    Tarifa");

        for(Vehiculo ve : vehiculos){
            System.out.printf("%-6s %-6s %6.1f \n", ve.getPlaca(), ve.getTipo(), ve.calcularTarifa());
        }
    }

    static void reporteTipoMontos(){
        System.out.println("\nMontos cobrados por tipo de vehiculo");
        System.out.println("Tipo    Monto");
        double suma = 0;

        for(Map.Entry ma : tipoMontos.entrySet()){
            suma += (double)ma.getValue();
            System.out.printf("%-6s %6.1f\n", ma.getKey(), ma.getValue());
        }

        System.out.println("------------");
        System.out.printf("Total: %6.1f\n", suma);
    }

    static void reporteCamionesGrandes(){
        System.out.println("\nLista de camiones grandes (con más de 3 ejes)");
        System.out.println("Placa   Tarifa");
        for(Camion lc : camionesGrandes){
            System.out.printf("%-6s %6.1f\n", lc.getPlaca(), lc.calcularTarifa());
        }
    }
    
}

interface Vehiculo{
    String getPlaca();
    double calcularTarifa();
    String getTipo();
}

class Auto implements Vehiculo{
    String patente;

    Auto(String patente){
        this.patente = patente;
    }

    public String getPlaca(){return patente;}
    public double calcularTarifa(){return (double)10;}
    public String getTipo(){return "Auto";}
}

class Camion implements Vehiculo{
    String patente;
    int ejes;

    Camion(String patente, int ejes){
        this.patente = patente;
        this.ejes = ejes;
    }

    public String getPlaca(){return patente;}
    public double calcularTarifa(){return (double)(ejes*10);}
    public String getTipo(){return "Camion";}
}

class Moto implements Vehiculo{
    String patente;

    Moto(String patente){
        this.patente = patente;
    }

    public String getPlaca(){return patente;}
    public double calcularTarifa(){return (double)5;}
    public String getTipo(){return "Moto";}
}