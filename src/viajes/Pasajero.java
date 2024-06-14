package src.viajes;

public class Pasajero {
    String nombre;
    String cedula;
    int edad;
    String cuidad;

    public Pasajero() {
    }

    public Pasajero(String nombre, String cedula, int edad, String cuidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.cuidad = cuidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Cuidad: " + cuidad);
    }
}
