package src;
import src.viajes.*;

public class Main {
    public static void main(String[] args) {
        Normal cliente1 = new Normal("Juan","1726195207",19,"Quito","1234","14/06/2024","15/06/2024",5,"Quito","Cuenca",23.25,"ventana",1,true,5.00);
        ServicioExtra cliente2= new ServicioExtra("Carlos","1736105951",23,"Guayaquil","5678","15/06/2024","16/06/2024",8,"Guayaquil","Ambato",25.25,"Televisión,internet ",2,true,5.00,"Comida");
        Normal cliente3 = new Normal("María", "1726195208", 27, "Cuenca", "9012", "16/06/2024", "17/06/2024", 3, "Cuenca", "Quito", 18.75, "pasillo", 1, false, 4.50);
        ServicioExtra cliente4 = new ServicioExtra("Pedro", "1736105952", 31, "Ambato", "3456", "17/06/2024", "18/06/2024", 6, "Ambato", "Guayaquil", 22.50, "Televisión", 2, true, 4.75, "Comida");
        ServicioExtra cliente6 = new ServicioExtra("Andrés", "1736105953", 29, "Machala", "2468", "19/06/2024", "20/06/2024", 7, "Machala", "Quito", 24.00, "Televisión,internet", 2, false, 5.50, "Comida");

        cliente1.mostrarDatos();
        cliente1.precio_total();
        System.out.println();
        cliente2.mostrarDatos();
        cliente2.precio_total();

        Normal cliente7 = new Normal();
        ServicioExtra cliente8 = new ServicioExtra();
        Normal cliente9 = new Normal();
        ServicioExtra cliente10 = new ServicioExtra();
        Normal cliente11 = new Normal();

        cliente7.setNombre("Pablo");
        cliente7.setCedula("1726195207");
        cliente7.setEdad(19);
        cliente7.setCuidad("Quito");
        cliente7.setCodigo("1234");
        cliente7.setFecha_llegada("14/06/2024");
        cliente7.setFecha_salida("15/06/2024");
        cliente7.setNumero_bus(5);
        cliente7.setLugar_llegada("Cuenca");
        cliente7.setLugar_salida("Salinas");
        cliente7.setSeleccion_asiento("ventana");
        cliente7.setEspacio_maletas(1);
        cliente7.setMaleta_extra(true);
        cliente7.setPrecio(5.00);

        cliente9.setNombre("Lupe");
        cliente9.setCedula("1726195207");
        cliente9.setEdad(19);
        cliente9.setCuidad("Quito");
        cliente9.setCodigo("1234");
        cliente9.setFecha_llegada("14/06/2024");
        cliente9.setFecha_salida("15/06/2024");
        cliente9.setNumero_bus(5);
        cliente9.setLugar_llegada("Cuenca");
        cliente9.setLugar_salida("Quito");
        cliente9.setSeleccion_asiento("ventana");
        cliente9.setEspacio_maletas(1);
        cliente9.setMaleta_extra(true);
        cliente9.setPrecio(25.25);
        cliente9.setCargo_extra(5.00);

        cliente11.setNombre("Lupe");
        cliente11.setCedula("1726195207");
        cliente11.setEdad(19);
        cliente11.setCuidad("Quito");
        cliente11.setCodigo("1234");
        cliente11.setFecha_llegada("14/06/2024");
        cliente11.setFecha_salida("15/06/2024");
        cliente11.setNumero_bus(5);
        cliente11.setLugar_llegada("Cuenca");
        cliente11.setLugar_salida("Quito");
        cliente11.setSeleccion_asiento("ventana");
        cliente11.setEspacio_maletas(1);
        cliente11.setMaleta_extra(true);
        cliente11.setPrecio(25.25);
        cliente11.setCargo_extra(5.00);
    }
}
