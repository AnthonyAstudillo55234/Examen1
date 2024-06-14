package src.viajes;

public class ServicioExtra extends VIP{
    String servicio_extra;

    public ServicioExtra() {
    }

    public ServicioExtra(String nombre, String cedula, int edad, String cuidad, String codigo, String fecha_salida, String fecha_llegada, int numero_bus, String lugar_salida, String lugar_llegada, Double precio, String servicios, int espcacio_maleta, Boolean maleta_extra, Double cargo_extra, String servicio_extra) {
        super(nombre, cedula, edad, cuidad, codigo, fecha_salida, fecha_llegada, numero_bus, lugar_salida, lugar_llegada, precio, servicios, espcacio_maleta, maleta_extra, cargo_extra);
        this.servicio_extra = servicio_extra;
    }

    public String getServicio_extra() {
        return servicio_extra;
    }

    public void setServicio_extra(String servicio_extra) {
        this.servicio_extra = servicio_extra;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Servicio Extra: " + servicio_extra);
    }
}
