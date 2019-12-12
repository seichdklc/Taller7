/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

/**
 *
 * @author Luis
 */
public class ChevroletAveo_Builder extends vehiculoBuilder{

    @Override
    public void definirVehiculo() {
        v = new Vehiculo();
        v.marca="Chevrolet";
        v.modelo="Aveo";
    }

    @Override
    public void definirAlmacenamiento() {
        v.motor=1.5;
        v.almacenamiento=1500;
    }

    @Override
    public void definirCarroceria() {
        v.carroceria="G5TT45RE";
    }
    
}
