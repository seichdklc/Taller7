package concesionaria;

public class ChevroletSparkt_Builder  extends vehiculoBuilder{
    public void definirVehiculo() {
            v = new Vehiculo();
            v.marca="Chevrolet";
            v.modelo="Sparkt";
    };

    public void definirAlmacenamiento() {
            v.motor=1.2;
            v.almacenamiento=500;

    };
    public void definirCarroceria() {
    	v.carroceria="JWE9EWF8";
    };
}
