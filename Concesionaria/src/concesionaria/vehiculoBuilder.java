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
public abstract class vehiculoBuilder {
    private Vehiculo v;
    
    public Vehiculo getVehiculo(){
        return v;
    }
    
    public abstract void definirVehiculo();
    public abstract void definirAlmacenamiento();
    public abstract void definirCarroceria();
    
}
