package src.viajes;

public class VIP extends Ruta{
    String servicios;
    int espcacio_maleta;
    Boolean maleta_extra;
    Double cargo_extra;

    public VIP() {
    }

    public VIP(String nombre, String cedula, int edad, String cuidad, String codigo, String fecha_salida, String fecha_llegada, int numero_bus, String lugar_salida, String lugar_llegada, Double precio, String servicios, int espcacio_maleta, Boolean maleta_extra, Double cargo_extra) {
        super(nombre, cedula, edad, cuidad, codigo, fecha_salida, fecha_llegada, numero_bus, lugar_salida, lugar_llegada, precio);
        this.servicios = servicios;
        this.espcacio_maleta = espcacio_maleta;
        this.maleta_extra = maleta_extra;
        this.cargo_extra = cargo_extra;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public int getEspcacio_maleta() {
        return espcacio_maleta;
    }

    public void setEspcacio_maleta(int espcacio_maleta) {
        this.espcacio_maleta = espcacio_maleta;
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
        System.out.println("Servicios: " + servicios);
    }

    @Override
    public double precio_total(){
        if (maleta_extra==true){
            Double precioTotal = super.precio_total() * 0.30 + super.precio_total() + cargo_extra;
            System.out.println("Precio total: " + precioTotal);
            return precioTotal;
        }else{
            Double precioTotal = super.precio_total() * 0.30 + super.precio_total();
            System.out.println("Precio total: " + precioTotal);
            return precioTotal;
        }
    }

}
