package src.viajes;

public class Normal extends Ruta{
    String seleccion_asiento;
    int espacio_maletas;
    Boolean maleta_extra;
    Double cargo_extra;

    public Normal() {
    }

    public Normal(String nombre, String cedula, int edad, String cuidad, String codigo, String fecha_salida, String fecha_llegada, int numero_bus, String lugar_salida, String lugar_llegada, Double precio, String seleccion_asiento, int espacio_maletas, Boolean maleta_extra, Double cargo_extra) {
        super(nombre, cedula, edad, cuidad, codigo, fecha_salida, fecha_llegada, numero_bus, lugar_salida, lugar_llegada, precio);
        this.seleccion_asiento = seleccion_asiento;
        this.espacio_maletas = espacio_maletas;
        this.maleta_extra = maleta_extra;
        this.cargo_extra = cargo_extra;
    }

    public String getSeleccion_asiento() {
        return seleccion_asiento;
    }

    public void setSeleccion_asiento(String seleccion_asiento) {
        this.seleccion_asiento = seleccion_asiento;
    }

    public int getEspacio_maletas() {
        return espacio_maletas;
    }

    public void setEspacio_maletas(int espacio_maletas) {
        this.espacio_maletas = espacio_maletas;
    }

    public Boolean getMaleta_extra() {
        return maleta_extra;
    }

    public void setMaleta_extra(Boolean maleta_extra) {
        this.maleta_extra = maleta_extra;
    }

    public Double getCargo_extra() {
        return cargo_extra;
    }

    public void setCargo_extra(Double cargo_extra) {
        this.cargo_extra = cargo_extra;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Seleccion asiento: " + seleccion_asiento);
        System.out.println("Maletas: " + maleta_extra);
    }

    @Override
    public double precio_total(){
        if (maleta_extra==true){
            Double precioTotal = super.precio_total() + cargo_extra;
            System.out.println("Precio total: " + precioTotal);
            return precioTotal;
        }else{
            Double precioTotal = super.precio_total();
            System.out.println("Precio total: " + precioTotal);
            return precioTotal;
        }
    }
}
