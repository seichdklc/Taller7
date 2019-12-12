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
public class vehiculoDirector {
    private vehiculoBuilder builder;
    
    public vehiculoDirector(vehiculoBuilder builder){
        this.builder=builder;
    }
    
    public void construirVehiculo(){
        builder.definirVehiculo();
        builder.definirAlmacenamiento();
        builder.definirCarroceria();
    }
    
    public Vehiculo getVehiculo(){
        return builder.getVehiculo();
    }
    
    
    
}
