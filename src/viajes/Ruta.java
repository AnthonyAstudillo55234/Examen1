package src.viajes;

public class Ruta extends Ticket {
    String lugar_salida;
    String lugar_llegada;
    Double precio;

    public Ruta() {
    }

    public Ruta(String nombre, String cedula, int edad, String cuidad, String codigo, String fecha_salida, String fecha_llegada, int numero_bus, String lugar_salida, String lugar_llegada, Double precio) {
        super(nombre, cedula, edad, cuidad, codigo, fecha_salida, fecha_llegada, numero_bus);
        this.lugar_salida = lugar_salida;
        this.lugar_llegada = lugar_llegada;
        this.precio = precio;
    }

    public String getLugar_salida() {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) {
        this.lugar_salida = lugar_salida;
    }

    public String getLugar_llegada() {
        return lugar_llegada;
    }

    public void setLugar_llegada(String lugar_llegada) {
        this.lugar_llegada = lugar_llegada;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Lugar salida: " + lugar_salida);
        System.out.println("Lugar llegada: " + lugar_llegada);
        System.out.println("Precio: " + precio);
    }

    public double precio_total(){
        Double precioTotal=precio;
        return precioTotal;
    }
}
