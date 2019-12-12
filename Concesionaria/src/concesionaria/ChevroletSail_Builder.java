package concesionaria;

public class ChevroletSail_Builder extends vehiculoBuilder{
	
    public void definirVehiculo() {
        v = new Vehiculo();
        v.marca="Chevrolet";
        v.modelo="Sail";
    };

    public void definirAlmacenamiento() {
            v.motor=1.4;
            v.almacenamiento=1000;

    };
    public void definirCarroceria() {
    	v.carroceria="1J23KO23";
    };
	
}

