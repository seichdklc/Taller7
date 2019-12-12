/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

/**
 *
 * @author CltControl
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	vehiculoDirector vd=new vehiculoDirector(new ChevroletSail_Builder());
        vd.construirVehiculo();
        Vehiculo nuevo=vd.getVehiculo();
        
        vehiculoDirector vd2=new vehiculoDirector(new ChevroletSparkt_Builder());
        vd2.construirVehiculo();
        Vehiculo nuevo2=vd2.getVehiculo();
        System.out.println("Vehiculos almacenados:");
        System.out.println(nuevo);
        System.out.println("---------");
        System.out.println(nuevo2);
    }
    
}
