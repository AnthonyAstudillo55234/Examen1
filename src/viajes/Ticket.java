package src.viajes;

public class Ticket extends Pasajero {
    String codigo;
    String fecha_salida;
    String fecha_llegada;
    int numero_bus;

    public Ticket() {
    }

    public Ticket(String nombre, String cedula, int edad, String cuidad, String codigo, String fecha_salida, String fecha_llegada, int numero_bus) {
        super(nombre, cedula, edad, cuidad);
        this.codigo = codigo;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.numero_bus = numero_bus;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public int getNumero_bus() {
        return numero_bus;
    }

    public void setNumero_bus(int numero_bus) {
        this.numero_bus = numero_bus;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Codigo: " + codigo);
        System.out.println("Fecha salida: " + fecha_salida);
        System.out.println("Fecha llegada: " + fecha_llegada);
        System.out.println("Numero bus: " + numero_bus);
    }
}
